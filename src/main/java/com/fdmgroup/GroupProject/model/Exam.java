package com.fdmgroup.GroupProject.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Exam {

	@Id
	@Column(name = "Exam_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eId;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "Exam_id")
	private List<ExamQuestion> eQuestions = new ArrayList<>();
	@ManyToOne
	private TypeOfExam typeOfExam;

	@ManyToOne
	private User user;
	
	private double resultValue = 0;
	
	private String formatDate;

	public void setResultValue(double percentage) {
		this.resultValue = percentage;
	}

	public double getResultValue() {
		return resultValue;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<ExamQuestion> geteQuestions() {
		return eQuestions;
	}

	public void seteQuestions(List<ExamQuestion> eQuestions) {
		this.eQuestions = eQuestions;
	}

	public TypeOfExam getTypeOfExam() {
		return typeOfExam;
	}

	public void setTypeOfExam(TypeOfExam typeOfExam) {
		this.typeOfExam = typeOfExam;
	}

	public Integer geteId() {
		return eId;
	}

	@Override
	public String toString() {
		return "Exam [eId=" + eId + ", eQuestions=" + eQuestions + ", typeOfExam=" + typeOfExam + ", user=" + user
				+ ", resultValue=" + resultValue + ", formatDate=" + formatDate + "]";
	}

	public String getFormatDate() {
		return formatDate;
	}

	public void setFormatDate(String formatDate) {
		this.formatDate = formatDate;
	}

	
	

	

}
