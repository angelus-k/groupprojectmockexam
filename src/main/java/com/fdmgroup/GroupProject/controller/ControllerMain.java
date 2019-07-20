package com.fdmgroup.GroupProject.controller;

import java.security.Principal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fdmgroup.GroupProject.model.Counter;
import com.fdmgroup.GroupProject.model.Exam;
import com.fdmgroup.GroupProject.model.ReportQuestion;
import com.fdmgroup.GroupProject.model.Results;
import com.fdmgroup.GroupProject.model.TypeOfExam;
import com.fdmgroup.GroupProject.model.User;
import com.fdmgroup.GroupProject.repository.ExamQuestionRepository;
import com.fdmgroup.GroupProject.repository.ExamRepository;
import com.fdmgroup.GroupProject.service.ExamQuestionService;
import com.fdmgroup.GroupProject.service.ExamService;
import com.fdmgroup.GroupProject.service.QuestionService;
import com.fdmgroup.GroupProject.service.TypeOfExamService;
import com.fdmgroup.GroupProject.service.UserService;

@Controller
public class ControllerMain {

	private static final String TIMELEFT = "timeleft";

	private static final String QUESTION_NUMBER = "questionNumber";

	private static final String EXAM = "Exam";

	@Autowired
	private ExamService examService;

	@Autowired
	Counter counter;

	@Autowired
	private TypeOfExamService typeOfExamService;

	@Autowired
	UserService userService;

	@Autowired
	ExamQuestionRepository examQuestionRepo;

	@Autowired
	ExamRepository examRepo;

	@Autowired
	ExamQuestionService examQuestionService;

	@Autowired
	QuestionService questionService;

	// @GetMapping("/")
	// public String goToStartPage() {
	//
	// return "disclaimer";
	// }

	@GetMapping("/finish")
	public String gofinishPage() {

		return "finalpage";
	}

	@GetMapping("/chooseexam")
	public String goToChoseExamPage(ModelMap model) {
		List<TypeOfExam> typeOfExamList = typeOfExamService.getAllTypesOfExam();
		model.addAttribute("TypeOfExamList", typeOfExamList);
		return "chooseexam";
	}

	@GetMapping("/abort")
	public String abort() {
		return "disclaimer";
	}

	@PostMapping("/firstquestionpage")
	public String startExamPage(@ModelAttribute ReportQuestion reportQuestion, @RequestParam int toeId, Model model,
			Principal principal) {

		int numberOfQuestions = typeOfExamService.findTypeOfExamById(toeId).getNumberOfQuestions();

		Exam exam = examService.createSaveLoadExam(toeId, numberOfQuestions);
		User user = userService.findUserByEmail(principal.getName());
		int questionNumber = 0;
		if (reportQuestion.getReportText() != null) {
			questionService.addReport(reportQuestion.getReportText(), user, exam.geteQuestions().get(questionNumber).getQuestion());
		}

		model.addAttribute(EXAM, exam);

		
		model.addAttribute(QUESTION_NUMBER, questionNumber);
		counter.setTimeleft(typeOfExamService.findTypeOfExamById(toeId).getDuration());
		counter.checkTimer(typeOfExamService.findTypeOfExamById(toeId).getDuration());
		model.addAttribute(TIMELEFT, counter);

		exam.setUser(user);
		exam.setTypeOfExam(typeOfExamService.findTypeOfExamById(toeId));
		examService.saveExam(exam);

		return "firstquestionpage";
	}

	@PostMapping("/nextquestion")
	public String nextExamQuestion(@ModelAttribute ReportQuestion reportQuestion, Model model,
			@RequestParam("radio") List<Integer> chosenAnswerIds, int eId, int questionNumber, Principal principal) {

		Exam exam = examService.loadExam(eId);
		User user = userService.findUserByEmail(principal.getName());

		if (reportQuestion.getReportText() != null) {
			questionService.addReport(reportQuestion.getReportText(), user, exam.geteQuestions().get(questionNumber + 1).getQuestion());
		}
		if (chosenAnswerIds.size() != 0) {
			// delete first element in chosenAnswerIds
			chosenAnswerIds.remove(0);

			examService.saveAnswer(exam, chosenAnswerIds, questionNumber);
		}
		int questionNumber1 = examService.nextQuestionNumberQuestionNumber(questionNumber, exam);
		model.addAttribute(QUESTION_NUMBER, questionNumber1);
		model.addAttribute(TIMELEFT, counter);
		model.addAttribute(EXAM, exam);

		return examService.nextQuestionStringQuestionNumber(questionNumber, exam);
	}

