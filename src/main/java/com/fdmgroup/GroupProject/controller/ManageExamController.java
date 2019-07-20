package com.fdmgroup.GroupProject.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.View;
import com.fdmgroup.GroupProject.model.Answer;
import com.fdmgroup.GroupProject.model.Question;
import com.fdmgroup.GroupProject.model.TypeOfExam;
import com.fdmgroup.GroupProject.service.AnswerService;
import com.fdmgroup.GroupProject.service.ExamService;
import com.fdmgroup.GroupProject.service.QuestionService;
import com.fdmgroup.GroupProject.service.TypeOfExamService;

@Controller
public class ManageExamController {

	@Autowired
	TypeOfExamService typeOfExamService;

	@Autowired
	QuestionService questionService;

	@Autowired
	AnswerService answerService;

	@Autowired
	ExamService examService;

	@GetMapping("/manageExam")
	public String manageExams(ModelMap model) {
		populateExams(model);
		return "manageExam";
	}

	@PostMapping("/manageExamProcess")
	public String addExam(HttpServletRequest request) {
		request.setAttribute(
			      View.RESPONSE_STATUS_ATTRIBUTE, HttpStatus.TEMPORARY_REDIRECT);
		return  "redirect:/manageExam";
	}
	@PostMapping("/manageExam")
	public String redirectaddExam(ModelMap model, @ModelAttribute TypeOfExam typeOfExam) {
		if(typeOfExam.getExamType() != null){
			typeOfExamService.saveTypeOfExam(typeOfExam);
			populateExams(model);
		}
		else{	
			populateExams(model);
		}
		return "manageExam";
		
	}

	private void populateExams(ModelMap model) {
		List<TypeOfExam> typeOfExamList = typeOfExamService.getAllTypesOfExam();
		model.addAttribute("TypeOfExamList", typeOfExamList);
	}

	@GetMapping("/deleteConfirmation/{typeId}")
	public String deleteConfirm(@PathVariable Integer typeId, ModelMap model) {
		model.addAttribute("typeId", typeId);
		return "deleteConfirmation";
	}

	@PostMapping("/delete/{typeId}")
	public String deleteExam(@PathVariable Integer typeId, ModelMap model) {
		List<Question> questions = new ArrayList<>();
		List<Question> questionsFilteredExam = new ArrayList<>();
		questions = questionService.getAllQuestions();

		for (Question question : questions) {
			Integer typeId2 = question.getTypeOfExam().getTypeId();

			if (typeId2 == typeId) {
				questionsFilteredExam.add(question);
			}

		}

		for (Question question : questionsFilteredExam) {
			question.setTypeOfExam(null);

			System.out.println("bbbbbbbbbbbbbbb");
			System.out.println(question.getTypeOfExam());
			// questionService.deleteQuestion(question.getqId());

			questionService.newQuestion(question);
		}

		// List<Exam> exams = examService.getAllExams();
		// for (Exam exam : exams) {
		// Integer typeId2 = exam.getTypeOfExam().getTypeId();
		//
		// if (typeId2 == typeId) {
		//// examService.deleteExam(exam.geteId());
		// exam.setTypeOfExam(null);
		// examService.saveExam(exam);
		// }
		//
		// }
		//

		typeOfExamService.deleteTypeOfExam(typeId);
		populateExams(model);
		return "manageExam";
	}

	@GetMapping("/addQuestion/{typeId}")
	public String enterQuestionForm(ModelMap model, @PathVariable Integer typeId ) {
		model.addAttribute("typeId", typeId);
		populateQuestionList(model, typeId);
		return "addQuestion";
	}
	
	@PostMapping("/addQuestionProcess/{typeId}")
	public String addQuestion(HttpServletRequest request) {
		request.setAttribute(
			      View.RESPONSE_STATUS_ATTRIBUTE, HttpStatus.TEMPORARY_REDIRECT);
		return  "redirect:/addQuestion/{typeId}";
	}
	
	@PostMapping("/addQuestion/{typeId}")
	public String enterQuestion(ModelMap model, @ModelAttribute Question question, String answerText1, Integer status1,
			String answerText2, Integer status2, String answerText3, Integer status3, String answerText4,
			Integer status4, String answerText5, Integer status5, String answerText6, Integer status6,
			String answerText7, Integer status7, Integer qId, @PathVariable Integer typeId) {

		TypeOfExam typeOfExam = typeOfExamService.findTypeOfExamById(typeId);
		question.setTypeOfExam(typeOfExam);

		addQuestions(question, answerText1, status1, answerText2, status2, answerText3, status3, answerText4, status4,
				answerText5, status5, answerText6, status6, answerText7, status7);

		populateQuestionList(model, typeId);
		return "addQuestion";
	}

