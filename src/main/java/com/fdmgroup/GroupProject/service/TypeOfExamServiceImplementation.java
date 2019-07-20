package com.fdmgroup.GroupProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.GroupProject.model.Exam;
import com.fdmgroup.GroupProject.model.TypeOfExam;
import com.fdmgroup.GroupProject.repository.TypeOfExamRepository;

@Service
public class TypeOfExamServiceImplementation implements TypeOfExamService {

	@Autowired
	private TypeOfExamRepository repoTypeOfExam;

	@Override
	public void saveTypeOfExam(TypeOfExam examType) {
		repoTypeOfExam.save(examType);
	}

	@Override
	public void deleteTypeOfExam(int typeId) {
		repoTypeOfExam.deleteById(typeId);

	}

	@Override
	public List<TypeOfExam> getAllTypesOfExam() {
		return repoTypeOfExam.findAll();
	}

	@Override
	public TypeOfExam findTypeOfExamById(int typeId) {
		TypeOfExam examType1;
		Optional<TypeOfExam> examType2 = repoTypeOfExam.findById(typeId);
		if (examType2.isPresent()) {
			examType1 = examType2.get();
			return examType1;
		} else {
			return null;
		}

	}

	@Override
	public int calcAvgResults(List<Exam> examsByOneType) {
		TypeOfExam typeOfExam = new TypeOfExam();
		double value = 0;
		if (typeOfExam.getAverageResult() != 0) {
			value = typeOfExam.getAverageResult();
		}

		for (Exam exam : examsByOneType) {
			value = value + exam.getResultValue();
		}
		value = value / examsByOneType.size();
		int valueInt = (int) Math.round(value);

		return valueInt;
	}

	@Override
	public void saveAverageResult(TypeOfExam typeOfExam, int avgResult) {

		typeOfExam.setAverageResult(avgResult);
		saveTypeOfExam(typeOfExam);

	}

	@Override
	public int calcAvgPassPercentage(List<Exam> examsByOneType) {
		TypeOfExam typeOfExam = new TypeOfExam();
		double passAmount = 0;

		if (typeOfExam.getAvgPercentageOfPasses() != 0) {
			passAmount = typeOfExam.getAvgPercentageOfPasses();
		}

		for (Exam exam : examsByOneType) {
			if (exam.getResultValue() > 75.0 || exam.getResultValue() == 75.0) {
				passAmount = passAmount + 1;
			}
		}
		passAmount = passAmount * 100 / examsByOneType.size();
		int avgPassPercentageInt = (int) Math.round(passAmount);

		return avgPassPercentageInt;
	}

	@Override
	public void saveAveragePassPercentage(TypeOfExam typeOfExam, int avgPassPercentage) {
		typeOfExam.setAvgPercentageOfPasses(avgPassPercentage);
		saveTypeOfExam(typeOfExam);
	}

	@Override
	public int calcAmountExecutedTests(List<Exam> findAllByTypeOfExam) {

		double amount = 0;
		if (findAllByTypeOfExam.size() != 0) {
			amount = findAllByTypeOfExam.size();
		}
		int amountExecutedTestsInt = (int) Math.round(amount);

		return amountExecutedTestsInt;
	}

	@Override
	public void saveAmountExecutedTests(TypeOfExam typeOfExam, int amountExecutedTestsInt) {
		typeOfExam.setAmountOfExecutedTests(amountExecutedTestsInt);
		saveTypeOfExam(typeOfExam);

	}

}
