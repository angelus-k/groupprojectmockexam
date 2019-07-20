package com.fdmgroup.GroupProject.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class ExamQuestion implements Comparable<ExamQuestion> {

	@Id
	@Column(name = "Exam_Question_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eQId;

	@OneToOne
	private Question question;

	private boolean answered;
	
	// @OneToOne
	// private Answer chosenAnswer;

	@ManyToMany(cascade = CascadeType.ALL) // ManyToMany with join table
	@JoinTable(name = "chosenAnswers", joinColumns = @JoinColumn(name = "Exam_Question_Id") , inverseJoinColumns = @JoinColumn(name = "answer_Id") )
	private List<Answer> chosenAnswers;

	public ExamQuestion() {
	}

	public ExamQuestion(Question question) {
		super();
		this.question = question;
	}
	
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public boolean isAnswered() {
		return answered;
	}

	public void setAnswered(boolean answered) {
		this.answered = answered;
	}

	
	public Integer geteQId() {
		return eQId;
	}

	public boolean isCorrectAnswered() {

		for (Answer answer : chosenAnswers) {

			if (answer.getStatus() == 0)
				return false;
		}

		return true;

	}
	
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eQId == null) ? 0 : eQId.hashCode());
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
		ExamQuestion other = (ExamQuestion) obj;
		if (eQId == null) {
			if (other.eQId != null)
				return false;
		} else if (!eQId.equals(other.eQId))
			return false;
		return true;
	}

	@Override
	public int compareTo(ExamQuestion o) {

		return this.geteQId().compareTo(o.geteQId());
	}

	public void setChosenAnswers(List<Answer> chosenAnswers) {
		this.chosenAnswers = chosenAnswers;
	}

	public List<Answer> getChosenAnswers() {
		return chosenAnswers;
	}

	

}