	private Answer generateAnswer(String answerText, Integer status) {
		Answer a1 = new Answer();
		a1.setAnswerText(answerText);
		a1.setStatus(status);

		return a1;
	}

	private void populateQuestionList(ModelMap model, Integer typeId) {
		List<Question> questions = new ArrayList<>();

		List<Question> questionsFilteredExam = new ArrayList<>();
		questions = questionService.getAllQuestions();

		for (Question questioni : questions) {
			Integer typeId2 = questioni.getTypeOfExam().getTypeId();

			if (typeId2 == typeId) {
				questionsFilteredExam.add(questioni);
			}

		}
		model.addAttribute("questionList", questionsFilteredExam);
	}

	@GetMapping("/deleteQuestion/{qId}")
	public String deleteQuestion(@PathVariable Integer qId, ModelMap model) {
		Integer typeId = questionService.findQuestionbyId(qId).getTypeOfExam().getTypeId();

		List<Answer> answers = new ArrayList<>();
		answers = questionService.findQuestionbyId(qId).getPossibleAnswers();

		for (Answer answer : answers) {
			answerService.deleteAnswerById(answer.getaId());

		}

		questionService.deleteQuestion(qId);
		model.addAttribute("typeId", typeId);
		populateQuestionList(model, typeId);
		
		return "addQuestion";

	}

	private void addQuestions(Question question, String answerText1, Integer status1, String answerText2,
			Integer status2, String answerText3, Integer status3, String answerText4, Integer status4,
			String answerText5, Integer status5, String answerText6, Integer status6, String answerText7,
			Integer status7) {

		if (status1 != null) {
			Answer a1 = generateAnswer(answerText1, status1);
			List<Answer> ansList = Arrays.asList(a1);
			question.setPossibleAnswers(ansList);
			questionService.newQuestion(question);
		}

		else if (status2 != null) {
			Answer a1 = generateAnswer(answerText1, status1);
			Answer a2 = generateAnswer(answerText2, status2);
			List<Answer> ansList = Arrays.asList(a1, a2);
			question.setPossibleAnswers(ansList);
			questionService.newQuestion(question);
		}

		else if (status3 != null) {
			Answer a1 = generateAnswer(answerText1, status1);
			Answer a2 = generateAnswer(answerText2, status2);
			Answer a3 = generateAnswer(answerText3, status3);
			List<Answer> ansList = Arrays.asList(a1, a2, a3);
			question.setPossibleAnswers(ansList);
			questionService.newQuestion(question);
		}

		else if (status4 != null) {
			Answer a1 = generateAnswer(answerText1, status1);
			Answer a2 = generateAnswer(answerText2, status2);
			Answer a3 = generateAnswer(answerText3, status3);
			Answer a4 = generateAnswer(answerText4, status4);
			List<Answer> ansList = Arrays.asList(a1, a2, a3, a4);
			question.setPossibleAnswers(ansList);
			questionService.newQuestion(question);
		}

		else if (status5 != null) {
			Answer a1 = generateAnswer(answerText1, status1);
			Answer a2 = generateAnswer(answerText2, status2);
			Answer a3 = generateAnswer(answerText3, status3);
			Answer a4 = generateAnswer(answerText4, status4);
			Answer a5 = generateAnswer(answerText5, status5);
			List<Answer> ansList = Arrays.asList(a1, a2, a3, a4, a5);
			question.setPossibleAnswers(ansList);
			questionService.newQuestion(question);
		}

		else if (status6 != null) {
			Answer a1 = generateAnswer(answerText1, status1);
			Answer a2 = generateAnswer(answerText2, status2);
			Answer a3 = generateAnswer(answerText3, status3);
			Answer a4 = generateAnswer(answerText4, status4);
			Answer a5 = generateAnswer(answerText5, status5);
			List<Answer> ansList = Arrays.asList(a1, a2, a3, a4, a5);
			question.setPossibleAnswers(ansList);
			questionService.newQuestion(question);
		}

		else if (status7 != null) {
			Answer a1 = generateAnswer(answerText1, status1);
			Answer a2 = generateAnswer(answerText2, status2);
			Answer a3 = generateAnswer(answerText3, status3);
			Answer a4 = generateAnswer(answerText4, status4);
			Answer a5 = generateAnswer(answerText5, status5);
			Answer a6 = generateAnswer(answerText6, status6);
			Answer a7 = generateAnswer(answerText7, status7);
			List<Answer> ansList = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
			question.setPossibleAnswers(ansList);
			questionService.newQuestion(question);
		}
	}

}
