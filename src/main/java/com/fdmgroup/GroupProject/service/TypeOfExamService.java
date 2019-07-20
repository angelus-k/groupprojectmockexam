package com.fdmgroup.GroupProject.service;

import java.util.List;

import com.fdmgroup.GroupProject.model.Exam;
import com.fdmgroup.GroupProject.model.TypeOfExam;

public interface TypeOfExamService {

	public void saveTypeOfExam(TypeOfExam examType);

	public void deleteTypeOfExam(int typeId);

	public List<TypeOfExam> getAllTypesOfExam();

	public TypeOfExam findTypeOfExamById(int typeId);

	int calcAvgResults(List<Exam> examsForOneType);

	void saveAverageResult(TypeOfExam typeOfExam, int avgResult);

	int calcAvgPassPercentage(List<Exam> examsByOneType);

	public void saveAveragePassPercentage(TypeOfExam typeOfExam, int avgPassPercentage);

	public int calcAmountExecutedTests(List<Exam> findAllByTypeOfExam);

	public void saveAmountExecutedTests(TypeOfExam typeOfExam, int amountExecutedTestsInt);

}
