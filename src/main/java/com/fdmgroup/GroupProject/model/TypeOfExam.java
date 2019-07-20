package com.fdmgroup.GroupProject.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class TypeOfExam {

	@Id
	@Column(name = "typeId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "typeOfExam_generator")
	@SequenceGenerator(name = "typeOfExam_generator", sequenceName = "typeOfExam_seq", allocationSize = 10)
	private Integer typeId;

	private String examType;

	private int numberOfQuestions;

	private int duration;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Exam> exams;

	private int averageResult = 0;

	private int avgPercentageOfPasses = 0;

	private int amountOfExecutedTests = 0;

	public int getAverageResult() {
		return averageResult;
	}

	public void setAverageResult(int averageResult) {
		this.averageResult = averageResult;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	public void setNumberOfQuestions(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public int getAvgPercentageOfPasses() {
		return avgPercentageOfPasses;
	}

	public void setAvgPercentageOfPasses(int avgPercentageOfPasses) {
		this.avgPercentageOfPasses = avgPercentageOfPasses;
	}

	public int getAmountOfExecutedTests() {
		return amountOfExecutedTests;
	}

	public void setAmountOfExecutedTests(int amountOfExecutedTests) {
		this.amountOfExecutedTests = amountOfExecutedTests;
	}

}
