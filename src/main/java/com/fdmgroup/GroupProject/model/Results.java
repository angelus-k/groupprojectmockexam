package com.fdmgroup.GroupProject.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Results {

	double percent = 0;
	double right = 0;
	double wrong = 0;

	Question question;
	Answer answer;



	public double correctPercentage(Exam exam) {
		
		for(ExamQuestion eq: exam.geteQuestions()) {

			if(eq.getChosenAnswers().size() != eq.getQuestion().getNumberOfCorrectAnswers()) {	
				wrong += 1;
			} else {
				
				if(eq.getChosenAnswers().size() == 1) {
			
				for(Answer ans1: eq.getChosenAnswers()) {
				int ansStatus = ans1.getStatus();

				if (ansStatus == 0) {
					wrong += 1;
				} else {
					right += 1;

				}
			}
		}
			
				else {
					List<Integer> statusList = new ArrayList<>(); 
				
					if(eq.getChosenAnswers().size() != 0) {
					for(Answer ans1: eq.getChosenAnswers()) {
						statusList.add(ans1.getStatus());
					}
						
						if (Collections.frequency(statusList, 1) != eq.getQuestion().getNumberOfCorrectAnswers()) {
							wrong += 1;
							
						} else {
							right += 1;
							
						}
					} else
							wrong +=1;
				}
		}
	}
		percent = right / (right + wrong) * 100;
		percent = (double) Math.round(percent * 100) / 100;
		return percent;

		
	}

	public String resultExam(double percent) {
		if (percent < 65)
			return "fail";
		else
			return "pass";

	}

	public String resultrealExam(double percent) {
		if (percent < 75)
			return "fail";
		else if (percent >= 75 && percent < 80)
			return "pass";
		else if (percent >= 80 && percent < 90)
			return "merit";
		else
			return "distinction";
	}

	public double getPercent() {
		return percent;
	}

	public double getRight() {
		return right;
	}

	public double getWrong() {
		return wrong;
	}

}
