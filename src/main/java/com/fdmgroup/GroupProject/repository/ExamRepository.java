package com.fdmgroup.GroupProject.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fdmgroup.GroupProject.model.Exam;
import com.fdmgroup.GroupProject.model.TypeOfExam;
import com.fdmgroup.GroupProject.model.User;



public interface ExamRepository extends JpaRepository<Exam, Integer>{
	
	List<Exam> findExamByeId(int eId);
	List<Exam> findExamByUser(User user);
//	Object findExamUserId(Integer id);
	List<Exam> findAllByTypeOfExam(TypeOfExam typeOfExam);
	
}
