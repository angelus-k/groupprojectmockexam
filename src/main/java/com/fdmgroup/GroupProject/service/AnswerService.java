package com.fdmgroup.GroupProject.service;

import java.util.List;

import com.fdmgroup.GroupProject.model.Answer;

public interface AnswerService {

	void saveAnswer(Answer answer);

	List<Answer> getAllAnswers();

	void deleteAnswerById(int aId);
}
