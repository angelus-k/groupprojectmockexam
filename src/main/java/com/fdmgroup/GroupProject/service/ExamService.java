package com.fdmgroup.GroupProject.service;

import java.util.List;

import com.fdmgroup.GroupProject.model.Exam;
import com.fdmgroup.GroupProject.model.ExamQuestion;

public interface ExamService {

	public ExamQuestion getUserAnswerByIndex(Exam Exam, int nr);

	// List<ExamQuestion> createExam(Exam Exam,int nr);

	public void saveExam(Exam Exam);

	public Exam loadExam(int id);

	// public void saveAnswer(Exam exam, String answer,int questionNumber);

	public String nextQuestionStringQuestionNumber(int questionNumber, Exam exam);

	public int nextQuestionNumberQuestionNumber(int questionNumber, Exam exam);

	public String previousQuestionStringQuestionNumber(int questionNumber);

	public int previousQuestionNumberQuestionNumber(int questionNumber, Exam exam);

	public String resultQuestionStringQuestionNumber(int questionNumber, Exam exam);

	// public Exam createSaveLoadExam();

	void saveAnswer(Exam exam, List<Integer> chosenAnswerIds, int questionNumber);

	// Exam createSaveLoadExam(int numberOfQuestions);

	void deleteExam(int eId);

	List<Exam> getAllExams();

	List<ExamQuestion> createExam(Exam exam, Integer typeId, int nr);

	Exam createSaveLoadExam(Integer typeId, int numberOfQuestions);

	public void calcAndSaveAvgResultAndAvgPercentageAndAmount(Exam exam);

	void frequentlyWrongAnswered(Exam exam);

}
