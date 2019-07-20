package com.fdmgroup.GroupProject.service;
//
//import static org.junit.Assert.*;
//import static org.mockito.Mockito.*;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.fdmgroup.GroupProject.model.BAExam;
//import com.fdmgroup.GroupProject.model.BAExamQuestion;
//import com.fdmgroup.GroupProject.model.BAQuestion;
//import com.fdmgroup.GroupProject.repository.BAExamRepository;
//import com.fdmgroup.GroupProject.repository.BAQuestionRepository;
//
//@ContextConfiguration(classes = BAExamServiceImplementation.class)
//@RunWith(SpringRunner.class)
//public class BAExamServiceImplementationTest {
//	
//	@Autowired
//	private BAExamService bAExamService; 
//
//	@MockBean
//	private BAQuestionRepository repoBAQuestion;
//	
//	@MockBean
//	private BAExamRepository repoBAExam;
//	
//	List<BAQuestion> listTest;
//	List<BAQuestion> listTest40;
//	List<BAExamQuestion> listBAExamQuestion;
//	List<BAExamQuestion> listBAExamQuestion3;
//	BAQuestion q1;
//	BAExamQuestion BAq1;
//	BAExam mockExam;
//	int examId = 1;
//	String answerA="A";
//	String answerB="B";
//	String answerC="C";
//	String answerD="D";
//	String answerE="E";
//	int questionNumber=0;
//	
//	@Before
//	public void setup(){
//		listTest= new ArrayList<>();
//		q1 = new BAQuestion();
//		q1.setQuestion("When running workshops it is useful to have someone with a role that includes specific responsibility for keeping attendees focused on achieving the objective of the workshop. Which of the following terms describes this role?");
//		q1.setA("The arbitrator");
//		q1.setB("The scribe");
//		q1.setC("The stakeholder");
//		q1.setD("The facilitator");
//		q1.setModule("");
//		q1.setCorrectAnswer("The facilitator");
//		listTest.add(q1);
//		listTest40= new ArrayList<>();
//		for(int i=1;i<41;i++){listTest40.add(q1);}
//		BAq1= new BAExamQuestion(q1);
//		mockExam = mock(BAExam.class);
//		listBAExamQuestion= new ArrayList<>();
//		listBAExamQuestion.add(BAq1);
//		listBAExamQuestion3= new ArrayList<>();
//		listBAExamQuestion3.add(BAq1);
//		listBAExamQuestion3.add(BAq1);
//		listBAExamQuestion3.add(BAq1);
//	}
//	
//	@Test
//	public void createBAExamTest(){
//		
//		
//		when(repoBAQuestion.findAll()).thenReturn(listTest);
//		
//		List<BAExamQuestion> testList =		bAExamService.createBAExam(new BAExam(),1);
//		verify(repoBAQuestion,times(1)).findAll();
//		
//		assertEquals(testList.size(),1);
//		
//	}
//
//	@Test
//	public void saveBAExamTest(){
//		
//		bAExamService.saveBAExam(mockExam);
//		verify(repoBAExam,times(1)).save(mockExam);
//	}
//	
//	@Test
//	public void loadBAExamTest(){
//		when(repoBAExam.getOne(examId)).thenReturn(mockExam);
//		bAExamService.loadBAExam(examId);
//		verify(repoBAExam,times(1)).getOne(examId);
//	}
//	
//	@Test
//	public void saveAnswerATest(){
//		
//		when(mockExam.getqExam()).thenReturn(listBAExamQuestion);
//		bAExamService.saveAnswer(mockExam, answerA, questionNumber);
//		verify(mockExam,times(3)).getqExam();
//		assertEquals(true,mockExam.getqExam().get(questionNumber).isAnswered());
//		assertEquals(mockExam.getqExam().get(questionNumber).getbAQuestion().getA(),mockExam.getqExam().get(questionNumber).getAnswerGiven());
//	}
//	
//	@Test
//	public void saveAnswerBTest(){
//		
//		when(mockExam.getqExam()).thenReturn(listBAExamQuestion);
//		bAExamService.saveAnswer(mockExam, answerB, questionNumber);
//		verify(mockExam,times(3)).getqExam();
//		assertEquals(true,mockExam.getqExam().get(questionNumber).isAnswered());
//		assertEquals(mockExam.getqExam().get(questionNumber).getbAQuestion().getB(),mockExam.getqExam().get(questionNumber).getAnswerGiven());
//	}
//	
//	@Test
//	public void saveAnswerCTest(){
//		
//		when(mockExam.getqExam()).thenReturn(listBAExamQuestion);
//		bAExamService.saveAnswer(mockExam, answerC, questionNumber);
//		verify(mockExam,times(3)).getqExam();
//		assertEquals(true,mockExam.getqExam().get(questionNumber).isAnswered());
//		assertEquals(mockExam.getqExam().get(questionNumber).getbAQuestion().getC(),mockExam.getqExam().get(questionNumber).getAnswerGiven());
//	}
//	
//	@Test
//	public void saveAnswerDTest(){
//		
//		when(mockExam.getqExam()).thenReturn(listBAExamQuestion);
//		bAExamService.saveAnswer(mockExam, answerD, questionNumber);
//		verify(mockExam,times(3)).getqExam();
//		assertEquals(true,mockExam.getqExam().get(questionNumber).isAnswered());
//		assertEquals(mockExam.getqExam().get(questionNumber).getbAQuestion().getD(),mockExam.getqExam().get(questionNumber).getAnswerGiven());
//	}
//	
//	@Test
//	public void saveAnswerETest(){
//		
//		when(mockExam.getqExam()).thenReturn(listBAExamQuestion);
//		bAExamService.saveAnswer(mockExam, answerE, questionNumber);
//		verify(mockExam,times(0)).getqExam();
//		assertEquals(false,mockExam.getqExam().get(questionNumber).isAnswered());
//		assertEquals(null,mockExam.getqExam().get(questionNumber).getAnswerGiven());
//	}
//	
//	@Test
//	public void nextQuestionStringQuestionNumberTest(){
//		assertEquals("reviewpage",bAExamService.nextQuestionStringQuestionNumber(questionNumber, mockExam));
//		assertEquals("questionspage",bAExamService.nextQuestionStringQuestionNumber(-2, mockExam));
//	}
//	
//	@Test
//	public void nextQuestionNumberQuestionNumberTest(){
//		assertEquals(questionNumber,bAExamService.nextQuestionNumberQuestionNumber(questionNumber, mockExam));
//		assertEquals(-1,bAExamService.nextQuestionNumberQuestionNumber(-2, mockExam));
//	}
//	
//	@Test
//	public void previousQuestionStringQuestionNumberTest(){
//		assertEquals(bAExamService.previousQuestionStringQuestionNumber(questionNumber),"firstquestionpage");
//		assertEquals(bAExamService.previousQuestionStringQuestionNumber(2),"questionspage");
//	}
//	
//	@Test
//	public void previousQuestionNumberQuestionNumberTest(){
//		assertEquals(bAExamService.previousQuestionNumberQuestionNumber(questionNumber, mockExam),-1);
//		
//	}
//	
//	@Test
//	public void resultQuestionStringQuestionNumberTest(){
//		when(mockExam.getqExam()).thenReturn(listBAExamQuestion3);
//		assertEquals(bAExamService.resultQuestionStringQuestionNumber(questionNumber, mockExam),"resultsquestionpage");
//		assertEquals(bAExamService.resultQuestionStringQuestionNumber(-1, mockExam),"resultsreviewpage");
//		assertEquals(bAExamService.resultQuestionStringQuestionNumber(3, mockExam),"resultsreviewpage");
//	}
//	
//
//}
