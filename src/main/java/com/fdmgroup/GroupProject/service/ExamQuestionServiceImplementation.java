package com.fdmgroup.GroupProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fdmgroup.GroupProject.model.ExamQuestion;
import com.fdmgroup.GroupProject.repository.ExamQuestionRepository;

@Component
public class ExamQuestionServiceImplementation implements ExamQuestionService {

	@Autowired
	ExamQuestionRepository examQuestionRepo;
	
	
	
	@Override
	public void saveExamQuestion(ExamQuestion eQuestion) {
		examQuestionRepo.save(eQuestion);
		
	}

	
	
}
