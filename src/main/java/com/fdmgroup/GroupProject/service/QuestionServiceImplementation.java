package com.fdmgroup.GroupProject.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fdmgroup.GroupProject.model.Question;
import com.fdmgroup.GroupProject.model.ReportQuestion;
import com.fdmgroup.GroupProject.model.User;
import com.fdmgroup.GroupProject.repository.QuestionRepository;
import com.fdmgroup.GroupProject.repository.ReportQuestionRepository;

@Service
public class QuestionServiceImplementation implements QuestionService {

	@Autowired
	private QuestionRepository questionRepo;

	@Autowired
	private ReportQuestionRepository reportQuestionRepo;

	public List<Question> getAllQuestions() {

		return questionRepo.findAll();
	}

	public void newQuestion(Question question) {

		questionRepo.save(question);
	}

	public void deleteQuestion(int id) {

		questionRepo.deleteById(id);
	}

	public List<Question> getExamQuestions(int nr) {
		List<Question> list = getAllQuestions();
		Collections.shuffle(list);
		List<Question> list2 = new ArrayList<>();
		for (int i = 0; i < nr; i++) {
			list2.add(list.get(i));
		}

		return list2;
	}

	@Override
	public Question findQuestionbyId(Integer qId) {

		Question question1;
		Optional<Question> question2 = questionRepo.findById(qId);
		if (question2.isPresent()) {
			question1 = question2.get();
			return question1;
		}

		else {
			return null;

		}
	}

	@Override
	public void addReport(String report, User user, Question question) {
		System.out.println("aaaaaaaaaaaaaaaaaaTryToFindQuestionByInteger");

		System.out.println("aaaaaaaaaaaaaaaaaaBeforeCreatingReport");
		ReportQuestion reportQ1 = new ReportQuestion();
		reportQ1.setReportText(report);
		if (user != null) {
			System.out.println("aaaaaaaaaaaaaaaaaaIfUserIdnotNUllSAFE");
			reportQ1.setUser(user);
		}
		reportQ1.setQuestion(question);

		try {
			reportQuestionRepo.save(reportQ1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<ReportQuestion> findAllReports() {
		return reportQuestionRepo.findAll();
	}

	@Override
	public void deleteReport(Integer rId) {
		reportQuestionRepo.deleteById(rId);
	}

}
