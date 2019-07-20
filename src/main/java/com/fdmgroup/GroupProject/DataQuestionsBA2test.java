package com.fdmgroup.GroupProject;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.fdmgroup.GroupProject.model.Answer;
import com.fdmgroup.GroupProject.model.Question;
import com.fdmgroup.GroupProject.model.TypeOfExam;
import com.fdmgroup.GroupProject.service.QuestionService;
import com.fdmgroup.GroupProject.service.TypeOfExamService;

@Component
public class DataQuestionsBA2test implements ApplicationRunner {

	@Autowired
	QuestionService questionService;

	@Autowired
	TypeOfExamService typeOfExamService;

	public void run(ApplicationArguments args) throws Exception {

		TypeOfExam typeOfExam = new TypeOfExam();
		typeOfExam.setDuration(3600);
		typeOfExam.setNumberOfQuestions(5);
		typeOfExam.setExamType("BAExam2");
		typeOfExamService.saveTypeOfExam(typeOfExam);

		// Module 1-4
		Question q1 = new Question();
		q1.setQuestionText(
				"When running workshops it is useful to have someone with a role that includes specific responsibility for keeping attendees focused on achieving the objective of the workshop. Which of the following terms describes this role?");
		q1.setNumberOfCorrectAnswers(1);
		Answer a1 = new Answer("The arbitrator", 0);
		Answer b1 = new Answer("The scribe", 0);
		Answer c1 = new Answer("The stakeholder", 0);
		Answer d1 = new Answer("The facilitator", 1);
		List<Answer> ansList = Arrays.asList(a1, b1, c1, d1);
		q1.setPossibleAnswers(ansList);
		q1.setTypeOfExam(typeOfExam);
//		q1.setComplexity(4);
		questionService.newQuestion(q1);

		Question q2 = new Question();
		q2.setQuestionText("In which of the following circumstances do buyers have high bargaining power?");
		q2.setNumberOfCorrectAnswers(1);
		Answer a2 = new Answer("When available sources of supply are available and easy to find", 1);
		Answer b2 = new Answer("When the cost of a product or service is low", 0);
		Answer c2 = new Answer("When switching costs are high", 0);
		Answer d2 = new Answer("When the supplier brand is powerful", 0);
		List<Answer> ansList2 = Arrays.asList(a2, b2, c2, d2);
		q2.setPossibleAnswers(ansList2);
		q2.setTypeOfExam(typeOfExam);
//		q2.setComplexity(4);
		questionService.newQuestion(q2);

		Question q3 = new Question();
		q3.setQuestionText(
				"The required competencies of a business analyst are classified into three categories. Which of the following is one of these three categories?");
		q3.setNumberOfCorrectAnswers(1);
		Answer a3 = new Answer("Management Qualities", 0);
		Answer b3 = new Answer("Business Knowledge", 1);
		Answer c3 = new Answer("IT Skills", 0);
		Answer d3 = new Answer("Project Skills", 0);
//		q3.setComplexity(4);
		List<Answer> ansList3 = Arrays.asList(a3, b3, c3, d3);
		q3.setPossibleAnswers(ansList3);

		q3.setTypeOfExam(typeOfExam);
		questionService.newQuestion(q3);

		Question q4 = new Question();
		q4.setQuestionText(
				"In the Capability Maturity Model Integration (CMMI) for Business Analysis, which type of process represents techniques and processes that might be reused by the Business Analyst?");
		q4.setNumberOfCorrectAnswers(1);
		Answer a4 = new Answer("Defined Process", 0);
		Answer b4 = new Answer("Managed Process", 1);
		Answer c4 = new Answer("Qualitatively Managed Process", 0);
		Answer d4 = new Answer("Optimising Process", 0);
		List<Answer> ansList4 = Arrays.asList(a4, b4, c4, d4);
		q4.setPossibleAnswers(ansList4);

		q4.setTypeOfExam(typeOfExam);
		questionService.newQuestion(q4);

		Question q5 = new Question();
		q5.setQuestionText(
				"An analyst investigating a finance system wishes to build rapport with individual stakeholders and investigate in detail each stakeholder's views. Which of the following techniques should the analyst use?");
		q5.setNumberOfCorrectAnswers(2);
		Answer a5 = new Answer("Questionnaires", 1);
		Answer b5 = new Answer("Interviewing", 1);
		Answer c5 = new Answer("Special purpose records", 0);
		Answer d5 = new Answer("Document analysis", 0);
		List<Answer> ansList5 = Arrays.asList(a5, b5, c5, d5);
		q5.setPossibleAnswers(ansList5);
		q5.setTypeOfExam(typeOfExam);
		questionService.newQuestion(q5);

		Question q6 = new Question();
		q6.setQuestionText(
				"A convenience food manufacturer has undertaken a strategic analysis study and has identified a threat from groups lobbying against the use of packaging for food products. Which of thePESTLE categories would have helped highlight this threat?");
		q6.setNumberOfCorrectAnswers(1);
		Answer a6 = new Answer("Legal", 0);
		Answer b6 = new Answer("Environmental", 1);
		Answer c6 = new Answer("Technological", 0);
		Answer d6 = new Answer("Economic", 0);
		List<Answer> ansList6 = Arrays.asList(a6, b6, c6, d6);
		q6.setPossibleAnswers(ansList6);
		q6.setTypeOfExam(typeOfExam);
		questionService.newQuestion(q6);

		TypeOfExam anotherExam = new TypeOfExam();
		anotherExam.setDuration(10200);
		anotherExam.setNumberOfQuestions(4);
		anotherExam.setExamType("NewExam");
		typeOfExamService.saveTypeOfExam(anotherExam);
		
		 Question q7 = new Question();
		 q7.setQuestionText("Which of the following integers are multiples of both 2 and 3? Indicate all such integers.?");
		 Answer a7 = new Answer("8", 0);
		 Answer b7 = new Answer("9", 0);
		 Answer c7 = new Answer("12", 1);
		 Answer d7 = new Answer("18", 1);
		 Answer e7 = new Answer("21", 0);
		 Answer f7 = new Answer("36", 1);
		 List<Answer> ansList7 = Arrays.asList(a7, b7, c7, d7, e7, f7);
		 q7.setNumberOfCorrectAnswers(3);
		 q7.setPossibleAnswers(ansList7);
		 q7.setTypeOfExam(anotherExam); 
		 questionService.newQuestion(q7);
		
		 Question q8 = new Question();
		 q8.setQuestionText("Each employee of a certain company is in either Department X or Department Y, and there are more than twice as many employees in Department X as in Department Y. The average (arithmetic mean) salary is $25,000 for the employees in Department X and $35,000 for the employees in Department Y. Which of the following amounts could be the average salary for all of the employees of the company?Indicate all such amounts.");
		 Answer a8 = new Answer("$26,000", 1);
		 Answer b8 = new Answer("$28,000", 1);
		 Answer c8 = new Answer("$29,000", 0);
		 Answer d8 = new Answer("$30,000", 0);
		 Answer e8 = new Answer("$31,000", 0);
		 Answer f8 = new Answer("$32,000", 0);
		 List<Answer> ansList8 = Arrays.asList(a8, b8, c8, d8, e8, f8);
		 q8.setNumberOfCorrectAnswers(2);
		 q8.setPossibleAnswers(ansList8);
		 q8.setTypeOfExam(anotherExam);  
		 questionService.newQuestion(q8);
		
		 Question q9 = new Question();
		 q9.setQuestionText("In how many different ways can 3 identical green shirts and 3 identical red shirts be distributed among 6 children such that each child receives a shirt?");
		 Answer a9 = new Answer("20", 1);
		 Answer b9 = new Answer("40", 0);
		 Answer c9 = new Answer("216", 0);
		 Answer d9 = new Answer("720", 0);
		 Answer e9 = new Answer("729", 0);
		 List<Answer> ansList9 = Arrays.asList(a9, b9, c9, d9, e9);
		 q9.setNumberOfCorrectAnswers(1);
		 q9.setPossibleAnswers(ansList9);
		 q9.setTypeOfExam(anotherExam);
		 questionService.newQuestion(q9);
		 
		 Question q10 = new Question();
		 q10.setQuestionText("A popular website requires users to create a password consisting of digits only. If no digit may be repeated and each password must be at least 9 digits long, how many passwords are possible?");
		 Answer a10 = new Answer("9! + 10!", 0);
		 Answer b10 = new Answer("2 × 10!", 1);
		 Answer c10 = new Answer("9! × 10!", 0);
		 Answer d10 = new Answer("19!", 0);
		 Answer e10 = new Answer("20!", 0);
		 List<Answer> ansList10 = Arrays.asList(a10, b10, c10, d10, e10);
		 q10.setNumberOfCorrectAnswers(1);
		 q10.setPossibleAnswers(ansList10);
		 q10.setTypeOfExam(anotherExam);  
		 questionService.newQuestion(q10);
		
				
	}

}
