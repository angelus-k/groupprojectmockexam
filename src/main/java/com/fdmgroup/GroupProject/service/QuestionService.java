package com.fdmgroup.GroupProject.service;

import java.util.List;

import com.fdmgroup.GroupProject.model.Question;
import com.fdmgroup.GroupProject.model.ReportQuestion;
import com.fdmgroup.GroupProject.model.User;



public interface QuestionService {

	List<Question> getAllQuestions();

	void newQuestion(Question question);

	void deleteQuestion(int id);
	
	public List<Question> getExamQuestions(int nr);

	Question findQuestionbyId(Integer qId);


	void addReport(String report, User user, Question question);

	List<ReportQuestion> findAllReports();



	void deleteReport(Integer rId);

	
}
