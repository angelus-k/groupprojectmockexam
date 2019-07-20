package com.fdmgroup.GroupProject.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.GroupProject.model.Answer;
import com.fdmgroup.GroupProject.model.Exam;
import com.fdmgroup.GroupProject.model.ExamQuestion;
import com.fdmgroup.GroupProject.model.Question;
import com.fdmgroup.GroupProject.repository.AnswerRepository;
import com.fdmgroup.GroupProject.repository.ExamRepository;
import com.fdmgroup.GroupProject.repository.QuestionRepository;

@Service
public class ExamServiceImplementation implements ExamService {

	@Autowired
	private QuestionRepository repoQuestion;

	@Autowired
	private ExamRepository examRepo;

	@Autowired
	private AnswerRepository answerRepo;

	@Autowired
	private TypeOfExamService typeOfExamService;

	@Override
	public ExamQuestion getUserAnswerByIndex(Exam exam, int index) {
		return exam.geteQuestions().get(index);
	}

	@Override
	public List<ExamQuestion> createExam(Exam exam, Integer typeId, int nr) {
		// the number has to be the type id that calls upon the questions
		// belonging to a certain exam type
		List<Question> list2 = repoQuestion.findQuestionByTypeOfExam(typeOfExamService.findTypeOfExamById(typeId));
		Collections.shuffle(list2); // shuffle before adding the Questions to
									// the list!
		Set<Question> list = new HashSet<>();
		int totalComplexity = 0;
		int counter = 0;
		int roundedValue = Math.round(nr / 2);
		for (Question q : list2) {
			totalComplexity = totalComplexity + q.getComplexity();
		}

		Integer avgComplexity = totalComplexity / list2.size();
		for (Question q : list2) {

			if (counter <= roundedValue) {
				if (q.getComplexity() >= avgComplexity) {
					list.add(q);
				}
				counter++;
			}

			else if (counter > roundedValue && counter < nr + 1) {
				if (q.getComplexity() <= avgComplexity) {
					list.add(q);
				} else {
					list.add(q);
					counter++;
				}
			}
		}
		List<Question> newList = new ArrayList<>(list);
		Collections.shuffle(newList);
		for (int i = 0; i < nr; i++) {

			exam.geteQuestions().add(new ExamQuestion(newList.get(i)));

			List<Answer> answers = exam.geteQuestions().get(i).getQuestion().getPossibleAnswers();
			Collections.shuffle(answers);
		}

		return exam.geteQuestions();
	}

	public void saveExam(Exam Exam) {
		examRepo.save(Exam);
	}

	@Override
	public Exam loadExam(int examId) {
		Exam exam = examRepo.getOne(examId);
		Collections.sort(exam.geteQuestions());
		return exam;
	}

	@Override
	public void saveAnswer(Exam exam, List<Integer> chosenAnswerIds, int questionNumber) {

		if (!chosenAnswerIds.isEmpty()) {
			exam.geteQuestions().get(questionNumber).setAnswered(true);
			if (chosenAnswerIds.size() == 1) {
				List<Answer> chosenAnswers = new ArrayList<>();
				chosenAnswers.add(answerRepo.getOne(chosenAnswerIds.get(0)));
				exam.geteQuestions().get(questionNumber).setChosenAnswers(chosenAnswers);

			} else {
				List<Answer> chosenAnswers = new ArrayList<>();
				for (Integer id : chosenAnswerIds) {
					chosenAnswers.add((answerRepo.getOne(id)));
				}
				exam.geteQuestions().get(questionNumber).setChosenAnswers(chosenAnswers);
			}

		}
		saveExam(exam);

	}

	@Override
	public String nextQuestionStringQuestionNumber(int questionNumber, Exam exam) {
		if (questionNumber + 1 < exam.geteQuestions().size()) {

			return "questionspage";

		}

		else {

			return "reviewpage";

		}

	}

	@Override
	public int nextQuestionNumberQuestionNumber(int questionNumber, Exam exam) {
		if (questionNumber + 1 < exam.geteQuestions().size()) {
			questionNumber += 1;

			return questionNumber;

		} else {

			return questionNumber;

		}
	}

	@Override
	public String previousQuestionStringQuestionNumber(int questionNumber) {
		if (questionNumber > 0) {

			return "questionspage";
		} else {

			return "firstquestionpage";

		}
	}

	@Override
	public int previousQuestionNumberQuestionNumber(int questionNumber, Exam exam) {
		questionNumber -= 1;
		return questionNumber;
	}

	@Override
	public String resultQuestionStringQuestionNumber(int questionNumber, Exam exam) {
		if (questionNumber < exam.geteQuestions().size() && questionNumber >= 0) {

			return "resultsquestionpage";
		} else {

			return "resultsreviewpage";

		}
	}

	@Override
	public Exam createSaveLoadExam(Integer typeId, int numberOfQuestions) {
		Exam exam = new Exam();
		createExam(exam, typeId, numberOfQuestions);
		saveExam(exam);
		return loadExam(exam.geteId());
	}

	@Override
	public List<Exam> getAllExams() {
		return examRepo.findAll();
	}

	@Override
	public void deleteExam(int eId) {
		examRepo.deleteById(eId);

	}

	@Override
	public void calcAndSaveAvgResultAndAvgPercentageAndAmount(Exam exam) {
		int avgResult = typeOfExamService.calcAvgResults(examRepo.findAllByTypeOfExam(exam.getTypeOfExam()));
		int avgPassPercentage = typeOfExamService
				.calcAvgPassPercentage(examRepo.findAllByTypeOfExam(exam.getTypeOfExam()));
		int amountExecutedTests = typeOfExamService
				.calcAmountExecutedTests(examRepo.findAllByTypeOfExam(exam.getTypeOfExam()));

		typeOfExamService.saveAverageResult(exam.getTypeOfExam(), avgResult);
		typeOfExamService.saveAveragePassPercentage(exam.getTypeOfExam(), avgPassPercentage);
		typeOfExamService.saveAmountExecutedTests(exam.getTypeOfExam(), amountExecutedTests);

	}

	@Override
	public void frequentlyWrongAnswered(Exam exam) {
		int count = 1;
		for (ExamQuestion eq : exam.geteQuestions()) {
			if (!(eq.isCorrectAnswered())) {
				eq.getQuestion().setComplexity(eq.getQuestion().getComplexity() + count);
				repoQuestion.save(eq.getQuestion());
			}
		}
	}
}
