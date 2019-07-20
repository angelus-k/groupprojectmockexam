//package com.fdmgroup.GroupProject.controller;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
//import static org.mockito.Mockito.*;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import com.fdmgroup.GroupProject.model.Exam;
//import com.fdmgroup.GroupProject.model.ExamQuestion;
//import com.fdmgroup.GroupProject.model.Question;
//import com.fdmgroup.GroupProject.model.Counter;
//import com.fdmgroup.GroupProject.service.ExamService;
//
//
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(ControllerMain.class)
//public class ControllerMainTest {
//	
//	@Autowired
//	MockMvc mockMvc;
//	
//	@MockBean
//	ExamService examService;
//	
//	@MockBean
//	Counter counter;
//	
//	@Test
//	public void goToStartPageTest() throws Exception {
//		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("disclaimer"));
//	}
//	
//	@Test
//	public void goToFinishPageTest() throws Exception {
//		mockMvc.perform(get("/finish")).andExpect(status().isOk()).andExpect(view().name("finalpage"));
//	}
//	
//	@Test
//	public void goToChoseExamPageTest() throws Exception {
//		mockMvc.perform(get("/chooseexam")).andExpect(status().isOk()).andExpect(view().name("chooseexam"));	
//	}
//	
//	@Test
//	public void abortTest() throws Exception {
//		mockMvc.perform(get("/abort")).andExpect(status().isOk()).andExpect(view().name("disclaimer"));
//	}
//	
//	@Test
//	public void startExamPageTest() throws Exception {
//		mockMvc.perform(get("/firstquestionpage")).andExpect(status().isOk()).andExpect(view().name("firstquestionpage"));
//	}
//	
//	@Test
//	public void resultsReviewPageTest() throws Exception{
//		mockMvc.perform(post("/resultsreviewpage").param("model","whatever").param("examId","1")).andExpect(status().isOk()).andExpect(view().name("resultsreviewpage"));
//	}
//
//
//	@Test
//	public void resultQuestionPageTest() throws Exception{
//		Exam exam = mock(Exam.class);
//		when(examService.resultQuestionStringQuestionNumber(0, exam)).thenReturn("resultsreviewpage");
//		mockMvc.perform(post("/resultquestion").param("model","whatever").param("examId","1").param("questionNumber","0")).andExpect(status().isOk()).andExpect(view().name("resultquestion"));
//	}
//	
////	@Test
////	public void resultQuestionPageTest2() throws Exception{
////		Exam exam = mock(Exam.class);
////		
////		Question q1 = new Question();
////		q1.setQuestion("When running workshops it is useful to have someone with a role that includes specific responsibility for keeping attendees focused on achieving the objective of the workshop. Which of the following terms describes this role?");
////		q1.setA("The arbitrator");
////		q1.setB("The scribe");
////		q1.setC("The stakeholder");
////		q1.setD("The facilitator");
////		q1.setModule("");
////		q1.setCorrectAnswer("The facilitator");
////		BAExamQuestion BAq1= new BAExamQuestion(q1);
////		exam.addqExam(BAq1);
////		exam.addqExam(BAq1);
////		exam.addqExam(BAq1);
////		
////		when(examService.loadBAExam(1)).thenReturn(exam);
////		when(examService.resultQuestionStringQuestionNumber(0, exam)).thenReturn("resultsreviewpage");
////		mockMvc.perform(post("/resultquestion").param("model","whatever").param("examId","1").param("questionNumber","0")).andExpect(status().isOk()).andExpect(view().name("resultsreviewpage"));
////	}
//	
//	@Test
//	public void nextQuestionPageTest() throws Exception{
//		Exam exam = mock(Exam.class);
//		when(examService.loadExam(1)).thenReturn(exam);
//		when(examService.nextQuestionNumberQuestionNumber(0, exam)).thenReturn(0);
//		when(examService.nextQuestionStringQuestionNumber(0, exam)).thenReturn("questionspage");
//		mockMvc.perform(post("/nextquestion").param("model","whatever").param("radio","A").param("examId","1").param("questionNumber","0")).andExpect(status().isOk()).andExpect(view().name("questionspage"));
//	}
//	
//	@Test
//	public void nextQuestionPageTest2() throws Exception{
//		Exam exam = mock(Exam.class);
//		when(examService.loadExam(1)).thenReturn(exam);
//		when(examService.nextQuestionNumberQuestionNumber(0, exam)).thenReturn(45);
//		when(examService.nextQuestionStringQuestionNumber(45, exam)).thenReturn("reviewpage");
//		mockMvc.perform(post("/nextquestion").param("model","whatever").param("radio","A").param("examId","1").param("questionNumber","45")).andExpect(status().isOk()).andExpect(view().name("reviewpage"));
//	}
//	
//	@Test
//	public void previousQuestionPageTest() throws Exception{
//		Exam exam = mock(Exam.class);
//		when(examService.loadExam(1)).thenReturn(exam);
//		when(examService.previousQuestionStringQuestionNumber(0)).thenReturn("firstquestionpage");
//		mockMvc.perform(post("/previousquestion").param("model","whatever").param("radio","A").param("examId","1").param("questionNumber","0")).andExpect(status().isOk()).andExpect(view().name("firstquestionpage"));
//	}
//	
//	@Test
//	public void previousQuestionPageTest2() throws Exception{
//		Exam exam = mock(Exam.class);
//		when(examService.loadExam(1)).thenReturn(exam);
//		when(examService.previousQuestionStringQuestionNumber(0)).thenReturn("questionspage");
//		mockMvc.perform(post("/previousquestion").param("model","whatever").param("radio","A").param("examId","1").param("questionNumber","0")).andExpect(status().isOk()).andExpect(view().name("questionspage"));
//	}
//	
//	@Test
//	public void reviewPageTest() throws Exception{
//		mockMvc.perform(post("/review").param("model","whatever").param("radio","A").param("examId","1").param("questionNumber","0")).andExpect(status().isOk()).andExpect(view().name("reviewpage"));
//	}
//	
//}
