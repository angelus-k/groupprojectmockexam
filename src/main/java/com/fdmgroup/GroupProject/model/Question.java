package com.fdmgroup.GroupProject.model;

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
import javax.transaction.Transactional;

@Transactional
@Entity
public class Question implements Comparable<Question> {
	@Id
	@Column(name = "Question_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer qId;
	@Column(name = "Question", length = 1000)
	private String questionText;
	@Column(name = "number_of_CorrectAnswers")
	private int numberOfCorrectAnswers;

	private Integer complexity = 0;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "Question_id")
	private List<Answer> possibleAnswers;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "Question_id")
//	private List<ReportQuestion> reportlist;

	@ManyToOne
	private TypeOfExam typeOfExam;
	

	
	public TypeOfExam getTypeOfExam() {
		return typeOfExam;
	}

	public void setTypeOfExam(TypeOfExam typeOfExam) {
		this.typeOfExam = typeOfExam;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public int getNumberOfCorrectAnswers() {
		return numberOfCorrectAnswers;
	}

	public void setNumberOfCorrectAnswers(int numberOfCorrectAnswers) {
		this.numberOfCorrectAnswers = numberOfCorrectAnswers;
	}

	public List<Answer> getPossibleAnswers() {
		return possibleAnswers;
	}

	public void setPossibleAnswers(List<Answer> possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}

	public Integer getqId() {
		return qId;
	}
	
	public Integer getComplexity() {
		return complexity;
	}

	public void setComplexity(Integer complexity) {
		this.complexity = complexity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((qId == null) ? 0 : qId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (qId == null) {
			if (other.qId != null)
				return false;
		} else if (!qId.equals(other.qId))
			return false;
		return true;
	}

	public Question(String questionText) {
		super();
		this.questionText = questionText;
	}

	public Question() {
		super();
	}

	@Override
	public int compareTo(Question o) {
		return this.getqId().compareTo(o.getqId());
	}
}