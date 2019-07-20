package com.fdmgroup.GroupProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fdmgroup.GroupProject.model.ExamQuestion;



public interface ExamQuestionRepository extends JpaRepository<ExamQuestion, Integer>{
//	List<ExamQuestion> findExamQuestionByUserId(int userID);
}