	@PostMapping("/previousquestion")

	public String previousExamQuestion(Model model, @RequestParam("radio") List<Integer> chosenAnswerIds, int eId,
			int questionNumber) {

		Exam exam = examService.loadExam(eId);

		if (chosenAnswerIds.size() != 0) {

			chosenAnswerIds.remove(0);

			examService.saveAnswer(exam, chosenAnswerIds, questionNumber);
		}

		int questionNumber1 = examService.previousQuestionNumberQuestionNumber(questionNumber, exam);
		model.addAttribute(QUESTION_NUMBER, questionNumber1);
		model.addAttribute(TIMELEFT, counter);
		model.addAttribute(EXAM, exam);

		return examService.previousQuestionStringQuestionNumber(questionNumber);

	}

	@PostMapping("/review")
	public String results(Model model, @RequestParam("radio") List<Integer> chosenAnswerIds, int eId,
			int questionNumber) {

		Exam exam = examService.loadExam(eId);

		if (!chosenAnswerIds.isEmpty()) {
			chosenAnswerIds.remove(0);
			examService.saveAnswer(exam, chosenAnswerIds, questionNumber);
		}

		model.addAttribute(QUESTION_NUMBER, questionNumber);
		model.addAttribute(TIMELEFT, counter);
		model.addAttribute(EXAM, exam);

		return "reviewpage";

	}

	@GetMapping("/userResultspage")
	public String goUserResultsPage(Model model, Principal principal) {

		User user = userService.findUserByEmail(principal.getName());
		model.addAttribute("user", user);

		List<Exam> userExams = examRepo.findExamByUser(user);
		model.addAttribute("userExams", userExams);


		return "userResultspage";
	}

	@GetMapping("//userQuestionResultspage/{eId}")
	public String goUserQuestionResultsPage(Model model, @PathVariable int eId, Principal principal) {

		Exam exam = examService.loadExam(eId);
		model.addAttribute(EXAM, exam);

		return "userQuestionResultspage";
	}

	@GetMapping("/viewStatistics")
	public String viewStatistics(Model model, Principal principal) {

		List<TypeOfExam> allTypes = typeOfExamService.getAllTypesOfExam();
		model.addAttribute("typeList", allTypes);

		return "viewStatistics";

	}

	@GetMapping("/resultspage")
	public String goResultsPage(Model model, @RequestParam int eId) {

		Exam exam = examService.loadExam(eId);

		model.addAttribute(EXAM, exam);
		counter.getTimer().cancel();
		model.addAttribute(TIMELEFT, counter);

		Results results = new Results();

		double percentage = results.correctPercentage(exam);
		exam.setResultValue(percentage);

		examTimeSetter(exam);
		examService.saveExam(exam);

		examService.calcAndSaveAvgResultAndAvgPercentageAndAmount(exam);
		
		examService.frequentlyWrongAnswered(exam);
		
		model.addAttribute("percentage", percentage);

		String mark = results.resultrealExam(percentage);

		model.addAttribute("mark", mark);
		int wrong = (int) results.getWrong();
		model.addAttribute("wrong", wrong);
		int right = (int) results.getRight();
		model.addAttribute("right", right);

		return "resultspage";
	}



	@PostMapping("/resultsreviewpage")
	public String goResultsReviewPage(Model model, int eId) {
		Exam exam = examService.loadExam(eId);
		model.addAttribute(EXAM, exam);
		model.addAttribute(TIMELEFT, counter);
		return "resultsreviewpage";
	}

	@PostMapping("/resultquestion")
	public String resultQuestion(Model model, @RequestParam int eId, int questionNumber) {
		Exam exam = examService.loadExam(eId);

		model.addAttribute(QUESTION_NUMBER, questionNumber);
		model.addAttribute(TIMELEFT, counter);
		model.addAttribute(EXAM, exam);

		return examService.resultQuestionStringQuestionNumber(questionNumber, exam);

	}
	
	private void examTimeSetter(Exam exam) {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);
		exam.setFormatDate(formattedDate);
	}
	

	

}