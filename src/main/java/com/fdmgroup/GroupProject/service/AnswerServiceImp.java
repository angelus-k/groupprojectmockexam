package com.fdmgroup.GroupProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fdmgroup.GroupProject.model.Answer;
import com.fdmgroup.GroupProject.repository.AnswerRepository;


@Component

public class AnswerServiceImp implements AnswerService{

	@Autowired
	AnswerRepository repo;
	
	@Override
	public void saveAnswer(Answer answer) {
		repo.save(answer);
		
	}

	@Override
	public List<Answer> getAllAnswers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	
	@Override
	public void deleteAnswerById(int aId) {
		// TODO Auto-generated method stub
		repo.deleteById(aId);
	}
}
