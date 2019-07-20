package com.fdmgroup.GroupProject.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fdmgroup.GroupProject.model.Question;
import com.fdmgroup.GroupProject.model.TypeOfExam;




public interface QuestionRepository extends JpaRepository<Question, Integer> {
//	List<Question> findQuestionByTypeOfExam(TypeOfExam typeOfExam);
	
	List<Question> findQuestionByTypeOfExam(TypeOfExam typeOfExam);
}
