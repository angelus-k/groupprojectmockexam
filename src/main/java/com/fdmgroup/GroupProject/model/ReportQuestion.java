package com.fdmgroup.GroupProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.transaction.Transactional;

@Transactional
@Entity
public class ReportQuestion {

	@Id
	@Column(name = "reportId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	// (strategy = GenerationType.AUTO) //(strategy =
	// GenerationType.SEQUENCE, generator =
	// "typeOfExam_generator")
	private Integer rId;

	@OneToOne
	private Question question;

	@OneToOne
	private User user;

	private String reportText;

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getReportText() {
		return reportText;
	}

	public void setReportText(String reportText) {
		this.reportText = reportText;
	}

	public Integer getrId() {
		return rId;
	}

	@Override
	public String toString() {
		return "ReportQuestion [rId=" + rId + ", question=" + question + ", user=" + user + ", reportText=" + reportText
				+ "]";
	}

}
