package com.fdmgroup.GroupProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	@Column(name = "answer_Id")
	@GeneratedValue
	private Integer aId;
	@Column(name = "Answer")
	private String answerText;
	@Column(name = "Status")
	private int status;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "answer_Id")
//	private ExamQuestion eQuestion;
	
	

//	public ExamQuestion geteQuestion() {
//		return eQuestion;
//	}
//
//	public void seteQuestion(ExamQuestion eQuestion) {
//		this.eQuestion = eQuestion;
//	}

	public Integer getaId() {
		return aId;
	}

	public String getAnswerText() {
		return answerText;
	}

	public Answer(String answerText, int status) {
		super();
		this.answerText = answerText;
		this.status = status;
	}

	public Answer() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aId == null) ? 0 : aId.hashCode());
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
		Answer other = (Answer) obj;
		if (aId == null) {
			if (other.aId != null)
				return false;
		} else if (!aId.equals(other.aId))
			return false;
		return true;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}