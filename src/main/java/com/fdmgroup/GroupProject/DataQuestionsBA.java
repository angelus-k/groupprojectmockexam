package com.fdmgroup.GroupProject;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.fdmgroup.GroupProject.model.Answer;
import com.fdmgroup.GroupProject.model.Question;
import com.fdmgroup.GroupProject.model.TypeOfExam;
import com.fdmgroup.GroupProject.service.QuestionService;
import com.fdmgroup.GroupProject.service.TypeOfExamService;

@Component
public class DataQuestionsBA implements ApplicationRunner {

	@Autowired
	QuestionService questionService;

	@Autowired
	TypeOfExamService typeOfExamService;

	public void run(ApplicationArguments args) throws Exception {

		TypeOfExam typeOfExam = new TypeOfExam();
		typeOfExam.setDuration(3600);
		typeOfExam.setNumberOfQuestions(40);
		typeOfExam.setExamType("BAExam");
		typeOfExamService.saveTypeOfExam(typeOfExam);

		// Module 1-4
		Question q1 = new Question();
		q1.setQuestionText(
				"When running workshops it is useful to have someone with a role that includes specific responsibility for keeping attendees focused on achieving the objective of the workshop. Which of the following terms describes this role?");
		q1.setNumberOfCorrectAnswers(1);
		Answer a1 = new Answer("The arbitrator", 0);
		Answer b1 = new Answer("The scribe", 0);
		Answer c1 = new Answer("The stakeholder", 0);
		Answer d1 = new Answer("The facilitator", 1);
		List<Answer> ansList = Arrays.asList(a1, b1, c1, d1);
		q1.setPossibleAnswers(ansList);
		q1.setTypeOfExam(typeOfExam);
		questionService.newQuestion(q1);

		Question q2 = new Question();
		q2.setQuestionText("In which of the following circumstances do buyers have high bargaining power?");
		q2.setNumberOfCorrectAnswers(1);
		Answer a2 = new Answer("When available sources of supply are available and easy to find", 1);
		Answer b2 = new Answer("When the cost of a product or service is low", 0);
		Answer c2 = new Answer("When switching costs are high", 0);
		Answer d2 = new Answer("When the supplier brand is powerful", 0);
		List<Answer> ansList2 = Arrays.asList(a2, b2, c2, d2);
		q2.setPossibleAnswers(ansList2);
		q2.setTypeOfExam(typeOfExam);
		questionService.newQuestion(q2);

		Question q3 = new Question();
		q3.setQuestionText(
				"The required competencies of a business analyst are classified into three categories. Which of the following is one of these three categories?");
		q3.setNumberOfCorrectAnswers(1);
		Answer a3 = new Answer("Management Qualities", 0);
		Answer b3 = new Answer("Business Knowledge", 1);
		Answer c3 = new Answer("IT Skills", 0);
		Answer d3 = new Answer("Project Skills", 0);
		List<Answer> ansList3 = Arrays.asList(a3, b3, c3, d3);
		q3.setPossibleAnswers(ansList3);

		q3.setTypeOfExam(typeOfExam);
		questionService.newQuestion(q3);

		Question q4 = new Question();
		q4.setQuestionText(
				"In the Capability Maturity Model Integration (CMMI) for Business Analysis, which type of process represents techniques and processes that might be reused by the Business Analyst?");
		q4.setNumberOfCorrectAnswers(1);
		Answer a4 = new Answer("Defined Process", 0);
		Answer b4 = new Answer("Managed Process", 1);
		Answer c4 = new Answer("Qualitatively Managed Process", 0);
		Answer d4 = new Answer("Optimising Process", 0);
		List<Answer> ansList4 = Arrays.asList(a4, b4, c4, d4);
		q4.setPossibleAnswers(ansList4);

		q4.setTypeOfExam(typeOfExam);
		questionService.newQuestion(q4);

		Question q5 = new Question();
		q5.setQuestionText(
				"An analyst investigating a finance system wishes to build rapport with individual stakeholders and investigate in detail each stakeholder's views. Which of the following techniques should the analyst use?");
		q5.setNumberOfCorrectAnswers(1);
		Answer a5 = new Answer("Questionnaires", 0);
		Answer b5 = new Answer("Interviewing", 1);
		Answer c5 = new Answer("Special purpose records", 0);
		Answer d5 = new Answer("Document analysis", 0);
		List<Answer> ansList5 = Arrays.asList(a5, b5, c5, d5);
		q5.setPossibleAnswers(ansList5);
		q5.setTypeOfExam(typeOfExam);
		questionService.newQuestion(q5);

		Question q6 = new Question();
		q6.setQuestionText(
				"A convenience food manufacturer has undertaken a strategic analysis study and has identified a threat from groups lobbying against the use of packaging for food products. Which of thePESTLE categories would have helped highlight this threat?");
		q6.setNumberOfCorrectAnswers(1);
		Answer a6 = new Answer("Legal", 0);
		Answer b6 = new Answer("Environmental", 1);
		Answer c6 = new Answer("Technological", 0);
		Answer d6 = new Answer("Economic", 0);
		List<Answer> ansList6 = Arrays.asList(a6, b6, c6, d6);
		q6.setPossibleAnswers(ansList6);
		q6.setTypeOfExam(typeOfExam);
		questionService.newQuestion(q6);

		Question q7 = new Question();
		q7.setQuestionText(
				"In which of the following business analysis areas does the traditional systems analyst role primarily operate?");
		q7.setNumberOfCorrectAnswers(1);
		Answer a7 = new Answer("Quantifying costs and benefits", 0);
		Answer b7 = new Answer("Defining the needs of the business", 0);
		Answer c7 = new Answer("Implementing business changes", 0);
		Answer d7 = new Answer("Specifying IT system requirements", 1);

		List<Answer> ansList7 = Arrays.asList(a7, b7, c7, d7);
		q7.setPossibleAnswers(ansList7);
		q7.setTypeOfExam(typeOfExam);
		questionService.newQuestion(q7);

		Question q8 = new Question();
		q8.setQuestionText(
				"An analyst is defining the requirements for an online booking system and wishes to show the business managers the look and feel of the system in order to elicit usability requirements. Whatinvestigation techniques should the analyst use?");
		q8.setNumberOfCorrectAnswers(1);
		Answer a8 = new Answer("Workshops", 0);
		Answer b8 = new Answer("Interviewing", 0);
		Answer c8 = new Answer("Ethnographic study", 0);
		Answer d8 = new Answer("Prototyping", 1);

		List<Answer> ansList8 = Arrays.asList(a8, b8, c8, d8);
		q8.setPossibleAnswers(ansList8);
		q8.setTypeOfExam(typeOfExam);
		questionService.newQuestion(q8);

		Question q9 = new Question();
		q9.setNumberOfCorrectAnswers(1);
		q9.setQuestionText(
				"Which of the following investigation techniques involves following a user for one or two days in order to find out what a particular job entails?");
		Answer a9 = new Answer("Scenario analysis", 0);
		Answer b9 = new Answer("Protocol analysis", 0);
		Answer c9 = new Answer("Shadowing", 1);
		Answer d9 = new Answer("STROBE", 0);

		List<Answer> ansList9 = Arrays.asList(a9, b9, c9, d9);
		q9.setPossibleAnswers(ansList9);
		q9.setTypeOfExam(typeOfExam);
		questionService.newQuestion(q9);

		Question q10 = new Question();
		q10.setNumberOfCorrectAnswers(1);
		q10.setQuestionText(
				"As part of an investigation a Business Analyst has devised a form for users of an existing system to use to keep track of a task they undertake during their working day. Which of the following describes this investigation technique?");
		Answer a10 = new Answer("Special purpose records", 1);
		Answer b10 = new Answer("Scenario analysis", 0);
		Answer c10 = new Answer("Questionnaires", 0);
		Answer d10 = new Answer("Activity sampling", 0);

		List<Answer> ansList10 = Arrays.asList(a10, b10, c10, d10);
		q10.setPossibleAnswers(ansList10);
		q10.setTypeOfExam(typeOfExam);
		questionService.newQuestion(q10);

		Question q11 = new Question();
		q11.setNumberOfCorrectAnswers(1);
		q11.setQuestionText(
				"One of the stages of the Business Analysis Process Model is 'consider the perspectives'. Which of the following would be particularly relevant in this stage?");
		Answer a11 = new Answer("PESTLE analysis", 0);

		 Answer b11 = new Answer("Requirements Modelling", 0);
		 Answer c11 = new Answer("Cost Benefit Analysis", 0);
		 Answer d11 = new Answer("Business Activity Modelling", 1);
		 
		 List<Answer> ansList11 = Arrays.asList(a11, b11, c11, d11);
			q11.setPossibleAnswers(ansList11);
			q11.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q11);
		
		 Question q12 = new Question();
		 q12.setNumberOfCorrectAnswers(1);
		 q12.setQuestionText("Which of the following techniques can be used to pull together the results of an analysis of the external and internal business environment of an organisation?");
		 Answer a12 = new Answer("SWOT analysis", 1);
		 Answer b12 = new Answer("Resource audit", 0);
		 Answer c12 = new Answer("Five forces model", 0);
		 Answer d12 = new Answer("Balanced business scorecard", 0);
		 
		 List<Answer> ansList12 = Arrays.asList(a12, b12, c12, d12);
			q12.setPossibleAnswers(ansList12);
			q12.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q12);
		
		 Question q13 = new Question();
		 q13.setNumberOfCorrectAnswers(1);
		 q13.setQuestionText("Which of the following BEST describes an ethnographic study?");
		 Answer a13 = new Answer("A study which uses prototype graphical screens to demonstrate a user requirement", 0);
		 Answer b13 = new Answer("A study of users in their workplace undertaking representative simulated scenarios", 0);
		 Answer c13 = new Answer("A study where the analyst spends an extended period of time in the target environment", 1);
		 Answer d13 = new Answer("A study which ensures that the needs of a whole range of ethnic groups are considered", 0);
	
		 List<Answer> ansList13 = Arrays.asList(a13, b13, c13, d13);
			q13.setPossibleAnswers(ansList13);
			q13.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q13);
		
		 Question q14 = new Question();
		 q14.setNumberOfCorrectAnswers(1);
		 q14.setQuestionText("In the Boston Box, what is the name given to products with low market growth and high market share?");
		 Answer a14 = new Answer("Raising Star", 0);
		 Answer b14 = new Answer("Wild Cat", 0);
		 Answer c14 = new Answer("Dog", 0);
		 Answer d14 = new Answer("Cash Cow", 1);
		
		 List<Answer> ansList14 = Arrays.asList(a14, b14, c14, d14);
			q14.setPossibleAnswers(ansList14);
			q14.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q14);
		
		 Question q15 = new Question();
		 q15.setNumberOfCorrectAnswers(1);
		 q15.setQuestionText("The Consider Perspectives stage of the Business Analysis Process Model is primarily concerned with analysing which of the following?");
		 Answer a15 = new Answer("Stakeholders", 1);
		 Answer b15 = new Answer("Current Business Processes", 0);
		 Answer c15 = new Answer("Requirements", 0);
		 Answer d15 = new Answer("Possible Options", 0);
		
		 List<Answer> ansList15 = Arrays.asList(a15, b15, c15, d15);
			q15.setPossibleAnswers(ansList15);
			q15.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q15);
		
		 Question q16 = new Question();
		 q16.setNumberOfCorrectAnswers(1);
		 q16.setQuestionText("The main purpose of Fishbone diagrams is to");
		 Answer a16 = new Answer("Document requirements", 0);
		 Answer b16 = new Answer("Show the interactions of stakeholders", 0);
		 Answer c16 = new Answer("Identify underlying causes of problems", 1);
		 Answer d16 = new Answer("Provide an overview of business situation", 0);
		 
		 List<Answer> ansList16 = Arrays.asList(a16, b16, c16, d16);
			q16.setPossibleAnswers(ansList16);
			q16.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q16);
		
		 Question q17 = new Question();
		 q17.setNumberOfCorrectAnswers(1);
		 q17.setQuestionText("Which of the following is a Quantitative Investigation Technique?");
		 Answer a17 = new Answer("Prototyping", 0);
		 Answer b17 = new Answer("Questionnaires", 1);
		 Answer c17 = new Answer("Protocol Analysis", 0);
		 Answer d17 = new Answer("Mind Maps", 0);
		
		 List<Answer> ansList17 = Arrays.asList(a17, b17, c17, d17);
			q17.setPossibleAnswers(ansList17);
			q17.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q17);
		
		 Question q18 = new Question();
		 q18.setNumberOfCorrectAnswers(1);
		 q18.setQuestionText("Which of the following is not given as a reason to adopt Agile Systems Development?");
		 Answer a18 = new Answer("Allows business users to clarify, elaborate and prioritise the requirements during the development process", 0);
		 Answer b18 = new Answer("Early delivery of working software increments", 0);
		 Answer c18 = new Answer("No documentation of requirements is prescribed as part of the Agile process", 1);
		 Answer d18 = new Answer("Improved communication with clients/users", 0);
		 List<Answer> ansList18 = Arrays.asList(a18, b18, c18, d18);
			q18.setPossibleAnswers(ansList18);
			q18.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q18);
		 

			 Question q19 = new Question();
			 q19.setNumberOfCorrectAnswers(1);
			 q19.setQuestionText("The Holistic Approach to Business Analysis includes 4 areas to consider. 3 of them are People, Processes and Organisation. The 4th one is");
			 Answer a19 = new Answer("Products", 0);
			 Answer b19 = new Answer("Customers", 0);
			 Answer c19 = new Answer("Information & Technology", 1);
			 Answer d19 = new Answer("Resources", 0);
			 List<Answer> ansList19 = Arrays.asList(a19, b19, c19, d19);
				q19.setPossibleAnswers(ansList19);
				q19.setTypeOfExam(typeOfExam);
			 questionService.newQuestion(q19);
			
         Question q20 = new Question();
         q20.setNumberOfCorrectAnswers(1);
         q20.setQuestionText(
                      "Isaksen and Treffinger's Creative Problem Solving model has 6 steps. What is the purpose of the 1st step 'Mess finding'");
         Answer a20 = new Answer("Identify the complexity of the problem situation", 1);
         Answer b20 = new Answer("Analysing opinions, concerns, knowledge and ideas to  identify quantifiable data", 0);
         Answer c20 = new Answer("Identify the heart of the problem", 0);
         Answer d20 = new Answer("Generate idea to address the problem", 0);
         List<Answer> ansList20 = Arrays.asList(a20, b20, c20, d20);
         q20.setPossibleAnswers(ansList20);
         q20.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q20);

         // Module 5 to 9
         Question q21 = new Question();
         q21.setNumberOfCorrectAnswers(1);
         q21.setQuestionText("Which of the following is a primary activity in the value chain?");
         Answer a21 = new Answer("Human Resources", 0);
         Answer b21 = new Answer("Procurement", 0);
         Answer c21 = new Answer("Information Technology", 0);
         Answer d21 = new Answer("Marketing and Sales", 1);
         List<Answer> ansList21 = Arrays.asList(a21, b21, c21, d21);
         q21.setPossibleAnswers(ansList21);
         q21.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q21);

         Question q22 = new Question();
         q22.setNumberOfCorrectAnswers(1);
         q22.setQuestionText(
                      "An organisation called 'Quality Signs' makes display signs for commercial customers. Which of the following are most likely to be the Actors in a CATWOE analysis?");
         Answer a22 = new Answer("The managing director of Quality Signs", 0);
         Answer b22 = new Answer("The sign makers of Quality Signs", 1);
         Answer c22 = new Answer("The competitors of Quality Signs", 0);
         Answer d22 = new Answer("The customers of Quality Signs", 0);
         List<Answer> ansList22 = Arrays.asList(a22, b22, c22, d22);
         q22.setPossibleAnswers(ansList22);
         q22.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q22);

         Question q23 = new Question();
         q23.setNumberOfCorrectAnswers(1);
         q23.setQuestionText(
                      "A batch runs every night to raise invoices. The next day these invoices are posted out to customers by a clerk. Customers pay the invoices with cheques. The cheques are then banked by a clerk. In this scenario, which of the following represents a business event?");
         Answer a23 = new Answer("System prints invoices", 0);
         Answer b23 = new Answer("Clerk sends invoices to customers", 0);
         Answer c23 = new Answer("Customer's cheque is received", 1);
         Answer d23 = new Answer("Clerk banks the cheque", 0);
         List<Answer> ansList23 = Arrays.asList(a23, b23, c23, d23);
         q23.setPossibleAnswers(ansList23);
         q23.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q23);

         Question q24 = new Question();
         q24.setNumberOfCorrectAnswers(1);
         q24.setQuestionText(
                      "In the business activity model, which of the following type of activities respond to deviations between actual and planned performance?");
         Answer a24 = new Answer("Monitoring activities", 0);
         Answer b24 = new Answer("Doing activities", 0);
         Answer c24 = new Answer("Controlling activities", 1);
         Answer d24 = new Answer("Planning activities", 0);
         List<Answer> ansList24 = Arrays.asList(a24, b24, c24, d24);
         q24.setPossibleAnswers(ansList24);
         q24.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q24);

         Question q25 = new Question();
         q25.setNumberOfCorrectAnswers(1);
         q25.setQuestionText(
                      "A process model has been produced which includes diamond-shaped symbols. What does the diamond-shaped symbol represent in the model?");
         Answer a25 = new Answer("A document", 0);
         Answer b25 = new Answer("An event", 0);
         Answer c25 = new Answer("A manual process", 0);
         Answer d25 = new Answer("A decision", 1);
         List<Answer> ansList25 = Arrays.asList(a25, b25, c25, d25);
         q25.setPossibleAnswers(ansList25);
         q25.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q25);

         Question q26 = new Question();
         q26.setNumberOfCorrectAnswers(1);
         q26.setQuestionText(
                      "A stakeholder has been classified as 'some' on both the power/influence and interest axes of a power/interest grid. Which of the following would be an appropriate way of managing this stakeholder?");
         Answer a26 = new Answer("Keep on side", 1);
         Answer b26 = new Answer("Keep watching", 0);
         Answer c26 = new Answer("Keep informed", 0);
         Answer d26 = new Answer("Keep satisfied", 0);
         List<Answer> ansList26 = Arrays.asList(a26, b26, c26, d26);
         q26.setPossibleAnswers(ansList26);
         q26.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q26);

         Question q27 = new Question();
         q27.setNumberOfCorrectAnswers(1);
         q27.setQuestionText("When should benefits realisation be carried out?");
         Answer a27 = new Answer("Immediately at the end of the project", 0);
         Answer b27 = new Answer("At the beginning of the project", 0);
         Answer c27 = new Answer("At the end of the finalised feasibility study", 0);
         Answer d27 = new Answer("Months or years after the end of the project", 1);
         List<Answer> ansList27 = Arrays.asList(a27, b27, c27, d27);
         q27.setPossibleAnswers(ansList27);
         q27.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q27);

         Question q28 = new Question();
         q28.setNumberOfCorrectAnswers(1);
         q28.setQuestionText("Which of the following statement is TRUE about the process view of an organisation?");
         Answer a28 = new Answer("It focuses on the customer of the organisation", 0);
         Answer b28 = new Answer("It focuses solely on the internal view of the organisation", 1);
         Answer c28 = new Answer("It focuses on the functions of an organisation", 0);
         Answer d28 = new Answer("It focuses on the organisational structure", 0);
         List<Answer> ansList28 = Arrays.asList(a28, b28, c28, d28);
         q28.setPossibleAnswers(ansList28);
         q28.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q28);

         Question q29 = new Question();
         q29.setNumberOfCorrectAnswers(1);
         q29.setQuestionText(
                      "It has been suggested that five clerical posts can be abolished when a new computer system is implemented. Under which category of costs or benefits will this be recorded?");
         Answer a29 = new Answer("Tangible costs", 0);
         Answer b29 = new Answer("Tangible benefits", 1);
         Answer c29 = new Answer("Intangible costs", 0);
         Answer d29 = new Answer("Intangible benefits", 0);
         List<Answer> ansList29 = Arrays.asList(a29, b29, c29, d29);
         q29.setPossibleAnswers(ansList29);
         q29.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q29);

         Question q30 = new Question();
         q29.setNumberOfCorrectAnswers(1);
         q30.setQuestionText("Which of the following is TRUE?");
         Answer a30 = new Answer("The IRR of every project is based on it achieving a Net Present Value of zero", 1);
         Answer b30 = new Answer("It is preferable for the calculated IRR of a project to be below bank interest rate",
                      0);
         Answer c30 = new Answer("Discounted cash flows do not usually take into account the time value of money", 0);
         Answer d30 = new Answer("When comparing two projects, the one with the lower NPV should be preferred", 0);
         List<Answer> ansList30 = Arrays.asList(a30, b30, c30, d30);
         q30.setPossibleAnswers(ansList30);
         q30.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q30);
         
		 
		 Question q31 = new Question();
		 q31.setQuestionText("One of the characteristics of the functional view of the organisation is the tendency employees to maximise the performance of their own business unit without regard to other business units in the organisation. What is characteristic called?");
		 q31.setNumberOfCorrectAnswers(1);
		 Answer a31 = new Answer("Management by objectives", 0);
		 Answer b31 = new Answer("Intrapreneurship", 0);
		 Answer c31 = new Answer("Silo thinking", 1);
		 Answer d31 = new Answer("The internal market", 0);
		 List<Answer> ansList31 = Arrays.asList(a31, b31, c31, d31);
		 q31.setPossibleAnswers(ansList31);
		 q31.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q31);
		
		 Question q32 = new Question();
		 q32.setQuestionText("Which of the following terms may be used to describe the attitude of a stakeholder who is NOT in favour of the project but is probably not actively opposed to it?");
		 q32.setNumberOfCorrectAnswers(1);
		 Answer a32 = new Answer("Opponent", 0);
		 Answer b32 = new Answer("Neutral", 0);
		 Answer c32 = new Answer("Critic", 1);
		 Answer d32 = new Answer("Blocker", 0);
		 List<Answer> ansList32 = Arrays.asList(a32, b32, c32, d32);
		 q32.setPossibleAnswers(ansList32);
		 q32.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q32);
		
		 Question q33 = new Question();
		 q33.setQuestionText("Which of the following tasks is NOT a valid part of a Gap Analysis?");
		 q33.setNumberOfCorrectAnswers(1);
		 Answer a33 = new Answer("Examine each activity on the BAMs and identify deficiencies.", 0);
		 Answer b33 = new Answer("Identify missing associations between classes in 'to be' Class Diagram", 1);
		 Answer c33 = new Answer("Compare the competencies held by an individual and those required for a particular role", 0);
		 Answer d33 = new Answer("Compare the IT system requirements and the features offered by an off-the-shelf software package", 0);
		 List<Answer> ansList33 = Arrays.asList(a33, b33, c33, d33);
		 q33.setPossibleAnswers(ansList33);
		 q33.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q33);
		
		 //Problematic
		
		 Question q34 = new Question();
		 q34.setQuestionText("Given the cashflows below, which of the following is correct? <table> <tbody> <tr> <td>Item</td> <td>Year 1</td> <td>Year 2</td> <td>Year 3</td> <td>Year 4</td> </tr> <tr> <td>Hardwarecost</td> <td>100000</td> <td>0</td> <td>0</td> <td>0</td> </tr> <tr> <td>Software cost</td> <td>50000</td> <td>10000</td> <td>10000</td> <td>10000</td> </tr> <tr> <td>Maintenance cost</td> <td>10000</td> <td>10000</td> <td>10000</td> <td>10000</td> </tr> <tr> <td>Savings</td> <td>50000</td> <td>50000</td> <td>50000</td> <td>50000</td> </tr> </tbody> </table>");
		 q34.setNumberOfCorrectAnswers(1);
		 Answer a34 = new Answer("The project pays back in year 4 of the project", 0);
		 Answer b34 = new Answer("The project does not pay back within the four year period", 1);
		 Answer c34 = new Answer("The project pays back in year 2 of the project", 0);
		 Answer d34 = new Answer("The project pays back in year 3 of the project", 0);
		 List<Answer> ansList34 = Arrays.asList(a34, b34, c34, d34);
		 q34.setPossibleAnswers(ansList34);
		 q34.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q34);
		
		 Question q35 = new Question();
		 q35.setQuestionText("Business rules define how actions are to be performed. Under which of the following headings are business rules considered?");
		 q35.setNumberOfCorrectAnswers(1);
		 Answer a35 = new Answer("Explicit or implicit management statements", 0);
		 Answer b35 = new Answer("Statutory and internal policies", 0);
		 Answer c35 = new Answer("Constraints and operational guidance", 1);
		 Answer d35 = new Answer("Negotiable and non-negotiable limitations", 0);
		 List<Answer> ansList35 = Arrays.asList(a35, b35, c35, d35);
		 q35.setPossibleAnswers(ansList35);
		 q35.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q35);
		
		 Question q36 = new Question();
		 q36.setQuestionText("What does the 'O' stand for in the CATWOE analysis?");
		 q36.setNumberOfCorrectAnswers(1);
		 Answer a36 = new Answer("The objectives of the business system under review",0);
		 Answer b36 = new Answer("The opportunities for change in the business system under review", 0);
		 Answer c36 = new Answer("The organisation of the business system under review",0);
		 Answer d36 = new Answer("The owner of the business system under review",1);
		 List<Answer> ansList36 = Arrays.asList(a36, b36, c36, d36);
		 q36.setPossibleAnswers(ansList36);
		 q36.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q36);
		
		 Question q37 = new Question();
		 q37.setQuestionText("In the RACI chart, which category will 'carry the can' for the quality of the product");
		 q37.setNumberOfCorrectAnswers(1);
		 Answer a37 = new Answer("Responsible",0);
		 Answer b37 = new Answer("Accountable",1);
		 Answer c37 = new Answer("Consulted",0);
		 Answer d37 = new Answer("Informed",0);
		 List<Answer> ansList37 = Arrays.asList(a37, b37, c37, d37);
		 q37.setPossibleAnswers(ansList37);
		 q37.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q37);
		
		 Question q38 = new Question();
		 q38.setQuestionText("Which of the following is an example of a Business Feasibility Issue");
		 q38.setNumberOfCorrectAnswers(1);
		 Answer a38 = new Answer("Budget Available", 0);
		 Answer b38 = new Answer("The system will deliver payback with 3 years",0);
		 Answer c38 = new Answer("Organisation has the competencies to deliver the proposed product",1);
		 Answer d38 = new Answer("The proposal will use leading edge technologies",0);
		 List<Answer> ansList38= Arrays.asList(a38, b38, c38, d38);
		 q38.setPossibleAnswers(ansList38);
		 q38.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q38);
		
		 Question q39 = new Question();
		 q39.setQuestionText("In Value Stream Analysis, which of the following is NOT true about Value Streams?");
		 q39.setNumberOfCorrectAnswers(1);
		 Answer a39 = new Answer("A value stream is used to identify, map and analyse the value exchanged between an organisation and various stakeholders (internal and external) that interact with it",0);
		 Answer b39 = new Answer("A value stream shows the main sequential stages which add value to the customer",0);
		 Answer c39 = new Answer("A value stream is an end-to-end collection of high-level linear stages that create an outcome of value to a specific customer group",0);
		 Answer d39 = new Answer("A value stream Customer is the end-customer for which value is recognised, but not an internal customer",1);
		 List<Answer> ansList39= Arrays.asList(a39, b39, c39, d39);
		 q39.setPossibleAnswers(ansList39);
		 q39.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q39);
		
		 Question q40 = new Question();
		 q40.setQuestionText("'To increase the number of customer transactions processed by 20% per hour' is a");
		 q40.setNumberOfCorrectAnswers(1);
		 Answer a40 = new Answer("CSF",0);
		 Answer b40 = new Answer("KPI",1);
		 Answer c40 = new Answer("BAM",0);
		 Answer d40 = new Answer("IRR",0);
		 List<Answer> ansList40= Arrays.asList(a40, b40, c40, d40);
		 q40.setPossibleAnswers(ansList40);
		 q40.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q40);
		
		// // Module 10-14

		 Question q41 = new Question();
		 q41.setQuestionText("An analyst has discovered that a company wishes to hold information about departments and employees. A department may have many employees in it, but each employee can, at one time, only work in one department. There is no requirement to store historical information. However, there are currently eight departments and over one hundred employees. How would this relationship be shown on an Entity Relationship diagram?");
		 q41.setNumberOfCorrectAnswers(1);
		 Answer a41 = new Answer("As (8. 100) at the Department end of the relationship",0);
		 Answer b41 = new Answer("As a many-to-many between department and Employee",0);
		 Answer c41 = new Answer("As one-to-one between Department and Employee",0);
		 Answer d41 = new Answer("As a one-to-many between Department and Employee",1);
		 List<Answer> ansList41= Arrays.asList(a41, b41, c41, d41);
		 q41.setPossibleAnswers(ansList41);
		 q41.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q41);
		
		 Question q42 = new Question();
		 q42.setNumberOfCorrectAnswers(1);
		 q42.setQuestionText("A business analyst has identified that one of the use cases on a use case diagram contains a large amount of optional processing. This optional processing is so large that he has decided to remove it to a separate use case which can be called by the original use case if required. How should the original use case be linked to the new use case?");
		 Answer a42 = new Answer("By a broken, arrowed line stereotyped with the word 'extend'",1);
		 Answer b42 = new Answer("By a broken, arrowed line stereotyped with the word 'include'",0);
		 Answer c42 = new Answer("By a broken, arrowed line stereotyped with the word 'uses'",0);
		 Answer d42 = new Answer("By a sold line with no arrowhead or stereotype", 0);
		 List<Answer> ansList42= Arrays.asList(a42, b42, c42, d42);
		 q42.setPossibleAnswers(ansList42);
		 q42.setTypeOfExam(typeOfExam); 
		 questionService.newQuestion(q42);
		
		 Question q43 = new Question();
		 q43.setNumberOfCorrectAnswers(1);
		 q43.setQuestionText("The following is a typical example of how a User Story is stated:'As an Account Manager, I want to be able to record the details of a call received from a Client, so that I can accurately complete contract details when I place a Consultant.'In this statement, what is the purpose of stating 'so that I can'?");
		 Answer a43 = new Answer("Allows dependencies to be defined between this User Story and another",0);
		 Answer b43 = new Answer("Makes the desired function easier to cost in a prospective budget",0);
		 Answer c43 = new Answer("Provides a basis of Quality Assurance criteria",0);
		 Answer d43 = new Answer("Identifies the rationale behind requesting the function",1);
		 List<Answer> ansList43= Arrays.asList(a43, b43, c43, d43);
		 q43.setPossibleAnswers(ansList43);
		 q43.setTypeOfExam(typeOfExam); 
		 questionService.newQuestion(q43);
		
		 Question q44 = new Question();
		 q44.setNumberOfCorrectAnswers(1);
		 q44.setQuestionText("Different reactions may be observed when a change to working methods is proposed. These reactions include: 1. Enthusiasm for the change, 2. Fear of the change, 3. Reduced performance on the job, 4. Reluctant acceptance of the change. Which of the following represents the typical sequence of these four reactions?");
		 Answer a44 = new Answer("2, 4, 3 and 1",0);
		 Answer b44 = new Answer("1, 2, 3 and 4",0);
		 Answer c44 = new Answer("2, 3, 4 and 1",1);
		 Answer d44 = new Answer("1, 2, 4 and 3",0);
		 List<Answer> ansList44= Arrays.asList(a44, b44, c44, d44);
		 q44.setPossibleAnswers(ansList44);
		 q44.setTypeOfExam(typeOfExam);  
		 questionService.newQuestion(q44);
		
		 Question q45 = new Question();
		 q45.setNumberOfCorrectAnswers(1);
		 q45.setQuestionText("In a particular organisation it is common practice to call all managers by their first name. It is part of the culture of the organisation. Newcomers are quickly corrected if they do not follow this informal approach. What would knowing about this convention be classified as in Requirements engineering?");
		 Answer a45 = new Answer("Explicit individual knowledge",0);
		 Answer b45 = new Answer("Tacit individual knowledge",0);
		 Answer c45 = new Answer("Explicit corporate knowledge",0);
		 Answer d45 = new Answer("Tacit corporate knowledge",1);
		 List<Answer> ansList45= Arrays.asList(a45, b45, c45, d45);
		 q45.setPossibleAnswers(ansList45);
		 q45.setTypeOfExam(typeOfExam);   
		 questionService.newQuestion(q45);
		
		 Question q46 = new Question();
		 q46.setNumberOfCorrectAnswers(1);
		 q46.setQuestionText("It is unclear to a project sponsor why a particular requirement has been included in a recently released version of a system. Which of the following will allow him to identify who originally asked for the requirement?");
		 Answer a46 = new Answer("The validation of the requirement",0);
		 Answer b46 = new Answer("The source of the requirement",1);
		 Answer c46 = new Answer("The resolution of the requirement",0);
		 Answer d46 = new Answer("The justification of the requirement",0);
		 List<Answer> ansList46= Arrays.asList(a46, b46, c46, d46);
		 q46.setPossibleAnswers(ansList46);
		 q46.setTypeOfExam(typeOfExam);  
		 questionService.newQuestion(q46);
		
		 Question q47 = new Question();
		 q47.setNumberOfCorrectAnswers(1);
		 q47.setQuestionText("Which stage of the Requirements Engineering process is concerned with tracking requirements from inception to implementation?");
		 Answer a47 = new Answer("Requirements documentation",0);
		 Answer b47 = new Answer("Requirements management",1);
		 Answer c47 = new Answer("Requirements validation",0);
		 Answer d47 = new Answer("Requirements analysis",0);
		 List<Answer> ansList47= Arrays.asList(a47, b47, c47, d47);
		 q47.setPossibleAnswers(ansList47);
		 q47.setTypeOfExam(typeOfExam);   
		 questionService.newQuestion(q47);
		
		 Question q48 = new Question();
		 q48.setQuestionText("A system holds information about an employee, Mike Berry. Which of the following is Mike Berry and example of?");
		 Answer a48 = new Answer("An attribute",0);
		 Answer b48 = new Answer("An object",1);
		 Answer c48 = new Answer("A class",0);
		 Answer d48 = new Answer("An operation",0);
		 q48.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList48= Arrays.asList(a48, b48, c48, d48);
		 q48.setPossibleAnswers(ansList48);
		 q48.setTypeOfExam(typeOfExam);  
		 questionService.newQuestion(q48);
		
		 Question q49 = new Question();
		 q49.setQuestionText("A well formed requirement is said to comply with which of the following acronyms?");
		 Answer a49 = new Answer("MOSCOW",0);
		 Answer b49 = new Answer("SMART",1);
		 Answer c49 = new Answer("OSCAR",0);
		 Answer d49 = new Answer("MOST",0);
		 q49.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList49= Arrays.asList(a49, b49, c49, d49);
		 q49.setPossibleAnswers(ansList49);
		 q49.setTypeOfExam(typeOfExam);  
		 questionService.newQuestion(q49);
		 

		 Question q50 = new Question();
		 q50.setQuestionText("The following requirement has been identified; 'the system must be able to record customer payments'. What type of requirement is this?");
		Answer a50 = new Answer("A functional requirement",1);
		 Answer b50 = new Answer("A non-functional requirement",0);
		 Answer c50 = new Answer("A general requirement",0);
		 Answer d50 = new Answer("A technical requirement",0);
		 q50.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList50= Arrays.asList(a50, b50, c50, d50);
		 q50.setPossibleAnswers(ansList50);
		 q50.setTypeOfExam(typeOfExam); 
		 questionService.newQuestion(q50);
		 
		 Question q51 = new Question();
         q51.setNumberOfCorrectAnswers(1);
         q51.setQuestionText("OSCAR is used to identify the important components of:");
         Answer a51 = new Answer("Terms of Reference", 1);
         Answer b51 = new Answer("Requirements Elicitation", 0);
         Answer c51 = new Answer("Investment Appraisal", 0);
         Answer d51 = new Answer("Project Feasibility", 0);
         List<Answer> ansList51 = Arrays.asList(a51, b51, c51, d51);
         q51.setPossibleAnswers(ansList51);
         q51.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q51);

         Question q52 = new Question();
         q52.setNumberOfCorrectAnswers(1);
         q52.setQuestionText(
                      "The Realisation Stage of the Business Change Lifecycle is where a Benefits Plan is usually drawn up. Which of the following elements is not an essential part of a Benefits Plan?");
         Answer a52 = new Answer("Benefits dependency network", 0);
         Answer b52 = new Answer("Responsibilities", 0);
         Answer c52 = new Answer("Traceability matrix", 1);
         Answer d52 = new Answer("Tracking procedures", 0);
         List<Answer> ansList52 = Arrays.asList(a52, b52, c52, d52);
         q52.setPossibleAnswers(ansList52);
         q52.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q52);

         Question q53 = new Question();
         q53.setNumberOfCorrectAnswers(1);
         q53.setQuestionText("Which of the following uses prototypes to deliver the requirements?");
         Answer a53 = new Answer("Waterfall Lifecycle", 0);
         Answer b53 = new Answer("Agile model", 1);
         Answer c53 = new Answer("V-model", 0);
         Answer d53 = new Answer("Business Change Lifecycle", 0);
         List<Answer> ansList53 = Arrays.asList(a53, b53, c53, d53);
         q53.setPossibleAnswers(ansList53);
         q53.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q53);

         Question q54 = new Question();
         q54.setNumberOfCorrectAnswers(1);
         q54.setQuestionText("In UML what does a Use Case represent?");
         Answer a54 = new Answer("Something the user wants the IT system to do", 1);
         Answer b54 = new Answer("A business process", 0);
         Answer c54 = new Answer("A scenario", 0);
         Answer d54 = new Answer("IT system", 0);
         List<Answer> ansList54 = Arrays.asList(a54, b54, c54, d54);
         q54.setPossibleAnswers(ansList54);
         q54.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q54);

         Question q55 = new Question();
         q55.setNumberOfCorrectAnswers(1);
         q55.setQuestionText("In an Entity Relationship diagram how is a many-to-many relationship shown?");
         Answer a55 = new Answer("2 boxes with a line linking them together,", 0);
         Answer b55 = new Answer("2 boxes with 2 lines linking them together, each line has crow's foot at 1 end", 0);
         Answer c55 = new Answer("2 boxes with a line linking them together with crow's foot at both ends", 0);
         Answer d55 = new Answer(
                      "3 boxes, with 2 lines linking them together, the middle box having a line to other 2 boxes, each line with have a crow's foot at one end and link to the middle box",
                      1);
         List<Answer> ansList55 = Arrays.asList(a55, b55, c55, d55);
         q55.setPossibleAnswers(ansList55);
         q55.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q55);

         Question q56 = new Question();
         q56.setNumberOfCorrectAnswers(1);
         q56.setQuestionText("What does the UML concept of Generalisation refer to?");
         Answer a56 = new Answer("Common attributes used in several classes", 0);
         Answer b56 = new Answer(
                      "Having a generic class, which can be used to create more specific classes which inherit attributes from the generic class",
                      1);
         Answer c56 = new Answer("Common operations applied to multiple classes", 0);
         Answer d56 = new Answer("A standard for UML classes", 0);
         List<Answer> ansList56 = Arrays.asList(a56, b56, c56, d56);
         q56.setPossibleAnswers(ansList56);
         q56.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q56);

         Question q57 = new Question();
         q57.setNumberOfCorrectAnswers(1);
         q57.setQuestionText("Which of the following is a Non-functionalRequirement?");
         Answer a57 = new Answer("Provision of monthly reports", 0);
         Answer b57 = new Answer("The operating systems the application will run on", 0);
         Answer c57 = new Answer("The frequency backups should be performed", 1);
         Answer d57 = new Answer("Updates to business rules", 0);
         List<Answer> ansList57 = Arrays.asList(a57, b57, c57, d57);
         q57.setPossibleAnswers(ansList57);
         q57.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q57);

         Question q58 = new Question();
         q58.setNumberOfCorrectAnswers(1);
         q58.setQuestionText("What does the W in Will not represent?");
         Answer a58 = new Answer("Will not have for now, a requirement which will be implemented later", 1);
         Answer b58 = new Answer(
                      "Would like to have, a desirable requirement but not implemented due to time and budget", 0);
         Answer c58 = new Answer("Will not have, a requirement not considered worth having", 0);
         Answer d58 = new Answer("Want to have, a desirable requirement but not implemented due to time and budget", 0);
         List<Answer> ansList58 = Arrays.asList(a58, b58, c58, d58);
         q58.setPossibleAnswers(ansList58);
         q58.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q58);

         Question q59 = new Question();
         q59.setNumberOfCorrectAnswers(1);
         q59.setQuestionText("Which of the following is an important characteristic of Managing Requirements?");
         Answer a59 = new Answer("Traceability", 1);
         Answer b59 = new Answer("Reporting", 0);
         Answer c59 = new Answer("Communication", 0);
         Answer d59 = new Answer("Review", 0);
         List<Answer> ansList59 = Arrays.asList(a59, b59, c59, d59);
         q59.setPossibleAnswers(ansList59);
         q59.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q59);

         Question q60 = new Question();
         q60.setNumberOfCorrectAnswers(1);
         q60.setQuestionText(
                      "Which stage of the V-Model identifies Acceptance Criteria, used to test the suitability of the system?");
         Answer a60 = new Answer("Analyse business needs", 0);
         Answer b60 = new Answer("Define requirements", 1);
         Answer c60 = new Answer("Design Solution", 0);
         Answer d60 = new Answer("Review Benefits", 0);
         List<Answer> ansList60 = Arrays.asList(a60, b60, c60, d60);
         q60.setPossibleAnswers(ansList60);
         q60.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q60);

         Question q61 = new Question();
		 q61.setQuestionText("Which of the following statements is TRUE about the process view of an organisation?");
		 q61.setNumberOfCorrectAnswers(1);
		 Answer a61 = new Answer("It focuses on the customer of the organisation.", 1);
		 Answer b61  = new Answer("It focuses solely on the internal view of an organisation.", 0);
		 Answer c61  = new Answer("It focuses on the functions of an organisation.", 0);
		 Answer d61  = new Answer("It focuses on the organisational structure", 0);
		 List<Answer> ansList61 = Arrays.asList(a61, b61, c61, d61);
		 q61.setPossibleAnswers(ansList61);
		 q61.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q61);
		
		 Question q62 = new Question();
		 q62.setNumberOfCorrectAnswers(1);
		 q62.setQuestionText("On a class diagram, what do multiplicities represent?");
		 Answer a62 = new Answer("The number of attributes held within each class.", 0);
		 Answer b62 = new Answer("The minimum and maximum number of operations in each class.", 0);
		 Answer c62 = new Answer("The minimum and maximum number of objects in each class.", 0);
		 Answer d62 = new Answer("The business rules for an association between two classes.", 1);
		 List<Answer> ansList62 = Arrays.asList(a62, b62, c62, d62);
		 q62.setPossibleAnswers(ansList62);
		 q62.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q62);
		
		 Question q63 = new Question();
		 q63.setNumberOfCorrectAnswers(1);
		 q63.setQuestionText("Which stage in the waterfall model is considered as several separate stages in the V model?");
		 Answer a63 = new Answer("Development", 0);
		 Answer b63 = new Answer("Analysis", 0);
		 Answer c63 = new Answer("Testing", 1);
		 Answer d63 = new Answer("Design", 0);
		 List<Answer> ansList63 = Arrays.asList(a63, b63, c63, d63);
		 q63.setPossibleAnswers(ansList63);
		 q63.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q63);
		 
		 Question q64 = new Question();
		 q64.setNumberOfCorrectAnswers(1);
		 q64.setQuestionText("During which stage of the Business Analysis Process Model would a gap analysis be carried out?");
		 Answer a64 = new Answer("Define requirements.", 0);
		 Answer b64 = new Answer("Analyse needs.", 1);
		 Answer c64 = new Answer("Evaluate the options.", 0);
		 Answer d64 = new Answer("Investigate situation.", 0);
		 List<Answer> ansList64 = Arrays.asList(a64, b64, c64, d64);
		 q64.setPossibleAnswers(ansList64);
		 q64.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q64);
		
		 Question q65 = new Question();
		 q65.setNumberOfCorrectAnswers(1);
		 q65.setQuestionText("What is the first stage of the waterfall systems development lifecycle?");
		 Answer a65 = new Answer("Plan.", 0);
		 Answer b65 = new Answer("Analysis.", 0);
		 Answer c65 = new Answer("Feasibility Study.", 1);
		 Answer d65 = new Answer("Strategic Vision.", 0);
		 List<Answer> ansList65 = Arrays.asList(a65, b65, c65, d65);
		 q65.setPossibleAnswers(ansList65);
		 q65.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q65);
		
		 Question q66 = new Question();
		 q66.setNumberOfCorrectAnswers(1);
		 q66.setQuestionText("What does the O stand for in the CATWOE analysis?");
		 Answer a66 = new Answer("The objectives of the business system under review.", 0);
		 Answer b66 = new Answer("The opportunities for change in the business system under review.", 0);
		 Answer c66 = new Answer("The organisation of the business system under review.", 0);
		 Answer d66 = new Answer("The owner of the business system under review.", 1);
		 List<Answer> ansList66 = Arrays.asList(a66, b66, c66, d66);
		 q66.setPossibleAnswers(ansList66);
		 q66.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q66);
		
		 Question q67 = new Question();
		 q67.setNumberOfCorrectAnswers(1);
		 q67.setQuestionText("A batch program runs every night to raise invoices. The next day these invoices are posted out to customers by a clerk. Customers pay the invoices with cheques. The cheques are then banked by a clerk. In this scenario, which of the following represents a business event?");
		 Answer a67 = new Answer("System prints invoices.", 0);
		 Answer b67 = new Answer("Clerk sends invoices to customers.", 0);
		 Answer c67 = new Answer("Customer’s cheque is received.", 1);
		 Answer d67 = new Answer("Clerk banks the cheque.", 0);
		 List<Answer> ansList67 = Arrays.asList(a67, b67, c67, d67);
		 q67.setPossibleAnswers(ansList67);
		 q67.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q67);
		
		 Question q68 = new Question();
		 q68.setNumberOfCorrectAnswers(1);
		 q68.setQuestionText("A system holds information about an employee; Mike Berry. Which of the following is Mike Berry an example of?");
		 Answer a68 = new Answer("An attribute.", 0);
		 Answer b68 = new Answer("An object.", 1);
		 Answer c68 = new Answer("A class.", 0);
		 Answer d68 = new Answer("An operation.", 0);
		 List<Answer> ansList68 = Arrays.asList(a68, b68, c68, d68);
		 q68.setPossibleAnswers(ansList68);
		 q68.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q68);
		
		 Question q69 = new Question();
		 q69.setNumberOfCorrectAnswers(1);
		 q69.setQuestionText("An organisation called Quality Signs’ makes display signs for commercial customers. Which of the following are MOST likely to be the Actors in a CATWOE analysis?");
		 Answer a69 = new Answer("The managing Director of Quality Signs.", 0);
		 Answer b69 = new Answer("The sign makers of Quality Signs.", 1);
		 Answer c69 = new Answer("The competitors of Quality Signs.", 0);
		 Answer d69 = new Answer("The customers of Quality Signs.", 0);
		 List<Answer> ansList69 = Arrays.asList(a69, b69, c69, d69);
		 q69.setPossibleAnswers(ansList69);
		 q69.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q69);
		
		 Question q70 = new Question();
		 q70.setNumberOfCorrectAnswers(1);
		 q70.setQuestionText("Which of the following models shows the driving and resisting forces of change?");
		 Answer a70 = new Answer("Force fields analysis.", 1);
		 Answer b70 = new Answer("Five forces model.", 0);
		 Answer c70 = new Answer("Power/impact grid.", 0);
		 Answer d70 = new Answer("Learning cycle.", 0);
		 List<Answer> ansList70 = Arrays.asList(a70, b70, c70, d70);
		 q70.setPossibleAnswers(ansList70);
		 q70.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q70);
		 
         Question q71 = new Question();
         q71.setNumberOfCorrectAnswers(1);
         q71.setQuestionText("Which of the following statements is TRUE?");
         Answer a71 = new Answer("The IRR of every project is based on it achieving a Net Present Value of zero.",1);
         Answer b71 = new Answer("It is preferable for the calculated IRR of a project to be below bank interest rates.",0);
         Answer c71 = new Answer("Discounted cash flows do not usually take into account the time value of money.",0);
         Answer d71 = new Answer("When comparing two projects, the one with the lower NPV should be preferred.",0);
         List<Answer> ansList71 = Arrays.asList(a71, b71, c71, d71);
                q71.setPossibleAnswers(ansList71);
                q71.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q71);
         
         Question q72 = new Question();
         q72.setNumberOfCorrectAnswers(1);
         q72.setQuestionText("In a business activity model, which of the following type of activities respond to deviations between actual and planned performance?");
         Answer a72 = new Answer("Monitoring activities.",0);
         Answer b72 = new Answer("Doing activities.",0);
         Answer c72 = new Answer("Controlling activities.",1);
         Answer d72 = new Answer("Planning activities.",0);
         List<Answer> ansList72 = Arrays.asList(a72, b72, c72, d72);
                q72.setPossibleAnswers(ansList72);
                q72.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q72);
         
         Question q73 = new Question();
         q73.setNumberOfCorrectAnswers(1);
         q73.setQuestionText("One of the stages of the Business Activity Process Model is ‘Consider the perspectives’. Which of the following would be particularly relevant in this stage?");
         Answer a73 = new Answer("PESTLE analysis",0);
         Answer b73 = new Answer("Requirements Modelling.",0);
         Answer c73 = new Answer("Cost Benefit Analysis.",0);
         Answer d73 = new Answer("Business Activity Modelling.",1);
         List<Answer> ansList73 = Arrays.asList(a73, b73, c73, d73);
                q73.setPossibleAnswers(ansList73);
                q73.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q73);
         
         Question q74 = new Question();
         q74.setNumberOfCorrectAnswers(1);
         q74.setQuestionText("Which of the following statements about outsourcing of systems development is correct?");
         Answer a74 = new Answer("It has meant that it is no longer necessary for analysts to define rigorous, accurate and complete user requirements.",0);
         Answer b74 = new Answer("It has eliminated the need for effective contract management between the customer and the supplier of the outsourcing.",0);
         Answer c74 = new Answer("It has been a significant catalyst in organisation for the development of a business analysis function.",1);
         Answer d74 = new Answer("It has meant that the programming of solutions is usually undertaken in countries where labour costs are high.",0);
         List<Answer> ansList74 = Arrays.asList(a74, b74, c74, d74);
                q74.setPossibleAnswers(ansList74);
                q74.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q74);
         
         Question q75 = new Question();
         q75.setNumberOfCorrectAnswers(1);
         q75.setQuestionText("Which of the following is a perceived advantage of using workshops to investigate requirements?");
         Answer a75 = new Answer("It reduces speed and productivity of the project.",0);
         Answer b75 = new Answer("It is time-consuming to arrange and organise.",0);
         Answer c75 = new Answer("It focuses on a narrow view of the area under investigation.",0);
         Answer d75 = new Answer("It obtains buy-in and acceptance for the project.",1);
         List<Answer> ansList75 = Arrays.asList(a75, b75, c75, d75);
                q75.setPossibleAnswers(ansList75);
                q75.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q75);
         
         Question q76 = new Question();
         q76.setNumberOfCorrectAnswers(1);
         q76.setQuestionText("Style guides, manuals and job descriptions are examples of what type of knowledge?");
         Answer a76 = new Answer("Explicit.",1);
         Answer b76 = new Answer("Implicit.",0);
         Answer c76 = new Answer("Tacit.",0);
         Answer d76 = new Answer("Organisational.",0);
         List<Answer> ansList76 = Arrays.asList(a76, b76, c76, d76);
                q76.setPossibleAnswers(ansList76);
                q76.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q76);
         
         Question q77 = new Question();
         q77.setNumberOfCorrectAnswers(1);
         q77.setQuestionText("What do the arrow headed lines between activities represent on a business activity model?");
         Answer a77 = new Answer("Activity Sequence",0);
         Answer b77 = new Answer("Logical dependency.",1);
         Answer c77 = new Answer("Functional optionality.",0);
         Answer d77 = new Answer("Flow of data.",0);
         List<Answer> ansList77 = Arrays.asList(a77, b77, c77, d77);
                q77.setPossibleAnswers(ansList77);
                q77.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q77);
         
         Question q78 = new Question();
         q78.setNumberOfCorrectAnswers(1);
         q78.setQuestionText("A company provides a help desk facility to support users of their computer software. How would the provision of this facility be classified on their value chain?");
         Answer a78 = new Answer("As an Inbound Logistics activity",0);
         Answer b78 = new Answer("As a Sales and Marketing activity",0);
         Answer c78 = new Answer("As a Technology Development activity",0);
         Answer d78 = new Answer("As a Service activity",1);
         List<Answer> ansList78 = Arrays.asList(a78, b78, c78, d78);
                q78.setPossibleAnswers(ansList78);
                q78.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q78);
         
         Question q79 = new Question();
         q79.setNumberOfCorrectAnswers(1);
         q79.setQuestionText("A system must hold the price of every product sold by the company. Which of the following is the price likely to be?");
         Answer a79 = new Answer("An attribute.",1);
         Answer b79 = new Answer("An entity.",0);
         Answer c79 = new Answer("An object.",0);
         Answer d79 = new Answer("A use case.",0);
         List<Answer> ansList79 = Arrays.asList(a79, b79, c79, d79);
                q79.setPossibleAnswers(ansList79);
                q79.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q79);
         
         Question q80 = new Question();
         q80.setNumberOfCorrectAnswers(1);
         q80.setQuestionText("What is stage 0 (zero) of the concerns based adoption model?");
         Answer a80 = new Answer("Shock.",0);
         Answer b80 = new Answer("Definition.",0);
         Answer c80 = new Answer("Initial Change.",0);
         Answer d80 = new Answer("Awareness",1);
         List<Answer> ansList80 = Arrays.asList(a80, b80, c80, d80);
                q80.setPossibleAnswers(ansList80);
                q80.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q80);
         
         Question q81 = new Question();
         q81.setNumberOfCorrectAnswers(1);
         q81.setQuestionText("The Boston Box may be used to analyse the portfolio of businesses owned by an organisation. Which of the following animals does it use in its term for businesses that have low market share in a market with low growth?");
         Answer a81 = new Answer("Cow.",0);
         Answer b81 = new Answer("Cat.",0);
         Answer c81 = new Answer("Dog.",1);
         Answer d81 = new Answer("Goat.",0);
         List<Answer> ansList81 = Arrays.asList(a81, b81, c81, d81);
                q81.setPossibleAnswers(ansList81);
                q81.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q81);
         
         Question q82 = new Question();
         q82.setNumberOfCorrectAnswers(1);
         q82.setQuestionText("Which of the following describes a ‘rich picture’?");
         Answer a82 = new Answer("An organisation showing the most important stakeholders.",0);
         Answer b82 = new Answer("A swim-lane diagram highlighting the most costly processes.",0);
         Answer c82 = new Answer("A free-format drawing of a business situation under investigation.",1);
         Answer d82 = new Answer("A UML class diagram showing both attributes and operations.",0);
         List<Answer> ansList82 = Arrays.asList(a82, b82, c82, d82);
                q82.setPossibleAnswers(ansList82);
                q82.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q82);
         
         Question q83 = new Question();
         q83.setNumberOfCorrectAnswers(1);
         q83.setQuestionText("Which of the following may be used to document the outcomes of a workshop?");
         Answer a83 = new Answer("Mind maps.",1);
         Answer b83 = new Answer("Brainwriting.",0);
         Answer c83 = new Answer("Round robin.",0);
         Answer d83 = new Answer("Stepwise refinement.",0);
         List<Answer> ansList83 = Arrays.asList(a83, b83, c83, d83);
                q83.setPossibleAnswers(ansList83);
                q83.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q83);
         
         Question q84 = new Question();
         q84.setNumberOfCorrectAnswers(1);
         q84.setQuestionText("The V model is an example of which of the following?");
         Answer a84 = new Answer("A business analysis process model.",0);
         Answer b84 = new Answer("A systems development lifecycle.",1);
         Answer c84 = new Answer("A concerns-based adoption model.",0);
         Answer d84 = new Answer("A soft systems methodology.",0);
         List<Answer> ansList84 = Arrays.asList(a84, b84, c84, d84);
                q84.setPossibleAnswers(ansList84);
                q84.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q84);
         
         Question q85 = new Question();
         q85.setNumberOfCorrectAnswers(1);
         q85.setQuestionText("Which of the following is a primary activity in the value chain?");
         Answer a85 = new Answer("Procurement.",0);
         Answer b85 = new Answer("Firm Infrastructure.",0);
         Answer c85 = new Answer("Service.",1);
         Answer d85 = new Answer("Technology development.",0);
         List<Answer> ansList85 = Arrays.asList(a85, b85, c85, d85);
                q85.setPossibleAnswers(ansList85);
                q85.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q85);
         
         Question q86 = new Question();
         q86.setNumberOfCorrectAnswers(1);
         q86.setQuestionText("The term ‘Happy Day’ is often used in the context of which of the following investigation techniques?");
         Answer a86 = new Answer("Protocol analysis.",0);
         Answer b86 = new Answer("Scenarios.",1);
         Answer c86 = new Answer("Activity Sampling.",0);
         Answer d86 = new Answer("Document analysis.",0);
         List<Answer> ansList86 = Arrays.asList(a86, b86, c86, d86);
                q86.setPossibleAnswers(ansList86);
                q86.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q86);
         
         Question q87 = new Question();
         q87.setNumberOfCorrectAnswers(1);
         q87.setQuestionText("What is the MoSCoW principle used for?");
         Answer a87 = new Answer("To analyse stakeholders.",0);
         Answer b87 = new Answer("To determine strategy.",0);
         Answer c87 = new Answer("To define a root definition.",0);
         Answer d87 = new Answer("To prioritise requirements.",1);
         List<Answer> ansList87 = Arrays.asList(a87, b87, c87, d87);
                q87.setPossibleAnswers(ansList87);
                q87.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q87);
         
         Question q88 = new Question();
         q88.setNumberOfCorrectAnswers(1);
         q88.setQuestionText("A software house is developing a software package specifically for hotel management. A business analyst has been employed because of her familiarity with the hotel industry. Which of the following competencies has she been employed to bring to the project?");
         Answer a88 = new Answer("Domain knowledge.",1);
         Answer b88 = new Answer("Problem solving.",0);
         Answer c88 = new Answer("Team Leadership.",0);
         Answer d88 = new Answer("Project management.",0);
         List<Answer> ansList88 = Arrays.asList(a88, b88, c88, d88);
                q88.setPossibleAnswers(ansList88);
                q88.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q88);
         
         Question q89 = new Question();
         q89.setNumberOfCorrectAnswers(1);
         q89.setQuestionText("Every night at midnight a batch process is invoked to invoice all orders received that day. How will the time midnight be represented on a use case diagram?");
         Answer a89 = new Answer("As a use case.",0);
         Answer b89 = new Answer("As an association.",0);
         Answer c89 = new Answer("As an actor.",1);
         Answer d89 = new Answer("As a system boundary.",0);
         List<Answer> ansList89 = Arrays.asList(a89, b89, c89, d89);
                q89.setPossibleAnswers(ansList89);
                q89.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q89);
         
         Question q90 = new Question();
         q90.setNumberOfCorrectAnswers(1);
         q90.setQuestionText("Which of the following types of activity help identify the KPI’s of an organisation?");
         Answer a90 = new Answer("The doing activities.",0);
         Answer b90 = new Answer("The monitoring activities.",0);
         Answer c90 = new Answer("The control activities.",0);
         Answer d90 = new Answer("The planning activities.",1);
         List<Answer> ansList90 = Arrays.asList(a90, b90, c90, d90);
                q90.setPossibleAnswers(ansList90);
                q90.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q90);

		 
		 Question q91 = new Question();
		 q91.setQuestionText("Which of the following requirements elicitation techniques is ineffective at defining the future requirements of a system?");
		 Answer a91 = new Answer("Workshops.",0);
		 Answer b91 = new Answer("Prototyping.",0);
		 Answer c91 = new Answer("Scenario analysis.",0);
		 Answer d91 = new Answer("Shadowing.",1);
		 q91.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList91= Arrays.asList(a91, b91, c91, d91);
		 q91.setPossibleAnswers(ansList91);
		 q91.setTypeOfExam(typeOfExam); 
		 questionService.newQuestion(q91);
		
		 Question q92 = new Question();
		 q92.setQuestionText("Which of the following stages is immediately after problem-finding in Isaksen and Treffingerâ€™s creative problem-solving model?");
		 Answer a92 = new Answer("Idea-finding.", 1);
		 Answer b92 = new Answer("Solution-finding.", 0);
		 Answer c92 = new Answer("Data-finding.", 0);
		 Answer d92 = new Answer("Acceptance-finding.", 0);
		 q92.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList92= Arrays.asList(a92, b92, c92, d92);
		 q92.setPossibleAnswers(ansList92);
		 q92.setTypeOfExam(typeOfExam); 
		 questionService.newQuestion(q92);
		
		 Question q93 = new Question();
		 q93.setQuestionText("Which of the following models might include the documentation of scenarios?");
		 Answer a93 = new Answer("A class model", 0);
		 Answer b93 = new Answer("A business activity model.", 0);
		 Answer c93 = new Answer("A use case model.", 1);
		 Answer d93 = new Answer("A corporate data model.", 0);
		 q93.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList93= Arrays.asList(a93, b93, c93, d93);
		 q93.setPossibleAnswers(ansList93);
		 q93.setTypeOfExam(typeOfExam); 
		 questionService.newQuestion(q93);
		
		 Question q94 = new Question();
		 q94.setQuestionText("Which of the following describes the objectives in a MOST analysis?");
		 Answer a94 = new Answer("The statements declaring what the business is and what it intends to achieve.", 0);
		 Answer b94 = new Answer("The approach the organisation intends to take to achieve its declared mission.", 0);
		 Answer c94 = new Answer("The goals against which the organisationâ€™s achievements can be measured.", 1);
		 Answer d94 = new Answer("The detailed means by which an agreed business strateg will be implemented.", 0);
		 q94.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList94= Arrays.asList(a94, b94, c94, d94);
		 q94.setPossibleAnswers(ansList94);
		 q94.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q94);
		
		 Question q95 = new Question();
		 q95.setQuestionText("A stakeholder in a project has been classified as having no interest but high power/influence on the power/interest grid. Which of the following would be an appropriate way of managing this stakeholder?");
		 Answer a95 = new Answer("Ignore.",0);
		 Answer b95 = new Answer("Watch.",1);
		 Answer c95 = new Answer("Keep on side.",0);
		 Answer d95 = new Answer("Keep informed.",0);
		 q95.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList95= Arrays.asList(a95, b95, c95, d95);
		 q95.setPossibleAnswers(ansList95);
		 q95.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q95);
		
		 Question q96 = new Question();
		 q96.setQuestionText("Which of the following is likely to be shown as a process in a swim-lane diagram of a library book borrowing system?");
		 Answer a96 = new Answer("Book.",0);
		 Answer b96 = new Answer("Librarian.",0);
		 Answer c96 = new Answer("Borrowing Limit.",0);
		 Answer d96 = new Answer("Borrow Book.",1);
		 q96.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList96= Arrays.asList(a96, b96, c96, d96);
		 q96.setPossibleAnswers(ansList96);
		 q96.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q96);
		
		 Question q97 = new Question();
		 q97.setQuestionText("The Business Activity Model shows the doing activities of a business system. Which element of CATWOE do these activities relate to?");
		 Answer a97 = new Answer("Transformation.",1);
		 Answer b97 = new Answer("Actors.",0);
		 Answer c97 = new Answer("Environment.",0);
		 Answer d97 = new Answer("Owner.",0);
		 q97.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList97= Arrays.asList(a97, b97, c97, d97);
		 q97.setPossibleAnswers(ansList97);
		 q97.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q97);
		
		 Question q98 = new Question();
		 q98.setQuestionText("Which of the following statements about change and change management is correct?");
		 Answer a98 = new Answer("Change management should be considered right from the start of the project.",1);
		 Answer b98 = new Answer("Change management should first be considered in the design stage of the project.",0);
		 Answer c98 = new Answer("The management of change is the sole responsibility of the project manager.",0);
		 Answer d98 = new Answer("Social and cultural factors have little influence on the success of implementing changes.",0);
		 q98.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList98= Arrays.asList(a98, b98, c98, d98);
		 q98.setPossibleAnswers(ansList98);
		 q98.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q98);
		
		 Question q99 = new Question();
		 q99.setQuestionText("An analyst has asked a user to describe each step in a task as they perform it. Which of the following investigation techniques is the analyst using?");
		 Answer a99 = new Answer("Ethnographic study.",0);
		 Answer b99 = new Answer("Interviewing.",0);
		 Answer c99 = new Answer("Activity sampling.",0);
		 Answer d99 = new Answer("Protocol analysts.",1);
		 q99.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList99 = Arrays.asList(a99, b99, c99, d99);
		 q99.setPossibleAnswers(ansList99);
		 q99.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q99);
		
		 Question q100 = new Question();
		 q100.setQuestionText("What is the final stage of the waterfall systems development lifecycle?");
		 Answer a100 = new Answer("User acceptance testing.",0);
		 Answer b100 = new Answer("Post-implementation review.",0);
		 Answer c100 = new Answer("Benefits realisation.",0);
		 Answer d100 = new Answer("Implementation.",1);
		 q100.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList100 = Arrays.asList(a100, b100, c100, d100);
		 q100.setPossibleAnswers(ansList100);
		 q100.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q100);

	
		
		 Question q101 = new Question();
		 q101.setNumberOfCorrectAnswers(1);
		 q101.setQuestionText("Which of the following statements about a BAM is correct?");
		 Answer a101 = new Answer("The BAM is concerned with who carries out the activities.", 0);
		 Answer b101 = new Answer("The BAM is concerned with where activities are carried out.", 0);
		 Answer c101 = new Answer("There will be one BAM for each business perspective.", 1);
		 Answer d101 = new Answer("The BAM is an AS-IS model of the real world.", 0);
	
		 List<Answer> ansList101 = Arrays.asList(a101, b101, c101, d101);
			q101.setPossibleAnswers(ansList101);
			q101.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q101);
		
		 Question q102 = new Question();
		 q102.setNumberOfCorrectAnswers(1);
		 q102.setQuestionText("Which of the following is explicitly considered as a force in Porter’s Five Forces model?");
		 Answer a102 = new Answer("Rivalry between suppliers.", 0);
		 Answer b102 = new Answer("Government legislation.", 0);
		 Answer c102 = new Answer("Internal business processes.", 0);
		 Answer d102 = new Answer("Bargaining power of buyers.", 1);
		 List<Answer> ansList102 = Arrays.asList(a102, b102, c102, d102);
			q102.setPossibleAnswers(ansList102);
			q102.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q102);
		
		 Question q103 = new Question();
		 q103.setNumberOfCorrectAnswers(1);
		 q103.setQuestionText("Description, impact assessment, probability and countermeasures are usually recorded for which of the following?");
		 Answer a103 = new Answer("Requirements.", 0);
		 Answer b103 = new Answer("Risks.", 1);
		 Answer c103 = new Answer("Stakeholders", 0);
		 Answer d103 = new Answer("Key Performance Indicators.", 0);
		 List<Answer> ansList103 = Arrays.asList(a103, b103, c103, d103);
			q103.setPossibleAnswers(ansList103);
			q103.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q103);
		
		 Question q104 = new Question();
		 q104.setNumberOfCorrectAnswers(1);
		 q104.setQuestionText("What is the model of a current business process often called?");
		 Answer a104= new Answer("The AS-IS model.", 1);
		 Answer b104 = new Answer("The AS-IF model.", 0);
		 Answer c104 = new Answer("The n-IS model.", 0);
		 Answer d104 = new Answer("The IS-IT model.", 0);
		 List<Answer> ansList104 = Arrays.asList(a104, b104, c104, d104);
			q104.setPossibleAnswers(ansList104);
			q104.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q104);
		
		 Question q105 = new Question();
		 q105.setNumberOfCorrectAnswers(1);
		 q105.setQuestionText("Every night, at midnight, a system automatically raises invoices for customers that have placed orders that day. The invoice is sent electronically by email to customers. What is the event that triggers the production of invoices?");
		 Answer a105 = new Answer("Midnight on the system clock.", 1);
		 Answer b105 = new Answer("The receipt of an order from a customer.", 0);
		 Answer c105 = new Answer("The email system.", 0);
		 Answer d105 = new Answer("The batch invoice production job.", 0);
		 List<Answer> ansList105 = Arrays.asList(a105, b105, c105, d105);
			q105.setPossibleAnswers(ansList105);
			q105.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q105);
		
		 Question q106 = new Question();
		 q106.setNumberOfCorrectAnswers(1);
		 q106.setQuestionText("A company holds information about 1000 customers. It receives, on average, 50 orders per day. Each order must be placed by only one customer. Customers must have placed at least one order but may place several. An analyst has shown an association betweenthe classes Customer and Order. What multiplicities should she show at the Order end of this association?");
		 Answer a106 = new Answer("0.*", 0);
		 Answer b106 = new Answer("1.*", 1);
		 Answer c106 = new Answer("0.50", 0);
		 Answer d106 = new Answer("1.1000", 0);
		 List<Answer> ansList106 = Arrays.asList(a106, b106, c106, d106);
			q106.setPossibleAnswers(ansList106);
			q106.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q106);
		
		 Question q107 = new Question();
		 q107.setNumberOfCorrectAnswers(1);
		 q107.setQuestionText("One of the claimed advantages of buying a softwar package is that it is possible to predict future maintenance costs with some certainty. How would these costs be classified in acost-benefit analysis?");
		 Answer a107 = new Answer("As an intangible cost.", 0);
		 Answer b107 = new Answer("As a tangible benefit.", 0);
		 Answer c107 = new Answer("As a tangible cost.", 1);
		 Answer d107 = new Answer("As an intangible benefit.", 0);
		 List<Answer> ansList107 = Arrays.asList(a107, b107, c107, d107);
			q107.setPossibleAnswers(ansList107);
			q107.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q107);
		
		 Question q108 = new Question();
		 q108.setNumberOfCorrectAnswers(1);
		 q108.setQuestionText("Why should requirements be SMART?");
		 Answer a108 = new Answer("To ensure that the requirement supports business objectives.", 0);
		 Answer b108 = new Answer("To ensure that the requirement is intelligently expressed.", 0);
		 Answer c108 = new Answer("As a tangible cost.", 1);
		 Answer d108 = new Answer("As an intangible benefit.", 0);
		 List<Answer> ansList108 = Arrays.asList(a108, b108, c108, d108);
			q108.setPossibleAnswers(ansList108);
			q108.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q108);
		
		 Question q109 = new Question();
		 q109.setNumberOfCorrectAnswers(1);
		 q109.setQuestionText("Why should requirements be SMART?");
		 Answer a109 = new Answer("To ensure that the requirement supports business objectives.", 0);
		 Answer b109 = new Answer("To ensure that the requirement is intelligently expressed.", 0);
		 Answer c109 = new Answer("To ensure that the requirement is well formed.", 1);
		 Answer d109 = new Answer("To ensure that the requirement is graphically modelled.", 0);
		 List<Answer> ansList109 = Arrays.asList(a109, b109, c109, d109);
			q109.setPossibleAnswers(ansList109);
			q109.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q109);
		
		 Question q110 = new Question();
		 q110.setNumberOfCorrectAnswers(1);
		 q110.setQuestionText("In which stage of the business analysis process model would the business analyst produce a business case?");
		 Answer a110 = new Answer("Evaluating the options.", 1);
		 Answer b110 = new Answer("Analysing the needs.", 0);
		 Answer c110 = new Answer("Defining the requirements.", 0);
		 Answer d110 = new Answer("Considering perspectives.", 0);
		 List<Answer> ansList110 = Arrays.asList(a110, b110, c110, d110);
			q110.setPossibleAnswers(ansList110);
			q110.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q110);
		
		 Question q111 = new Question();
		 q111.setNumberOfCorrectAnswers(1);
		 q111.setQuestionText("Linking a piece of delivered software functionality with a requirement is known as which of the following?");
		 Answer a111 = new Answer("Requirements validation.", 0);
		 Answer b111 = new Answer("Requirements verification.", 0);
		 Answer c111 = new Answer("Requirements testing.", 0);
		 Answer d111 = new Answer("Requirements traceability.", 1);
		 List<Answer> ansList111 = Arrays.asList(a111, b111, c111, d111);
			q111.setPossibleAnswers(ansList111);
			q111.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q111);
		
		 Question q112 = new Question();
		 q112.setNumberOfCorrectAnswers(1);
		 q112.setQuestionText("In which of the following categories would return on investment be considered when assessing the feasibility of aproject?");
		 Answer a112 = new Answer("Financial feasibility.", 1);
		 Answer b112 = new Answer("Business feasibility.", 0);
		 Answer c112 = new Answer("Technical feasibility.", 0);
		 Answer d112 = new Answer("Operational feasibility.", 0);
		 List<Answer> ansList112 = Arrays.asList(a112, b112, c112, d112);
			q112.setPossibleAnswers(ansList112);
			q112.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q112);
		
		 Question q113 = new Question();
		 q113.setNumberOfCorrectAnswers(1);
		 q113.setQuestionText("Which of the following would you describe about each stakeholder?");
		 Answer a113 = new Answer("Justification.", 0);
		 Answer b113 = new Answer("Owner.", 0);
		 Answer c113 = new Answer("Attitude.", 1);
		 Answer d113 = new Answer("Resolution.", 0);
		 List<Answer> ansList113 = Arrays.asList(a113, b113, c113, d113);
			q113.setPossibleAnswers(ansList113);
			q113.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q113);
		
		 Question q114 = new Question();
		 q114.setNumberOfCorrectAnswers(1);
		 q114.setQuestionText("A use case Place Order must always invoke a related use case Check Credit. How is the association between the two use cases shown?");
		 Answer a114 = new Answer("By a solid line with no arrowhead or stereotype.", 0);
		 Answer b114 = new Answer("By a broken, arrowed line stereotyped with the word 'extend'.", 0);
		 Answer c114 = new Answer("By a broken, arrowed line stereotyped with the word 'exclude'.", 0);
		 Answer d114 = new Answer("By a broken, arrowed line stereotyped with the word 'include'.", 1);
		 List<Answer> ansList114 = Arrays.asList(a114, b114, c114, d114);
			q114.setPossibleAnswers(ansList114);
			q114.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q114);
		
		 Question q115 = new Question();
		 q115.setNumberOfCorrectAnswers(1); 
		 q115.setQuestionText("During a workshop, it is useful to ask participantsto come up with ideas which are listed for later evaluation. What isthis technique called?");
		 Answer a115 = new Answer("Round Robin.", 0);
		 Answer b115 = new Answer("Brainstorming.", 1);
		 Answer c115 = new Answer("Mind Mapping.", 0);
		 Answer d115 = new Answer("Mess Finding.", 0);
		 List<Answer> ansList115 = Arrays.asList(a115, b115, c115, d115);
			q115.setPossibleAnswers(ansList115);
			q115.setTypeOfExam(typeOfExam);
			questionService.newQuestion(q115);
		
		 Question q116 = new Question();
		 q116.setNumberOfCorrectAnswers(1); 
		 q116.setQuestionText("When analysing stakeholders, it is useful to produce a stakeholder analysis grid. What is depicted on the axes of this grid?");
		 Answer a116 = new Answer("Objectives and interests.", 0);
		 Answer b116 = new Answer("Power and influence", 0);
		 Answer c116 = new Answer("Perspectives and impacts.", 0);
		 Answer d116 = new Answer("Power and interest.", 1);
		 List<Answer> ansList116 = Arrays.asList(a116, b116, c116, d116);
			q116.setPossibleAnswers(ansList116);
			q116.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q116);
		
		 Question q117 = new Question();
		 q117.setNumberOfCorrectAnswers(1); 
		 q117.setQuestionText("What type of model is a 'Business Activity Model'(BAM)?");
		 Answer a117 = new Answer("Conceptual", 1);
		 Answer b117 = new Answer("Logical", 0);
		 Answer c117 = new Answer("Physical", 0);
		 Answer d117 = new Answer("Dynamic", 0);
		 List<Answer> ansList117 = Arrays.asList(a117, b117, c117, d117);
			q117.setPossibleAnswers(ansList117);
			q117.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q117);
		
		 Question q118 = new Question();
		 q118.setNumberOfCorrectAnswers(1); 
		 q118.setQuestionText("When undertaking a CATWOE analysis, which sequence should the first four letters be considered in?");
		 Answer a118 = new Answer("W, T, C, A", 1);
		 Answer b118 = new Answer("T, W, C, A", 0);
		 Answer c118 = new Answer("W, C, T, A", 0);
		 Answer d118 = new Answer("T, A ,W, C", 0);
		 List<Answer> ansList118 = Arrays.asList(a118, b118, c118, d118);
			q118.setPossibleAnswers(ansList118);
			q118.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q118);
		
		 Question q119 = new Question();
		 q119.setNumberOfCorrectAnswers(1); 
		 q119.setQuestionText("When are workshops especially valuable?");
		 Answer a119 = new Answer("When suitably sized rooms are available", 0);
		 Answer b119 = new Answer("When all stakeholders are agreed on the way forward", 0);
		 Answer c119 = new Answer("When a geographically dispersed set of users’ needs to be consulted ", 0);
		 Answer d119 = new Answer("When time and budget are constrained", 1);
		 List<Answer> ansList119 = Arrays.asList(a119, b119, c119, d119);
			q119.setPossibleAnswers(ansList119);
			q119.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q119);
		
		 Question q120 = new Question();
		 q120.setNumberOfCorrectAnswers(1); 
		 q120.setQuestionText("There is a requirement for an employee to enter time worked details into a computerised project reporting system. If this requirement was drawn on a use case diagram, which of the following would be correct?");
		 Answer a120 = new Answer("Employee would be the boundary, time details an actor.", 1);
		 Answer b120 = new Answer("Project reporting system would be an actor, employee a use case.", 0);
		 Answer c120 = new Answer("The computer system would be the boundary, the project reporting system a use case.", 0);
		 Answer d120 = new Answer("Enter time details would be a use case, employ an actor.", 0);
		 List<Answer> ansList120 = Arrays.asList(a120, b120, c120, d120);
			q120.setPossibleAnswers(ansList120);
			q120.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q120);
		 
		 
		 Question q121 = new Question();
		 q121.setQuestionText("The Internal Rate of Return has been calculated for an option in a Business Case. Which ONE of the following statements is true?");
		 Answer a121 = new Answer("The Net Present Value is not known.",0);
		 Answer b121 = new Answer("The DCF Rate is not known.",0);
		 Answer c121 = new Answer("The Net Present Value is Zero.",1);
		 Answer d121 = new Answer("The DCF Rate is Zero.",0);
		 q121.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList121 = Arrays.asList(a121, b121, c121, d121);
		 q121.setPossibleAnswers(ansList121);
		 q121.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q121);
		
		 Question q122 = new Question();
		 q122.setQuestionText("Which of the following is NOT one of the perspectives considered by the 'Balanced Business Scorecard'?");
		 Answer a122 = new Answer("Competition",1);
		 Answer b122 = new Answer("Customer",0);
		 Answer c122 = new Answer("Learning and Growth",0);
		 Answer d122 = new Answer("Financial",0);
		 q122.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList122 = Arrays.asList(a122, b122, c122, d122);
		 q122.setPossibleAnswers(ansList122);
		 q122.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q122);
		
		 Question q123 = new Question();
		 q123.setQuestionText("Which of the following investigation techniques is the MOST time consuming?");
		 Answer a123 = new Answer("Questionnaires",0);
		 Answer b123 = new Answer("Ethnographic study",1);
		 Answer c123 = new Answer("Shadowing",0);
		 Answer d123 = new Answer(" Activity sampling",0);
		 q123.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList123 = Arrays.asList(a123, b123, c123, d123);
		 q123.setPossibleAnswers(ansList123);
		 q123.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q123);
		
		 Question q124 = new Question();
		 q124.setQuestionText("A project reporting system stores information about Employees. How would an Employee be represented in an entity-relationship diagram?");
		 Answer a124 = new Answer("As an Actor",0);
		 Answer b124 = new Answer("As an Attribute",0);
		 Answer c124 = new Answer("As an Entity",1);
		 Answer d124 = new Answer(" As a Relationship",0);
		 q124.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList124 = Arrays.asList(a124, b124, c124, d124);
		 q124.setPossibleAnswers(ansList124);
		 q124.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q124);
		
		 Question q125 = new Question();
		 q125.setQuestionText("Which of the following investigation techniques is MOST appropriate for collecting quantitative information?");
		 Answer a125 = new Answer("Workshops",0);
		 Answer b125 = new Answer("Activity sampling",1);
		 Answer c125 = new Answer("Interviewing",0);
		 Answer d125 = new Answer("Prototyping",0);
		 q125.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList125 = Arrays.asList(a125, b125, c125, d125);
		 q125.setPossibleAnswers(ansList125);
		 q125.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q125);
		
		 Question q126 = new Question();
		 q126.setQuestionText("Which of the following is an input to the 'Investigate the Situation' stage of the business analysis process model?");
		 Answer a126 = new Answer("Stakeholder perspectives",0);
		 Answer b126 = new Answer("List of issues/problems",0);
		 Answer c126 = new Answer("Business case",0);
		 Answer d126 = new Answer("Terms of reference",1);
		 q126.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList126 = Arrays.asList(a126, b126, c126, d126);
		 q126.setPossibleAnswers(ansList126);
		 q126.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q126);
		
		 Question q127 = new Question();
		 q127.setQuestionText("What occurs at handoffs when two actors do not synchronise their work?");
		 Answer a127 = new Answer("Errors",0);
		 Answer b127 = new Answer("Queues",1);
		 Answer c127 = new Answer("Functions",0);
		 Answer d127 = new Answer("Decisions",0);
		 q127.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList127 = Arrays.asList(a127, b127, c127, d127);
		 q127.setPossibleAnswers(ansList127);
		 q127.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q127);
		
		 Question q128 = new Question();
		 q128.setQuestionText("The change curve shows the range of emotions experienced by people when facing change. One of the axes on the graph is Time; what is the other axis?");
		 Answer a128 = new Answer("Fear",0);
		 Answer b128 = new Answer("Self-esteem",1);
		 Answer c128 = new Answer("Anger",0);
		 Answer d128 = new Answer("Shock",0);
		 q128.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList128 = Arrays.asList(a128, b128, c128, d128);
		 q128.setPossibleAnswers(ansList128);
		 q128.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q128);
		
		 Question q129 = new Question();
		 q129.setQuestionText("What stage of the V model provides the test criteria for user acceptance testing?");
		 Answer a129 = new Answer("The business needs",0);
		 Answer b129 = new Answer("The requirements",1);
		 Answer c129 = new Answer("The designed solution",0);
		 Answer d129 = new Answer("The developed solution",0);
		 q129.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList129 = Arrays.asList(a129, b129, c129, d129);
		 q129.setPossibleAnswers(ansList129);
		 q129.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q129);
		
		 Question q130 = new Question();
		 q130.setQuestionText("Which of the following techniques is used to focus solely on the external influences on an organisation?");
		 Answer a130 = new Answer("SWOT",0);
		 Answer b130 = new Answer("PESTLE",1);
		 Answer c130 = new Answer("CATWOE",0);
		 Answer d130 = new Answer("MOST",0);
		 q130.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList130 = Arrays.asList(a130, b130, c130, d130);
		 q130.setPossibleAnswers(ansList130);
		 q130.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q130);
	

		
		 Question q131 = new Question();
		 q131.setQuestionText("'The system should allow a user to enter customer details and select appropriate customers for a mailshot'. What is wrong with this requirement?");
		 Answer a131 = new Answer("It consists of two requirements which should be separately defined.",1);
		 Answer b131 = new Answer("It contains the word 'should' which must not be used in a requirement.",0);
		 Answer c131 = new Answer("It should be specific about the user it refers to.",0);
		 Answer d131 = new Answer("It should not contain the word 'system' in the requirement.",0);
		 q131.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList131 = Arrays.asList(a131, b131, c131, d131);
		 q131.setPossibleAnswers(ansList131);
		 q131.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q131);
		
		 Question q132 = new Question();
		 q132.setQuestionText("Cars, trucks and motorbikes are all types of vehicle. What structure could be used on a class model to model this?");
		 Answer a132 = new Answer("Generalisation",1);
		 Answer b132 = new Answer("Association class",0);
		 Answer c132 = new Answer("Exclusivity relationship",0);
		 Answer d132 = new Answer("The << included >> construct",0);
		 q132.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList132 = Arrays.asList(a132, b132, c132, d132);
		 q132.setPossibleAnswers(ansList132);
		 q132.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q132);
		
		 Question q133 = new Question();
		 q133.setQuestionText("What stage immediately precedes testing in the waterfall lifecycle?");
		 Answer a133 = new Answer("Design",0);
		 Answer b133 = new Answer("Development",1);
		 Answer c133 = new Answer("Implementation",0);
		 Answer d133 = new Answer("Analysis",0);
		 q133.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList133 = Arrays.asList(a133, b133, c133, d133);
		 q133.setPossibleAnswers(ansList133);
		 q133.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q133);
		
		 Question q134 = new Question();
		 q134.setQuestionText("As part of an investigation, a business analyst has asked a business user to keep track of the actual tasks they carry out over a period of time. What is this investigation technique called?");
		 Answer a134 = new Answer("Shadowing",0);
		 Answer b134 = new Answer("Prototyping",0);
		 Answer c134 = new Answer("Special purpose records", 1);
		 Answer d134 = new Answer("Activity sampling",0);
		 q134.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList134 = Arrays.asList(a134, b134, c134, d134);
		 q134.setPossibleAnswers(ansList134);
		 q134.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q134);
		
		 Question q135 = new Question();
		 q135.setQuestionText("Which of the following is an example of 'Individual Tacit Knowledge'?");
		 Answer a135 = new Answer("Culture",0);
		 Answer b135 = new Answer("Process",0);
		 Answer c135 = new Answer("Norms",0);
		 Answer d135 = new Answer("Intuition",1);
		 q135.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList135 = Arrays.asList(a135, b135, c135, d135);
		 q135.setPossibleAnswers(ansList135);
		 q135.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q135);
		
		 Question q136 = new Question();
		 q136.setQuestionText("Who is the target of the value proposition?");
		 Answer a136 = new Answer("The supplier",0);
		 Answer b136 = new Answer("The sponsor",0);
		 Answer c136 = new Answer("The customer",1);
		 Answer d136 = new Answer("The competitor",0);
		 q136.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList136 = Arrays.asList(a136, b136, c136, d136);
		 q136.setPossibleAnswers(ansList136);
		 q136.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q136);
		
//		 Question q137 = new Question();
//		 q137.setQuestionText("Who should be defined as the owner of a risk?");
//		 Answer a137 = new Answer("The person who documented the risk in the risk register.",0);
//		 Answer b137 = new Answer("The person who identified the risk in the initial requirements analysis. ",0);
//		 Answer c137 = new Answer("The person responsible for defining the probability of risk.",0);
//		 q137.setNumberOfCorrectAnswers(1);
//		 List<Answer> ansList137 = Arrays.asList(a137, b137, c137);
//		 q137.setPossibleAnswers(ansList137);
//		 q137.setTypeOfExam(typeOfExam);
//		 questionService.newQuestion(q137);
		
		 Question q138 = new Question();
		 q138.setQuestionText("One of Porterâ€™s five forces explicitly considers industry competitors. Which of the following is the Key Focusâ€™ of this force?");
		 Answer a138 = new Answer("A competitorâ€™s external marketing campaign",0);
		 Answer b138 = new Answer("The products offered by Competitors",0);
		 Answer c138 = new Answer("Rivalry among existing Competitors",1);
		 Answer d138 = new Answer("The market share of known Competitors",0);
		 q138.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList138 = Arrays.asList(a138, b138, c138, d138);
		 q138.setPossibleAnswers(ansList138);
		 q138.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q138);
		
		 Question q139 = new Question();
		 q139.setQuestionText("Which ONE model is used for planning the training of the support that people need as they adapt to change?");
		 Answer a139 = new Answer("The Concerns-Based Adoption Model",1);
		 Answer b139 = new Answer("The Corporate Training Plan",0);
		 Answer c139 = new Answer("The Capability Maturity Model",0);
		 Answer d139 = new Answer("The Change Control Process Model",0);
		 q139.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList139 = Arrays.asList(a139, b139, c139, d139);
		 q139.setPossibleAnswers(ansList139);
		 q139.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q139);
		
		 Question q140 = new Question();
		 q140.setQuestionText("Business analysis bridges the gap between which two disciplines?");
		 Answer a140 = new Answer("Business Case Definition and Requirements Analysis",0);
		 Answer b140 = new Answer("IT Systems Analysis and Acceptance Testing",0);
		 Answer c140 = new Answer("Requirements Analysis and IT Systems Development",0);
		 Answer d140 = new Answer("Strategic Analysis and IT Systems Analysis",1);
		 q140.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList140 = Arrays.asList(a140, b140, c140, d140);
		 q140.setPossibleAnswers(ansList140);
		 q140.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q140);
		
		 Question q141 = new Question();
		 q141.setQuestionText("A requirement has been identified as beneficial. It will be included in the system if it does not take too long to deliver or costs too much. How would this requirement be prioritised in the MOSCOW classification?");
		 Answer a141 = new Answer("As an 'M'",0);
		 Answer b141 = new Answer("As a 'C'",1);
		 Answer c141 = new Answer("As an 'S'",0);
		 Answer d141 = new Answer("As a 'W'",0);
		 q141.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList141 = Arrays.asList(a141, b141, c141, d141);
		 q141.setPossibleAnswers(ansList141);
		 q141.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q141);
		
		 Question q142 = new Question();
		 q142.setQuestionText("It is claimed that a new system will bring improved job satisfaction to employees. How should this improved job satisfaction be classified?");
		 Answer a142 = new Answer("As a tangible benefit",0);
		 Answer b142 = new Answer("As an intangible cost",0);
		 Answer c142 = new Answer("As a tangible cost",0);
		 Answer d142 = new Answer("As an intangible benefit",1);
		 q142.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList142 = Arrays.asList(a142, b142, c142, d142);
		 q142.setPossibleAnswers(ansList142);
		 q142.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q142);
		
		 Question q143 = new Question();
		 q143.setQuestionText("Which of the following is NOT an example of a generic stakeholder group?");
		 Answer a143 = new Answer("Regulators",0);
		 Answer b143 = new Answer("Competitors",0);
		 Answer c143 = new Answer("Testers",1);
		 Answer d143 = new Answer("Employees",0);
		 q143.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList143 = Arrays.asList(a143, b143, c143, d143);
		 q143.setPossibleAnswers(ansList143);
		 q143.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q143);
		
		 Question q144 = new Question();
		 q144.setQuestionText("When undertaking business system modelling how many Business Activity Modelsâ€™ (BAMâ€™s) are initially produced?");
		 Answer a144 = new Answer("One for each system under consideration",0);
		 Answer b144 = new Answer("On for each CATWOE",1);
		 Answer c144 = new Answer("One for each Actor",0);
		 Answer d144 = new Answer("One to reflect the perspective of the Owner",0);
		 q144.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList144 = Arrays.asList(a144, b144, c144, d144);
		 q144.setPossibleAnswers(ansList144);
		 q144.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q144);
		
		 Question q145 = new Question();
		 q145.setQuestionText("Which investigation technique is supported by use case descriptions?");
		 Answer a145 = new Answer("Scenario Analysis",1);
		 Answer b145 = new Answer("Questionnaires",0);
		 Answer c145 = new Answer("Document Analysis",0);
		 Answer d145 = new Answer("Interviewing",0);
		 q145.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList145 = Arrays.asList(a145, b145, c145, d145);
		 q145.setPossibleAnswers(ansList145);
		 q145.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q145);
		
		 Question q146 = new Question();
		 q146.setQuestionText("Which category of activities should be identified first when developing a 'Business Activity Model' (BAM)?");
		 Answer a146 = new Answer("Enabling",0);
		 Answer b146 = new Answer("Planning",0);
		 Answer c146 = new Answer("Doing",1);
		 Answer d146 = new Answer("Monitoring",0);
		 q146.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList146 = Arrays.asList(a146, b146, c146, d146);
		 q146.setPossibleAnswers(ansList146);
		 q146.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q146);
		
		 Question q147 = new Question();
		 q147.setQuestionText("Which of the following statements is TRUE?");
		 Answer a147 = new Answer("Improving the business process is concerned with removing problems identified in the AS-IS process.",1);
		 Answer b147 = new Answer("Introducing bottlenecks is an important principle of business process re-design.",0);
		 Answer c147 = new Answer("It is not permissible to show decision diamonds on a swim-lane diagram.",0);
		 Answer d147 = new Answer("Processes cannot be improved by changing the sequence of activities alone.",0);
		 q147.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList147 = Arrays.asList(a147, b147, c147, d147);
		 q147.setPossibleAnswers(ansList147);
		 q147.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q147);
		
		 Question q148 = new Question();
		 q148.setQuestionText("In which stage of the requirements engineering process are requirements checked to see whether they are well formed and SMART?");
		 Answer a148 = new Answer("Requirements Management",0);
		 Answer b148 = new Answer("Requirements Documentation",0);
		 Answer c148 = new Answer("Requirements Analysis",1);
		 Answer d148 = new Answer("Requirements elicitation",0);
		 q148.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList148 = Arrays.asList(a148, b148, c148, d148);
		 q148.setPossibleAnswers(ansList148);
		 q148.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q148);
		
		 Question q149 = new Question();
		 q149.setQuestionText("An airline wishes to assess the punctuality of its flights. What type of business activity would do this?");
		 Answer a149 = new Answer("An enabling activity",0);
		 Answer b149 = new Answer("A controlling activity",0);
		 Answer c149 = new Answer("A planning activity",0);
		 Answer d149 = new Answer("A monitoring activity",1);
		 q149.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList149 = Arrays.asList(a149, b149, c149, d149);
		 q149.setPossibleAnswers(ansList149);
		 q149.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q149);
		
		 Question q150 = new Question();
		 q150.setQuestionText("When are the acceptance criteria for the user acceptance testing defined?");
		 Answer a150 = new Answer("When the deliverables of the system design have been agreed.",0);
		 Answer b150 = new Answer("When the deliverables of the requirements analysis have been agreed.",1);
		 Answer c150 = new Answer("When the software has been completed and has passed system testing.",0);
		 Answer d150 = new Answer("When the users have had the opportunity to use the software for a period of time.",0);
		 q150.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList150 = Arrays.asList(a150, b150, c150, d150);
		 q150.setPossibleAnswers(ansList150);
		 q150.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q150);

		 Question q151 = new Question();
         q151.setNumberOfCorrectAnswers(1);
         q151.setQuestionText("The requirements catalogue documents the business user or users who requested the requirement. Which heading in the requirements catalogue template would this information be recorded?");
         Answer a151 = new Answer("Owner",0);
         Answer b151 = new Answer("Justification",0);
         Answer c151 = new Answer("Author",0);
         Answer d151 = new Answer("Source",1);
         List<Answer> ansList151 = Arrays.asList(a151, b151, c151, d151);
                q151.setPossibleAnswers(ansList151);
                q151.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q151);
         
         Question q152 = new Question();
         q152.setNumberOfCorrectAnswers(1);
         q152.setQuestionText("Which of the following only includes explicit corporate knowledge?");
         Answer a152 = new Answer("Skills, values, communities of practice.",0);
         Answer b152 = new Answer("Job descriptions, tasks, targets.",0);
         Answer c152 = new Answer("Culture, norms, historical data.",0);
         Answer d152 = new Answer("Style guides, procedures, processes.",1);
         List<Answer> ansList152 = Arrays.asList(a152, b152, c152, d152);
                q152.setPossibleAnswers(ansList152);
                q152.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q152);
         
         Question q153 = new Question();
         q153.setNumberOfCorrectAnswers(1);
         q153.setQuestionText("Which of the following approaches is the variation of the Waterfall lifecycle that shows explicitly the link between the analysis stages and the testing stages?");
         Answer a153 = new Answer("V model",1);
         Answer b153 = new Answer("Spiral model",0);
         Answer c153 = new Answer("Unified process",0);
         Answer d153 = new Answer("Workflow model",0);
         List<Answer> ansList153 = Arrays.asList(a153, b153, c153, d153);
                q153.setPossibleAnswers(ansList153);
                q153.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q153);
         
         Question q154 = new Question();
         q154.setNumberOfCorrectAnswers(1);
         q154.setQuestionText("Which of the following is considered by the Boston Box?");
         Answer a154 = new Answer("Power/influence",0);
         Answer b154 = new Answer("Impact",0);
         Answer c154 = new Answer("Market share",1);
         Answer d154 = new Answer("Gross profit",0);
         List<Answer> ansList154 = Arrays.asList(a154, b154, c154, d154);
                q154.setPossibleAnswers(ansList154);
                q154.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q154);
         
         Question q155 = new Question();
         q155.setNumberOfCorrectAnswers(1);
         q155.setQuestionText("In which of the following circumstances is supplier power high?");
         Answer a155 = new Answer("When switching costs are low.",0);
         Answer b155 = new Answer("When there are relatively few customers.",0);
         Answer c155 = new Answer("When the supplier brand is powerful.",1);
         Answer d155 = new Answer("When alternatives are readily available.",0);
         List<Answer> ansList155 = Arrays.asList(a155, b155, c155, d155);
                q155.setPossibleAnswers(ansList155);
                q155.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q155);
         
         Question q156 = new Question();
         q156.setNumberOfCorrectAnswers(1);
         q156.setQuestionText("What does a force-field analysis consider?");
         Answer a156 = new Answer("Forces for and against business change.",1);
         Answer b156 = new Answer("Forces in the competitive environment.",0);
         Answer c156 = new Answer("The financial strength of the company.",0);
         Answer d156 = new Answer("The power of external suppliers.",0);
         List<Answer> ansList156 = Arrays.asList(a156, b156, c156, d156);
                q156.setPossibleAnswers(ansList156);
                q156.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q156);
         
         Question q157 = new Question();
         q157.setNumberOfCorrectAnswers(1);
         q157.setQuestionText("What are business case development, subject matter expertise and procurement all examples of?");
         Answer a157 = new Answer("Behavioural skill competencies required by business analysts.",0);
         Answer b157 = new Answer("Business knowledge competencies required by business analysts.",1);
         Answer c157 = new Answer("Technique competencies required by business analysts.",0);
         Answer d157 = new Answer("Personal knowledge competencies required by business analysts.",0);
         List<Answer> ansList157 = Arrays.asList(a157, b157, c157, d157);
                q157.setPossibleAnswers(ansList157);
                q157.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q157);
         
         Question q158 = new Question();
         q158.setNumberOfCorrectAnswers(1);
         q158.setQuestionText("Which stage of the requirements engineering process precedes requirements validation?");
         Answer a158 = new Answer("Requirements elicitation.",0);
         Answer b158 = new Answer("Requirements analysis.",1);
         Answer c158 = new Answer("Requirements management.",0);
         Answer d158 = new Answer("Requirements documentation.",0);
         List<Answer> ansList158 = Arrays.asList(a158, b158, c158, d158);
                q158.setPossibleAnswers(ansList158);
                q158.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q158);
         
         Question q159 = new Question();
         q158.setNumberOfCorrectAnswers(1);
         q159.setQuestionText("An analyst investigating a sales system wishes to ask questions about how a customer order form is completed in the current system. What investigation technique is the analyst using?");
         Answer a159 = new Answer("Activity sampling",0);
         Answer b159 = new Answer("Protocol analysis",0);
         Answer c159 = new Answer("Document analysis",1);
         Answer d159 = new Answer("Structured observation",0);
         List<Answer> ansList159 = Arrays.asList(a159, b159, c159, d159);
                q159.setPossibleAnswers(ansList159);
                q159.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q159);
         
         Question q160 = new Question();
         q160.setNumberOfCorrectAnswers(1);
         q160.setQuestionText("Which of the following diagrams helps the business analyst to document a range of issues that have been uncovered about a business situation?");
         Answer a160 = new Answer("The rich picture",1);
         Answer b160 = new Answer("The 'to be' process model",0);
         Answer c160 = new Answer("The business activity model",0);
         Answer d160 = new Answer("The use case diagram",0);
         List<Answer> ansList160 = Arrays.asList(a160, b160, c160, d160);
                q160.setPossibleAnswers(ansList160);
                q160.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q160);

		
		 Question q161 = new Question();
		 q161.setNumberOfCorrectAnswers(1);
		 q161.setQuestionText("Which stage of Isaksen and Treffinger’s creative problem-solving model is concerned with analysing the opinions and concerns to identify how information can be quantified?");
		 Answer a161 = new Answer("Mess finding",0);
		 Answer b161 = new Answer("Data finding",1);
		 Answer c161 = new Answer("Problem finding",0);
		 Answer d161 = new Answer("Idea finding",0);
		 List<Answer> ansList161 = Arrays.asList(a161, b161, c161, d161);
		 q161.setPossibleAnswers(ansList161);
		 q161.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q161);
		
		 Question q162 = new Question();
		 q162.setNumberOfCorrectAnswers(1);
		 q162.setQuestionText("The term CATWOE provides a framework for defining and analysing business perspectives. In a project, which letter of CATWOE should be first understood by the business analyst?");
		 Answer a162 = new Answer("The Owner",0);
		 Answer b162 = new Answer("The Customer",0);
		 Answer c162 = new Answer("The Weltanschauung or world-view",1);
		 Answer d162 = new Answer("The Actor",0);
		 List<Answer> ansList162 = Arrays.asList(a162, b162, c162, d162);
		 q162.setPossibleAnswers(ansList162);
		 q162.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q162);
		
		 Question q163 = new Question();
		 q163.setNumberOfCorrectAnswers(1);
		 q163.setQuestionText("Which of the following is likely to be an input into the Analysing the Needs’ stage of the business analysis process model?");
		 Answer a163 = new Answer("Shortlist of business options.",0);
		 Answer b163 = new Answer("Validated requirements document.",0);
		 Answer c163 = new Answer("The business case.",0);
		 Answer d163 = new Answer("Agreed business activity model.",1);
		 List<Answer> ansList163 = Arrays.asList(a163, b163, c163, d163);
		 q163.setPossibleAnswers(ansList163);
		 q163.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q163);
		
		 Question q164 = new Question();
		 q164.setNumberOfCorrectAnswers(1);
		 q164.setQuestionText("An entity type is a template for its entity occurrences. Which of the following is a template for objects?");
		 Answer a164 = new Answer("A class",1);
		 Answer b164 = new Answer("A use case",0);
		 Answer c164 = new Answer("An operation",0);
		 Answer d164 = new Answer("An actor",0);
		 List<Answer> ansList164 = Arrays.asList(a164, b164, c164, d164);
		 q164.setPossibleAnswers(ansList164);
		 q164.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q164);
		
		 Question q165 = new Question();
		 q165.setNumberOfCorrectAnswers(1);
		 q165.setQuestionText("What are subsequent changes subject to once a requirements document has been signed off?");
		 Answer a165 = new Answer("Requirements verification",0);
		 Answer b165 = new Answer("Requirements documentation",0);
		 Answer c165 = new Answer("Requirements validation",0);
		 Answer d165 = new Answer("Requirements management",1);
		 List<Answer> ansList165 = Arrays.asList(a165, b165, c165, d165);
		 q165.setPossibleAnswers(ansList165);
		 q165.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q165);
		
		 Question q166 = new Question();
		 q166.setNumberOfCorrectAnswers(1);
		 q166.setQuestionText("When is the self-esteem of individuals affected by a change process usually at its lowest?");
		 Answer a166 = new Answer("At the end of the stage process.",0);
		 Answer b166 = new Answer("At the start of the change process.",0);
		 Answer c166 = new Answer("At all points during the change process.",0);
		 Answer d166 = new Answer("In the middle phase of the change process.",1);
		 List<Answer> ansList166 = Arrays.asList(a166, b166, c166, d166);
		 q166.setPossibleAnswers(ansList166);
		 q166.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q166);
		
		 Question q167 = new Question();
		 q167.setNumberOfCorrectAnswers(1);
		 q167.setQuestionText("What does the M stand for in MoSCoW?");
		 Answer a167 = new Answer("Mission",0);
		 Answer b167 = new Answer("Must have",1);
		 Answer c167 = new Answer("Management",0);
		 Answer d167 = new Answer("Mandatory",0);
		 List<Answer> ansList167 = Arrays.asList(a167, b167, c167, d167);
		 q167.setPossibleAnswers(ansList167);
		 q167.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q167);
		
		 Question q168 = new Question();
		 q168.setNumberOfCorrectAnswers(1);
		 q168.setQuestionText("Which of the following may be used as a basis for scripting acceptance tests?");
		 Answer a168 = new Answer("Stepwise refinement",0);
		 Answer b168 = new Answer("Context diagrams",0);
		 Answer c168 = new Answer("Mind maps",0);
		 Answer d168 = new Answer("Scenario analysis",1);
		 List<Answer> ansList168 = Arrays.asList(a168, b168, c168, d168);
		 q168.setPossibleAnswers(ansList168);
		 q168.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q168);
		
		 Question q169 = new Question();
		 q169.setNumberOfCorrectAnswers(1);
		 q169.setQuestionText("Which of the following options only includes workshop discovery techniques?");
		 Answer a169 = new Answer("Brainstorming, brainwriting, mind maps.",0);
		 Answer b169 = new Answer("Round robin, post-it exercise, brainstorming.",1);
		 Answer c169 = new Answer("Rich pictures, mind maps, task scenarios",0);
		 Answer d169 = new Answer("Stepwise refinement, context diagrams, process models.",0);
		 List<Answer> ansList169 = Arrays.asList(a169, b169, c169, d169);
		 q169.setPossibleAnswers(ansList169);
		 q169.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q169);
		
		 Question q170 = new Question();
		 q170.setNumberOfCorrectAnswers(1);
		 q170.setQuestionText("Which of following statements is true?");
		 Answer a170 = new Answer("Shadowing is an effective way of preparing test scripts for user acceptance.",0);
		 Answer b170 = new Answer("Rich pictures and mind maps are used to document the requirements for the IT system.",0);
		 Answer c170 = new Answer("Interviews are effective in building a consensus view and securing agreement from a diverse group.",0);
		 Answer d170 = new Answer("Ethnographic Studies are concerned with the long term observation of the business environment.",1);
		 List<Answer> ansList170 = Arrays.asList(a170, b170, c170, d170);
		 q170.setPossibleAnswers(ansList170);
		 q170.setTypeOfExam(typeOfExam);
		 
		 Question q171 = new Question();
		 q171.setNumberOfCorrectAnswers(1);
		 q171.setQuestionText("A business case for a project claims that the new system will provide managers with more time to think creatively about strategic issues. What would this be classified as in a cost-benefit analysis?");
		 Answer a171 = new Answer("An intangible cost", 0);
		 Answer b171 = new Answer("A tangible benefit", 1);
		 Answer c171 = new Answer("An intangible benefit", 0);
		 Answer d171 = new Answer("A tangible cost", 0);
		 List<Answer> ansList171 = Arrays.asList(a171, b171, c171, d171);
			q171.setPossibleAnswers(ansList171);
			q171.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q171);
		
		 Question q172 = new Question();
		 q172.setNumberOfCorrectAnswers(1);
		 q172.setQuestionText("Which of the following BEST describes the cause of a bottleneck in a business process?");
		 Answer a172 = new Answer("A step where one actor passes the process to another actor.", 0);
		 Answer b172 = new Answer("A mismatch between the capacities of related process steps.", 1);
		 Answer c172 = new Answer("An unnecessary step or steps in a sequence of process steps.", 0);
		 Answer d172 = new Answer("A number of related steps that are carried out by different actors.", 0);
		 List<Answer> ansList172 = Arrays.asList(a172, b172, c172, d172);
			q172.setPossibleAnswers(ansList172);
			q172.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q172);
		
		 Question q173 = new Question();
		 q173.setNumberOfCorrectAnswers(1);
		 q173.setQuestionText("Which of the following diagrams explicitly shows the sequence of tasks?");
		 Answer a173 = new Answer("A swim-lane diagram.", 1);
		 Answer b173 = new Answer("A use case diagram.", 0);
		 Answer c173 = new Answer("A business activity model.", 0);
		 Answer d173 = new Answer("A class model.", 0);
		 List<Answer> ansList173 = Arrays.asList(a173, b173, c173, d173);
			q173.setPossibleAnswers(ansList173);
			q173.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q173);
		
		 Question q174 = new Question();
		 q174.setNumberOfCorrectAnswers(1);
		 q174.setQuestionText("Which of the following BEST describes the term value proposition?");
		 Answer a174 = new Answer("The net present value of a proposed project.", 0);
		 Answer b174 = new Answer("The value that a product or service offers to customers.", 1);
		 Answer c174 = new Answer("The proposed value of benefits in a cost-benefit analysis.", 0);
		 Answer d174 = new Answer("The value of the Internal Rate of Return of a project.", 0);
		 List<Answer> ansList174 = Arrays.asList(a174, b174, c174, d174);
			q174.setPossibleAnswers(ansList174);
			q174.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q174);
		
		 Question q175 = new Question();
		 q175.setNumberOfCorrectAnswers(1);
		 q175.setQuestionText("Which of the following is an advantage to the host organisation of using an internal consultant to conduct a business analysis project?");
		 Answer a175 = new Answer("They will have a broad business perspective.", 0);
		 Answer b175 = new Answer("They will be familiar with the host organisation.", 1);
		 Answer c175 = new Answer("They will only be paid when they are needed.", 0);
		 Answer d175 = new Answer("They will have a dispassionate view of the host organisation", 0);
		 List<Answer> ansList175 = Arrays.asList(a175, b175, c175, d175);
			q175.setPossibleAnswers(ansList175);
			q175.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q175);
		
		 Question q176 = new Question();
		 q176.setNumberOfCorrectAnswers(1);
		 q176.setQuestionText("Which of the following statements about business activity models (BAMs) is correct?");
		 Answer a176 = new Answer("A BAM flowcharts the sequence of business events.", 0);
		 Answer b176 = new Answer("A BAM will show who carries out business activities.", 0);
		 Answer c176 = new Answer("A BAM is a model of the organisations processes.", 0);
		 Answer d176 = new Answer("A BAM will be defined for each business perspective.", 1);
		 List<Answer> ansList176 = Arrays.asList(a176, b176, c176, d176);
			q176.setPossibleAnswers(ansList176);
			q176.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q176);
		
		 Question q177 = new Question();
		 q177.setNumberOfCorrectAnswers(1);
		 q177.setQuestionText("The senior managers of an organisation recognise that they employ knowledgeable, committed staff. Under which category of a SWOT will this be recorded?");
		 Answer a177 = new Answer("Weaknesses", 0);
		 Answer b177 = new Answer("Opportunities ", 0);
		 Answer c177 = new Answer("Threats", 0);
		 Answer d177 = new Answer("Strengths", 1);
		 List<Answer> ansList177 = Arrays.asList(a177, b177, c177, d177);
			q177.setPossibleAnswers(ansList177);
			q177.setTypeOfExam(typeOfExam);
			questionService.newQuestion(q177);
		
		 Question q178 = new Question();
		 q178.setNumberOfCorrectAnswers(1);
		 q178.setQuestionText("Which of the following represents the total cash flows of an investment, over a period of time, adjusted to reflect the time value of money?");
		 Answer a178 = new Answer("The Internal Rate of Return", 0);
		 Answer b178 = new Answer("The Time to Paycheck.", 0);
		 Answer c178 = new Answer("The Net Present Value.", 1);
		 Answer d178 = new Answer("The Return on Investment.", 0);
		 List<Answer> ansList178 = Arrays.asList(a178, b178, c178, d178);
			q178.setPossibleAnswers(ansList178);
			q178.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q178);
		
		 Question q179 = new Question();
		 q179.setNumberOfCorrectAnswers(1);
		 q179.setQuestionText("A business analyst wishes to show that a company wants to store information about different types of product. Some attributes are common to every product (for example: product name) but other attributes only apply to certain product types. Forexample, product material only applies to accessory products. Whichof the following constructs could the business analyst use to represent this on a class model?");
		 Answer a179 = new Answer("An association class.", 0);
		 Answer b179 = new Answer("A many-to-many multiplicity.", 1);
		 Answer c179 = new Answer("A generalisation structure.", 0);
		 Answer d179 = new Answer("An << extend >> structure.", 0);
		 List<Answer> ansList179 = Arrays.asList(a179, b179, c179, d179);
			q179.setPossibleAnswers(ansList179);
			q179.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q179);
		
		 Question q180 = new Question();
		 q180.setNumberOfCorrectAnswers(1);
		 q180.setQuestionText("Which of the following would BEST be managed with the 'keep satisfied' stakeholder management strategy?");
		 Answer a180 = new Answer("Those with high power/influence and no interest in the project.", 0);
		 Answer b180 = new Answer("Those with high power/influence and some interest in the  project.", 1);
		 Answer c180 = new Answer("Those with some power/influence and high interest in the project.", 0);
		 Answer d180 = new Answer("Those with some power/influence and some interest in the project.", 0);
		 List<Answer> ansList180 = Arrays.asList(a180, b180, c180, d180);
			q180.setPossibleAnswers(ansList180);
			q180.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q180);
		
		 Question q181 = new Question();
		 q181.setNumberOfCorrectAnswers(1);
		 q181.setQuestionText("Which of the following would be an appropriate name for a use case that allows a project manager to allocate resources to a project?");
		 Answer a181 = new Answer("Assign resources", 1);
		 Answer b181 = new Answer("Resource", 0);
		 Answer c181 = new Answer("Project Manager", 0);
		 Answer d181 = new Answer("Project", 0);
		 List<Answer> ansList181 = Arrays.asList(a181, b181, c181, d181);
			q181.setPossibleAnswers(ansList181);
			q181.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q181);
		
		 Question q182 = new Question();
		 q182.setNumberOfCorrectAnswers(1);
		 q182.setQuestionText("Which of the following lists includes only activities that are defined as support activities in the value chain?");
		 Answer a182 = new Answer("Firm infrastructure, service, marketing and sales.", 0);
		 Answer b182 = new Answer("Inbound logistics, outbound logistics, operations.", 1);
		 Answer c182 = new Answer("Procurement, technology development, human resource management.", 0);
		 Answer d182 = new Answer("Service, procurement, firm infrastructure.", 0);
		 List<Answer> ansList182 = Arrays.asList(a182, b182, c182, d182);
			q182.setPossibleAnswers(ansList182);
			q182.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q182);
		
		 Question q183 = new Question();
		 q183.setNumberOfCorrectAnswers(1);
		 q183.setQuestionText("What is the business analyst doing when he or she compares the BAM with the current business situation?");
		 Answer a183 = new Answer("Conceptual modelling.", 0);
		 Answer b183 = new Answer("Analysing perspective.", 0);
		 Answer c183 = new Answer("Gap analysis.", 1);
		 Answer d183 = new Answer("Defining CATWOE.", 0);
		 List<Answer> ansList183 = Arrays.asList(a183, b183, c183, d183);
			q183.setPossibleAnswers(ansList183);
			q183.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q183);
		
		 Question q184 = new Question();
		 q184.setNumberOfCorrectAnswers(1);
		 q184.setQuestionText("An IT department needs to upgrade its hardware to run the new version of an established operating system. The cost of this required upgrade is $2 million. As an alternative, the IT director has suggested that the company should change to a completely different operating system. Although this will cost $6 million, thechange will bring many other benefits, including cheaper maintenance costs and increased security. What is the avoided cost in his proposal?");
		 Answer a184 = new Answer("$2 million", 1);
		 Answer b184 = new Answer("$4 million", 0);
		 Answer c184 = new Answer("$6 million", 0);
		 Answer d184 = new Answer("$8 million", 0);
		 List<Answer> ansList184 = Arrays.asList(a184, b184, c184, d184);
			q184.setPossibleAnswers(ansList184);
			q184.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q184);
		
		
		 // Special Questions Tables pictures new lines and other problems
		 Question q185 = new Question();
		 q185.setNumberOfCorrectAnswers(1);
		 q185.setQuestionText("Which of the following are steps in the Isaksen and Treffinger's creative problem solving model? <br> a. Mess Finding<br> b. Data Modelling <br> c. Process Finding <br> d. Problem Finding <br> e. Solution Finding");
		 Answer a185 = new Answer("a, b, c and d ", 0);
		 Answer b185 = new Answer("b, c and e", 0);
		 Answer c185 = new Answer("a, d and e", 1);
		 Answer d185 = new Answer("a, c, d and e", 0);
		 List<Answer> ansList185 = Arrays.asList(a185, b185, c185, d185);
			q185.setPossibleAnswers(ansList185);
			q185.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q185);
		
		 Question q186 = new Question();
		 q186.setNumberOfCorrectAnswers(1);
		 q186.setQuestionText("Business Analysis competencies are divided into three groups. Which of the following are the groups of competencies for a Business Analyst? <br> a. IT skills <br> b. BehaviouralManagement Support <br> c. Techniques <br> d. Project ManagementSupport <br> e. Business knowledge ");
		 Answer a186 = new Answer("b, c and e", 1);
		 Answer b186 = new Answer("a, b and e", 0);
		 Answer c186 = new Answer("b, c and d", 0);
		 Answer d186 = new Answer("a, d and e", 0);
		 List<Answer> ansList186 = Arrays.asList(a186, b186, c186, d186);
			q186.setPossibleAnswers(ansList186);
			q186.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q186);
		
//		 Question q187 = new Question();
//		 q187.setNumberOfCorrectAnswers(1);
//		 q187.setQuestionText("The table below shows the costs and savings associated with a project. In which of the following years does the project break even? <table> <tbody> <tr> <td>Item</td> <td>Year 0</td> <td>Year 1</td> <td>Year 2</td> <td>Year 3</td> <td>Year 4</td> </tr> <tr> <td>Hardware</td> <td>250000</td> <td>0</td>	 <td>0</td> <td>0</td> <td>0</td> </tr> <tr> <td>Software</td>	 <td>75000</td> <td>0</td> <td>0</td> <td>0</td> <td>0</td> </tr> <tr> <td>Maintenance </td> <td>10000</td> <td>11000</td> <td>12000</td>	 <td>13000</td> <td>14000</td> </tr> <tr> <td>User Training </td> <td>5000</td> <td>0</td> <td>0</td> <td>0</td> <td>0</td> </tr> <tr> <td></td> <td></td> <td></td> <td></td> <td></td> <td></td> </tr> <tr> <td>Savings</td> <td>40000</td> <td>100000</td> <td>100000</td> <td>100000</td> <td>100000</td> </tr> </tbody> </table>");
//		 Answer a187 = new Answer("Year 2", 0);
//		 Answer b187 = new Answer("Year 3", 0);
//		 Answer c187 = new Answer("Year 4", 0);
//		 Answer d187 = new Answer("The project does not pay back within the four year period.", 0);
//		 List<Answer> ansList187 = Arrays.asList(a187, b187, c187, d187);
//			q187.setPossibleAnswers(ansList187);
//			q187.setTypeOfExam(typeOfExam);
//		 questionService.newQuestion(q187);
		
		 Question q188 = new Question();
		 q188.setNumberOfCorrectAnswers(1);
		 q188.setQuestionText("The following is a list of statements concerning investigation techniques. <br> a. Questionnaires are an effective way of developing rapport with the business users. <br> b. Workshops are an effective way of obtaining user buy-in and acceptance. <br> c. Protocol analysis involves following a user for a period to find out what they do. <br> d. Scenarios can be used as an effective basis for the development of prototypes. <br> Which of the following is correct?");
		 Answer a188 = new Answer("Statements a and c are incorrect, statements b and d are correct.", 1);
		 Answer b188 = new Answer("Statements a and d are incorrect, statements b and c are correct.", 0);
		 Answer c188 = new Answer("Statements b and c are incorrect, statements a and d are correct.", 0);
		 Answer d188 = new Answer("Statements c and d are incorrect, statements a and b are correct.", 0);
		 List<Answer> ansList188 = Arrays.asList(a188, b188, c188, d188);
			q188.setPossibleAnswers(ansList188);
			q188.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q188);
		
		 Question q189 = new Question();
		 q189.setNumberOfCorrectAnswers(1);
		 q189.setQuestionText("The following is a list of statements about stakeholders and stakeholder management. <br> a) A customer can be considered as a stakeholder in a project. <br> b) A supplier can be considered as a stakeholder in a project. <br> c) Stakeholders positions do not remain static during the life of the project. <br> d) Communication must not be tailored to each stakeholder in the project. <br> Which of the following is correct?");
		 Answer a189 = new Answer("Statements a, b and c are correct, statement d is incorrect.", 1);
		 Answer b189 = new Answer("All four statements are correct.", 0);
		 Answer c189 = new Answer("Statements a and c are correct, statements b and d are incorrect.", 0);
		 Answer d189 = new Answer("Statements b and c are correct, statements a and d are incorrect.", 0);
		 List<Answer> ansList189 = Arrays.asList(a189, b189, c189, d189);
			q189.setPossibleAnswers(ansList189);
			q189.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q189);
		
		 Question q190 = new Question();
		 q190.setNumberOfCorrectAnswers(1);
		 q190.setQuestionText("The table below shows the costs and savings associated with a project. In which of the following years does the project break even? <table> <tbody> <tr> <td></td> <td>Year 1</td> <td>Year 2</td> <td>Year 3</td> <td>Year 4</td> <td>Year 5</td> </tr> <tr> <td>Software cost</td> <td>45000</td> <td>0</td> <td>0</td> <td>0</td> <td>0</td> </tr> <tr> <td>Maintenance </td> <td>5000</td> <td>5000</td> <td>5000</td> <td>5000</td> <td>5000</td> </tr> <tr> <td>Staff savings </td> <td>8000</td> <td>8000</td> <td>8000</td> <td>8000</td> <td>8000</td> </tr> <tr> <td>Other savings</td> <td>7000</td> <td>7000</td> <td>7000</td> <td>7000</td> <td>7000</td> </tr> </tbody> </table>");
		 Answer a190 = new Answer("Year 4.", 0);
		 Answer b190 = new Answer("Year 5.", 1);
		 Answer c190 = new Answer("Year 3.", 0);
		 Answer d190 = new Answer("The project does not break even.", 0);
		 List<Answer> ansList190 = Arrays.asList(a190, b190, c190, d190);
			q190.setPossibleAnswers(ansList190);
			q190.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q190);
		
		 Question q191 = new Question();
		 q191.setNumberOfCorrectAnswers(1);
		 q191.setQuestionText("How would usability and performance requirements be classified?");
		 Answer a191 = new Answer("As general requirements.", 0);
		 Answer b191 = new Answer("As technical requirements.", 0);
		 Answer c191 = new Answer("As functional requirements.", 0);
		 Answer d191 = new Answer("As non-functional requirements.", 1);
		 List<Answer> ansList191 = Arrays.asList(a191, b191, c191, d191);
			q191.setPossibleAnswers(ansList191);
			q191.setTypeOfExam(typeOfExam);
			questionService.newQuestion(q191);
		
		 Question q192 = new Question();
		 q192.setNumberOfCorrectAnswers(1);
		 q192.setQuestionText("The entity relationship model below shows the relationship between Product and Order. Which of the following business rules is correct and is reflected in the diagram? <br> <img src=\"../../assets/bildquestion89.png\" />");
		 Answer a192 = new Answer("The maximum number of products on one order is eight.", 1);
		 Answer b192 = new Answer("The maximum number of products on one order is unlimited.", 0);
		 Answer c192 = new Answer("The minimum number of orders for each product is one.", 0);
		 Answer d192 = new Answer("The minimum number of products on each order is zero.", 0);
		 List<Answer> ansList192 = Arrays.asList(a192, b192, c192, d192);
			q192.setPossibleAnswers(ansList192);
			q192.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q192);
		
		 Question q193 = new Question();
		 q193.setNumberOfCorrectAnswers(1);
		 q193.setQuestionText("The entity relationship model below shows the relationship between Customer and Order. Which of the following business rules is correct? <br> <imgsrc=\"../../assets/bildquestion157.PNG\" />");
		 Answer a193 = new Answer("An order may be placed by many customers.", 0);
		 Answer b193 = new Answer("A customer may place many orders.", 1);
		 Answer c193 = new Answer("A customer may never place an order.", 0);
		 Answer d193 = new Answer("An order need not be placed by a customer.", 0);
		 List<Answer> ansList193 = Arrays.asList(a193, b193, c193, d193);
			q193.setPossibleAnswers(ansList193);
			q193.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q193);
		
		 Question q194 = new Question();
		 q194.setNumberOfCorrectAnswers(1);
		 q194.setQuestionText("Which of the following is not normally considered to be within the range of a Business Analysts responsibilities?");
		 Answer a194 = new Answer("Strategic Analysis", 0);
		 Answer b194 = new Answer("Business Analysis", 0);
		 Answer c194 = new Answer("Systems Analysis", 0);
		 Answer d194 = new Answer("Product Analysis", 1);
		 List<Answer> ansList194 = Arrays.asList(a194, b194, c194, d194);
			q194.setPossibleAnswers(ansList194);
			q194.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q194);
		
		 Question q195 = new Question();
		 q195.setNumberOfCorrectAnswers(1);
		 q195.setQuestionText("What are the three principal competences of a Business Analyst?");
		 Answer a195 = new Answer("Investigate, Identify, Application", 0);
		 Answer b195 = new Answer("Behavioural/Personal Skills, Business Knowledge, Professional Techniques", 1);
		 Answer c195 = new Answer("Experience, Soft Skills, Negotiation Skill", 0);
		 Answer d195 = new Answer("Techniques, Behavioural/Personal Skills, Communication", 0);
		 List<Answer> ansList195 = Arrays.asList(a195, b195, c195, d195);
			q195.setPossibleAnswers(ansList195);
			q195.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q195);
		
		 Question q196 = new Question();
		 q196.setNumberOfCorrectAnswers(1);
		 q196.setQuestionText("Which of the following is considered an advantage of employing an internal Business Analyst consultant?");
		 Answer a196 = new Answer("Broad business perspective", 0);
		 Answer b196 = new Answer("Lack of accountability", 0);
		 Answer c196 = new Answer("Knowledge of organisation", 1);
		 Answer d196 = new Answer("Employed when needed", 0);
		 List<Answer> ansList196 = Arrays.asList(a196, b196, c196, d196);
			q196.setPossibleAnswers(ansList196);
			q196.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q196);
		
		 Question q197 = new Question();
		 q197.setNumberOfCorrectAnswers(1);
		 q197.setQuestionText("What primary task does a systems analyst perform?");
		 Answer a197 = new Answer("Carry out strategic analysis", 0);
		 Answer b197 = new Answer("Define IT systems requirements", 1);
		 Answer c197 = new Answer("Investigate business requirements ", 0);
		 Answer d197 = new Answer("Undertake cost/benefit analysis", 0);
		 List<Answer> ansList197 = Arrays.asList(a197, b197, c197, d197);
			q197.setPossibleAnswers(ansList197);
			q197.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q197);
		
		 Question q198 = new Question();
		 q198.setNumberOfCorrectAnswers(1);
		 q198.setQuestionText("Which of the following is NOT considered a valued way of working in Agile practice, as stated in the Agile Manifesto?");
		 Answer a198 = new Answer("Individuals and interactions over processes and tools", 0);
		 Answer b198 = new Answer("Working software over comprehensive documentation", 0);
		 Answer c198 = new Answer("Contract negotiation over Customer collaboration", 1);
		 Answer d198 = new Answer("Responding to change over following a plan", 0);
		 List<Answer> ansList198 = Arrays.asList(a198, b198, c198, d198);
			q198.setPossibleAnswers(ansList198);
			q198.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q198);
		
		 Question q199 = new Question();
		 q199.setNumberOfCorrectAnswers(1);
		 q199.setQuestionText("Which of the following are normally regarded as the four key views of a business system?");
		 Answer a199 = new Answer("Organisation, People, Resources, Information & Technology", 0);
		 Answer b199 = new Answer("People, Technology, Resources, Process", 0);
		 Answer c199 = new Answer("Process, Organisation, People, Information & Technology", 1);
		 Answer d199 = new Answer("Technology, Process, Organisation, Information", 0);
		 List<Answer> ansList199 = Arrays.asList(a199, b199, c199, d199);
			q199.setPossibleAnswers(ansList199);
			q199.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q199);
		
		 Question q200 = new Question();
		 q200.setNumberOfCorrectAnswers(1);
		 q200.setQuestionText("Businesses are motivated by different targets at different levels within the organisation. Which of the following best represents a sequential description of these motivations?");
		 Answer a200 = new Answer("Mission, Objective, Strategy", 1);
		 Answer b200 = new Answer("Strategy, Mission, Objective", 0);
		 Answer c200 = new Answer("Mission, Strategy, Objective", 0);
		 Answer d200 = new Answer("Objective, Mission, Strategy", 0);
		 List<Answer> ansList200 = Arrays.asList(a200, b200, c200, d200);
			q200.setPossibleAnswers(ansList200);
			q200.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q200);

		 
		 Question q201 = new Question();
         q201.setNumberOfCorrectAnswers(1);
         q201.setQuestionText("Within a Balanced Business Scorecard, what technique would be most suitable for Vision and Strategy?");
         Answer a201 = new Answer("SWOT", 0);
         Answer b201 = new Answer("PESTLE", 0);
         Answer c201 = new Answer("MOST", 1);
         Answer d201 = new Answer("Five Forces", 0);
         List<Answer> ansList201 = Arrays.asList(a201, b201, c201, d201);
         q201.setPossibleAnswers(ansList201);
         q201.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q201);
         
         Question q202 = new Question();
         q202.setNumberOfCorrectAnswers(1);
         q202.setQuestionText("Which of the following is not a TANGIBLE resource of a Resource Audit?");
         Answer a202 = new Answer("Reputation", 1);
         Answer b202 = new Answer("Physical", 0);
         Answer c202 = new Answer("Human", 0);
         Answer d202 = new Answer("Financial", 0);
         List<Answer> ansList202 = Arrays.asList(a202, b202, c202, d202);
         q202.setPossibleAnswers(ansList202);
         q202.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q202);
  
         Question q203 = new Question();
         q203.setNumberOfCorrectAnswers(1);
         q203.setQuestionText("Within a Boston Box, if a product has low market growth and high market share, it is said to be a:");
         Answer a203 = new Answer("Star", 0);
         Answer b203 = new Answer("Dog", 0);
         Answer c203 = new Answer("Cash Cow", 1);
         Answer d203 = new Answer("Wild Cat", 0);
         List<Answer> ansList203 = Arrays.asList(a203, b203, c203, d203);
         q203.setPossibleAnswers(ansList203);
         q203.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q203);
  
         Question q204 = new Question();
         q204.setNumberOfCorrectAnswers(1);
         q204.setQuestionText("Within a SWOT analysis, the external influences  are:");
         Answer a204 = new Answer("Opportunities & Strength", 0);
         Answer b204 = new Answer("Weaknesses & Strengths", 0);
         Answer c204 = new Answer("Threats & Opportunities", 1);
         Answer d204 = new Answer("Threats & Strength", 0);
         List<Answer> ansList204 = Arrays.asList(a204, b204, c204, d204);
         q204.setPossibleAnswers(ansList204);
         q204.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q204);
         
         Question q205 = new Question();
         q205.setNumberOfCorrectAnswers(1);
         q205.setQuestionText("In what circumstances do suppliers have highbargaining power?");
         Answer a205 = new Answer("When the cost of the product is low", 0);
         Answer b205 = new Answer("When the cost of switching to another supplier is high", 1);
         Answer c205 = new Answer("When there are plenty of alternate sources", 0);
         Answer d205 = new Answer("When the product is well advertised", 0);
         List<Answer> ansList205 = Arrays.asList(a205, b205, c205, d205);
         q205.setPossibleAnswers(ansList205);
         q205.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q205);
                
         Question q206 = new Question();
         q206.setNumberOfCorrectAnswers(1);
         q206.setQuestionText("Which of the following is an internal environment analysis tool?");
         Answer a206 = new Answer("Resource audit", 1);
         Answer b206 = new Answer("PESTLE", 0);
         Answer c206 = new Answer("SWOT", 0);
         Answer d206 = new Answer("5 forces", 0);
         List<Answer> ansList206 = Arrays.asList(a206, b206, c206, d206);
         q206.setPossibleAnswers(ansList206);
         q206.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q206);
         
         Question q207 = new Question();
         q207.setNumberOfCorrectAnswers(1);
         q207.setQuestionText("In addition to the six key stages of the Business Analysis Process Model, there is also a stage which runs in parallel throughout these. This stage is called?");
         Answer a207 = new Answer("Business analysis maturity modelling", 0);
         Answer b207 = new Answer("Business Context", 1);
         Answer c207 = new Answer("Business systems modelling", 0);
         Answer d207 = new Answer("Business problem solving", 0);
         List<Answer> ansList207 = Arrays.asList(a207, b207, c207, d207);
         q207.setPossibleAnswers(ansList207);
         q207.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q207);
  
         Question q208 = new Question();
         q208.setNumberOfCorrectAnswers(1);
         q208.setQuestionText("Throughout the Business Analysis Process Model, perspectives are analysed for each");
         Answer a208 = new Answer("Department", 0);
         Answer b208 = new Answer("Actor", 0);
         Answer c208 = new Answer("Stakeholder", 1);
         Answer d208 = new Answer("Team Member", 0);
         List<Answer> ansList208 = Arrays.asList(a208, b208, c208, d208);
         q208.setPossibleAnswers(ansList208);
         q208.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q208);
         
  
         Question q209 = new Question();
         q209.setNumberOfCorrectAnswers(1);
         q209.setQuestionText("Within the Problem Solving Model, the phase after idea finding is");
         Answer a209 = new Answer("Acceptance Finding", 0);
         Answer b209 = new Answer("Solution Finding", 1);
         Answer c209 = new Answer("Data Finding", 0);
         Answer d209 = new Answer("Problem Finding", 0);
         List<Answer> ansList209 = Arrays.asList(a209, b209, c209, d209);
         q209.setPossibleAnswers(ansList209);
         q209.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q209);
         
  
         Question q210 = new Question();
         q210.setNumberOfCorrectAnswers(1);
         q210.setQuestionText("At which stage of a Business Analysis Process Model would you conduct a Gap Analysis?");
         Answer a210 = new Answer("Evaluate Options", 0);
         Answer b210 = new Answer("Analyse Needs", 1);
         Answer c210 = new Answer("Define Requirements", 0);
         Answer d210 = new Answer("Consider Perspectives", 0);
         List<Answer> ansList210 = Arrays.asList(a210, b210, c210, d210);
         q210.setPossibleAnswers(ansList210);
         q210.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q210);
  
         Question q211 = new Question();
         q211.setNumberOfCorrectAnswers(1);
         q211.setQuestionText("Which of the following is NOT a recognised investigation technique?");
         Answer a211 = new Answer("Document Analysis", 0);
         Answer b211 = new Answer("Facilitated Workshop", 0);
         Answer c211 = new Answer("Observation", 0);
         Answer d211 = new Answer("Prioritisation", 1);
         List<Answer> ansList211 = Arrays.asList(a211, b211, c211, d211);
         q211.setPossibleAnswers(ansList211);
         q211.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q211);
         
         
         Question q212 = new Question();
         q212.setNumberOfCorrectAnswers(1);
         q212.setQuestionText("What is Ethnographic Study?");
         Answer a212 = new Answer("The analyst spends an extended time within the business area", 1);
         Answer b212 = new Answer("The analyst uses diagrams to describe the situation", 0);
         Answer c212 = new Answer("The analyst considers the ethnic groups of the users", 0);
         Answer d212 = new Answer("The analyst studies the demographics of the area", 0);
         List<Answer> ansList212 = Arrays.asList(a212, b212, c212, d212);
         q212.setPossibleAnswers(ansList212);
         q212.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q212);
         
         Question q213 = new Question();
         q213.setNumberOfCorrectAnswers(1);
         q213.setQuestionText("Which of the following is not a recognised type of observation?");
         Answer a213 = new Answer("Formal", 0);
         Answer b213 = new Answer("Sampling", 1);
         Answer c213 = new Answer("Protocol", 0);
         Answer d213 = new Answer("Shadowing", 0);
         List<Answer> ansList213 = Arrays.asList(a213, b213, c213, d213);
         q213.setPossibleAnswers(ansList213);
         q213.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q213);
         
         Question q214 = new Question();
         q214.setNumberOfCorrectAnswers(1);
         q214.setQuestionText("Which of the following is NOT a quantitative investigation technique?");
         Answer a214 = new Answer("Document Analysis", 0);
         Answer b214 = new Answer("Special Purpose Records", 0);
         Answer c214 = new Answer("Activity Sampling", 0);
         Answer d214 = new Answer("Prototyping", 1);
         List<Answer> ansList214 = Arrays.asList(a214, b214, c214, d214);
         q214.setPossibleAnswers(ansList214);
         q214.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q214);
  
         Question q215 = new Question();
         q215.setNumberOfCorrectAnswers(1);
         q215.setQuestionText("If you wish to build a good relationship with stakeholders and extract detailed information, which of the following investigation techniques should you use?");
         Answer a215 = new Answer("Shadowing", 0);
         Answer b215 = new Answer("Formal observation", 0);
         Answer c215 = new Answer("Questionnaires", 0);
         Answer d215 = new Answer("Interviewing", 1);
         List<Answer> ansList215 = Arrays.asList(a215, b215, c215, d215);
         q215.setPossibleAnswers(ansList215);
         q215.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q215);
         
         Question q216 = new Question();
         q216.setNumberOfCorrectAnswers(1);
         q216.setQuestionText("Which of the following is a disadvantage of using special purpose records?");
         Answer a216 = new Answer("Cost effective way of obtaining data", 0);
         Answer b216 = new Answer("Accuracy of the returned data", 1);
         Answer c216 = new Answer("Ineffective use of the analysts time", 0);
         Answer d216 = new Answer("Collect a lot of data very quickly", 0);
         List<Answer> ansList216 = Arrays.asList(a216, b216, c216, d216);
         q216.setPossibleAnswers(ansList216);
         q216.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q216);
                      
         Question q217 = new Question();
         q217.setNumberOfCorrectAnswers(1);
         q217.setQuestionText("Which of the following are suitable analysis techniques for use with Agile requirements?");
         Answer a217 = new Answer("Workshop, Hothousing, Scenario Analysis, Questionnaires", 0);
         Answer b217 = new Answer("Workshop, Scenario Analysis, Prototyping, Questionnaires", 0);
         Answer c217 = new Answer("Shadowing, Workshop, Hothousing, Scenario Analysis, Prototyping", 1);
         Answer d217 = new Answer("Shadowing, Workshop, Hothousing, Activity Sampling, Prototyping", 0);
         List<Answer> ansList217 = Arrays.asList(a217, b217, c217, d217);
         q217.setPossibleAnswers(ansList217);
         q217.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q217);
                      
         Question q218 = new Question();
         q218.setNumberOfCorrectAnswers(1);
         q218.setQuestionText("Which of the following best describes when the stakeholders will hold the positions on a power/interest grid?");
         Answer a218 = new Answer("At a specific point in time", 1);
         Answer b218 = new Answer("At the start of the BA process", 0);
         Answer c218 = new Answer("At the end of the project", 0);
         Answer d218 = new Answer("During business case production", 0);
         List<Answer> ansList218 = Arrays.asList(a218, b218, c218, d218);
         q218.setPossibleAnswers(ansList218);
         q218.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q218);
  
         
         Question q219 = new Question();
         q219.setNumberOfCorrectAnswers(1);
         q219.setQuestionText("Which type of stakeholder will work actively to impede the project because they do not agree with its objectives?");
         Answer a219 = new Answer("Blocker", 0);
         Answer b219 = new Answer("Critic", 0);
         Answer c219 = new Answer("Opponent", 1);
         Answer d219 = new Answer("Champion", 0);
         List<Answer> ansList219 = Arrays.asList(a219, b219, c219, d219);
         q219.setPossibleAnswers(ansList219);
         q219.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q219);
  
         
         Question q220 = new Question();
         q220.setNumberOfCorrectAnswers(1);
         q220.setQuestionText("On the power/interest grid, how should one deal with stakeholders with high power, and medium interest?");
         Answer a220 = new Answer("Watch", 0);
         Answer b220 = new Answer("Keep Satisfied", 1);
         Answer c220 = new Answer("Keep Onside", 0);
         Answer d220 = new Answer("Keep Informed", 0);
         List<Answer> ansList220 = Arrays.asList(a220, b220, c220, d220);
         q220.setPossibleAnswers(ansList220);
         q220.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q220);

		 
		 Question q221 = new Question();
		 q221.setQuestionText("On the power/interest grid, how should one deal with stakeholders with high power, and medium interest?");
		 Answer a221 = new Answer("Critic",0);
		 Answer b221 = new Answer("Champion",0);
		 Answer c221 = new Answer("Blocker",0);
		 Answer d221 = new Answer("Supporter",1);
		 q221.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList221 = Arrays.asList(a221, b221, c221, d221);
		 q221.setPossibleAnswers(ansList221);
		 q221.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q221);
		
		 Question q222 = new Question();
		 q222.setQuestionText("Which of the following is not an element in the CATWOE technique?");
		 Answer a222 = new Answer("Actors",0);
		 Answer b222 = new Answer("Trainers",1);
		 Answer c222 = new Answer("Customers",0);
		 Answer d222 = new Answer("Owners",0);
		 q222.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList222 = Arrays.asList(a222, b222, c222, d222);
		 q222.setPossibleAnswers(ansList222);
		 q222.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q222);
		
		 Question q223 = new Question();
		 q223.setQuestionText("Which of the following do business perspectives/root definitions (CATWOE) and business activity models (BAM) show?");
		 Answer a223 = new Answer("A conceptual view of a preferred future",0);
		 Answer b223 = new Answer("The actual view of the current situation",0);
		 Answer c223 = new Answer("The analystâ€™s opinion of what is needed",1);
		 Answer d223 = new Answer("The sponsors view of their requirement",0);
		 q223.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList223 = Arrays.asList(a223, b223, c223, d223);
		 q223.setPossibleAnswers(ansList223);
		 q223.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q223);
		
		 Question q224 = new Question();
		 q224.setQuestionText("What do the arrows on a Business Activity Model represent?");
		 Answer a224 = new Answer("Flow",0);
		 Answer b224 = new Answer("Dependency",1);
		 Answer c224 = new Answer("Priority",0);
		 Answer d224 = new Answer("Time",0);
		 q224.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList224 = Arrays.asList(a224, b224, c224, d224);
		 q224.setPossibleAnswers(ansList224);
		 q224.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q224);
		
		 Question q225 = new Question();
		 q225.setQuestionText("The first activity of a BAM is the doing activity, this links to the CATWOE element");
		 Answer a225 = new Answer("Owner",0);
		 Answer b225 = new Answer("Environment",0);
		 Answer c225 = new Answer("Weltanschauung - World View",0);
		 Answer d225 = new Answer("Transformation",1);
		 q225.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList225 = Arrays.asList(a225, b225, c225, d225);
		 q225.setPossibleAnswers(ansList225);
		 q225.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q225);
		
		 Question q226 = new Question();
		 q226.setQuestionText("The three triggers for a business activity are ");
		 Answer a226 = new Answer("External, Operational, Time-Based",0);
		 Answer b226 = new Answer("Constraints, Operational, Internal",0);
		 Answer c226 = new Answer("Internal, External, Time-Based",1);
		 Answer d226 = new Answer("Internal, External, Operational",0);
		 q226.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList226 = Arrays.asList(a226, b226, c226, d226);
		 q226.setPossibleAnswers(ansList226);
		 q226.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q226);
		
		 Question q227 = new Question();
		 q227.setQuestionText("In what part of the BAM are Critical Success Factors (CSFs) defined?");
		 Answer a227 = new Answer("Monitoring",0);
		 Answer b227 = new Answer("Planning",1);
		 Answer c227 = new Answer("Doing",0);
		 Answer d227 = new Answer("Controlling",0);
		 q227.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList227 = Arrays.asList(a227, b227, c227, d227);
		 q227.setPossibleAnswers(ansList227);
		 q227.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q227);
		
		 Question q228 = new Question();
		 q228.setQuestionText("The bulls-eye symbol on a business process model represents");
		 Answer a228 = new Answer("The start of the process",0);
		 Answer b228 = new Answer("A decision point",0);
		 Answer c228 = new Answer("The end of the process",1);
		 Answer d228 = new Answer("A link to another process",0);
		 q228.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList228 = Arrays.asList(a228, b228, c228, d228);
		 q228.setPossibleAnswers(ansList228);
		 q228.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q228);
		
		 Question q229 = new Question();
		 q229.setQuestionText("Which of the following best describes the purpose of a business process model?");
		 Answer a229 = new Answer("To show the work undertaken within a functional area",0);
		 Answer b229 = new Answer("To demonstrate the business process for an item of software",0);
		 Answer c229 = new Answer("To show the sequence of tasks across a process",0);
		 Answer d229 = new Answer("To show the detailed rules within a process",1);
		 q229.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList229 = Arrays.asList(a229, b229, c229, d229);
		 q229.setPossibleAnswers(ansList229);
		 q229.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q229);
		
		 Question q230 = new Question();
		 q230.setQuestionText("Which of the following is NOT a primary activity on the Value Chain?");
		 Answer a230 = new Answer("Outbound Logistics",0);
		 Answer b230 = new Answer("Service",0);
		 Answer c230 = new Answer("Procurement",1);
		 Answer d230 = new Answer("Operations",0);
		 q230.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList230 = Arrays.asList(a230, b230, c230, d230);
		 q230.setPossibleAnswers(ansList230);
		 q230.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q230);
		 
		
		 Question q231 = new Question();
		 q231.setQuestionText("What does the diamond symbol represent in a swim-lane diagram?");
		 Answer a231 = new Answer("An event",0);
		 Answer b231 = new Answer("A decision",1);
		 Answer c231 = new Answer("Start of the process",0);
		 Answer d231 = new Answer("An actor",0);
		 q231.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList231 = Arrays.asList(a231, b231, c231, d231);
		 q231.setPossibleAnswers(ansList231);
		 q231.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q231);
		
		 Question q232 = new Question();
		 q232.setQuestionText("The key structural elements of a Business Architecture represent which one of the following sets?");
		 Answer a232 = new Answer("business motivations, business capabilities, value chains, information concepts",0);
		 Answer b232 = new Answer("business processes, business capabilities, value propositions, information concepts",0);
		 Answer c232 = new Answer("business motivations, business capabilities, value streams, information concepts",1);
		 Answer d232 = new Answer("business strategies, business capabilities, value streams, information concepts",0);	
		 q232.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList232 = Arrays.asList(a232, b232, c232, d232);
		 q232.setPossibleAnswers(ansList232);
		 q232.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q232);
		
		 Question q233 = new Question();
		 q233.setQuestionText("Which of the following techniques is suitable for modelling Business Architecture <b>in detail</b>?");
		 Answer a233 = new Answer("Business Model definition",0);
		 Answer b233 = new Answer("Business Motivation analysis",0);
		 Answer c233 = new Answer("Business Capability modelling",0);
		 Answer d233 = new Answer("Value Stream analysis",1);
		 q233.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList233 = Arrays.asList(a233, b233, c233, d233);
		 q233.setPossibleAnswers(ansList233);
		 q233.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q233);
		
		 Question q234 = new Question();
		 q234.setQuestionText("Which of the following would NOT be a Level 1 (Foundation level) Business Capability?");
		 Answer a234 = new Answer("Vendor management",0);
		 Answer b234 = new Answer("Qualifying Sales Leads",1);
		 Answer c234 = new Answer("Marketing",0);
		 Answer d234 = new Answer("Product development",0);
		 q234.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList234 = Arrays.asList(a234, b234, c234, d234);
		 q234.setPossibleAnswers(ansList234);
		 q234.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q234);
		
		 Question q235 = new Question();
		 q235.setQuestionText("Which of the following techniques would be suitable for use in a Gap Analysis from the Organisation view of the POPIT model? ");
		Answer a235 = new Answer("Balanced Business Scorecard",0);
		Answer b235 = new Answer("Business Motivation analysis",0);
		 Answer c235 = new Answer("Business Capability modelling",0);
		 Answer d235 = new Answer("McKinsey 7-S Modelling",1);
		 q235.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList235 = Arrays.asList(a235, b235, c235, d235);
		 q235.setPossibleAnswers(ansList235);
		 q235.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q235);
		
		 Question q236 = new Question();
		 q236.setQuestionText("Which of the following would be identified in a business case as an intangible cost?");
		 Answer a236 = new Answer("Licenses for new software",0);
		 Answer b236 = new Answer("Loss of goodwill",1);
		 Answer c236 = new Answer("Hire of a consultant for five days",0);
		 Answer d236 = new Answer("Purchase a new telephone system",0);
		 q236.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList236 = Arrays.asList(a236, b236, c236, d236);
		 q236.setPossibleAnswers(ansList236);
		 q236.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q236);
		
		 Question q237 = new Question();
		 q237.setQuestionText("Which of the following options should always be considered when developing a business case for a new system?");
				 Answer a237 = new Answer("Outsourcing the system",0);
				 Answer b237  = new Answer("Developing an in-house solution",0);
				 Answer c237 = new Answer("Redesigning a business process",0);
				 Answer d237 = new Answer("Continuing with the current system",1);
		 q237.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList237 = Arrays.asList(a237, b237, c237, d237);
		 q237.setPossibleAnswers(ansList237);
		 q237.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q237);
		
		 Question q238 = new Question();
		 q238.setQuestionText("When should a business case be reviewed?");
		 Answer a238 = new Answer("On selection of the chosen option",0);
		 Answer b238 = new Answer("Only after the solution has been implemented",0);
		 Answer c238 = new Answer("At all milestones during and after the project",0);
		 Answer d238 = new Answer("During feasibility checking",1);
		 q238.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList238 = Arrays.asList(a238, b238, c238, d238);
		 q238.setPossibleAnswers(ansList238);
		 q238.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q238);
		
		 Question q239 = new Question();
		 q239.setQuestionText("What are the three main aspects of feasibility to be considered when evaluating a business case?");
		 Answer a239 = new Answer("Technical, Business, Financial",1);
		 Answer b239 = new Answer("Process, Business, Operational",0);
		 Answer c239 = new Answer("Financial, Operational, Technical",0);
		 Answer d239 = new Answer("Process, Financial, Business",0);
		 q239.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList239 = Arrays.asList(a239, b239, c239, d239);
		 q239.setPossibleAnswers(ansList239);
		 q239.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q239);
		
		 Question q240 = new Question();
		 q240.setQuestionText("At which stage of the Requirements Engineering process do we scrutinise requirements to ensure they are well formed?");
		 Answer a240 = new Answer("Requirements Management",0);
		 Answer b240 = new Answer("Requirements Validation",0);
		 Answer c240 = new Answer("Requirements Analysis",1);
		 Answer d240 = new Answer("Requirements Elicitation",0);
		 q240.setNumberOfCorrectAnswers(1);
		 List<Answer> ansList240 = Arrays.asList(a240, b240, c240, d240);
		 q240.setPossibleAnswers(ansList240);
		 q240.setTypeOfExam(typeOfExam);
		 questionService.newQuestion(q240);
		 Question q241 = new Question();
         q241.setNumberOfCorrectAnswers(1);
         q241.setQuestionText("When using an Agile approach to develop a software product, which of the following is NOT a suitable technique for capturing/specifying requirements?");
         Answer a241 = new Answer("User Stories",0);
         Answer b241 = new Answer("Class Diagrams",0);
         Answer c241 = new Answer("Document analysis",1);
         Answer d241 = new Answer("Prototyping",0);
         List<Answer> ansList241 = Arrays.asList(a241, b241, c241, d241);
                q241.setPossibleAnswers(ansList241);
                q241.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q241);
         
         Question q242 = new Question();
         q242.setNumberOfCorrectAnswers(1);
         q242.setQuestionText("The final stage of the Requirements Analysis is to ensure that all requirements are?");
         Answer a242 = new Answer("OSCAR",0);
         Answer b242 = new Answer("SMART",1);
         Answer c242 = new Answer("MOST",0);
         Answer d242 = new Answer("Signed Off",0);
         List<Answer> ansList242 = Arrays.asList(a242, b242, c242, d242);
                q242.setPossibleAnswers(ansList242);
                q242.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q242);
         
         Question q243 = new Question();
         q243.setNumberOfCorrectAnswers(1);
         q243.setQuestionText("Within Requirements Engineering, which stakeholder group would have the role of advising on industry best practise?");
         Answer a243 = new Answer("Domain Expert",1);
         Answer b243 = new Answer("Project Manager",0);
         Answer c243 = new Answer("Project Sponsor",0);
         Answer d243 = new Answer("Business User",0);
         List<Answer> ansList243 = Arrays.asList(a243, b243, c243, d243);
                q243.setPossibleAnswers(ansList243);
                q243.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q243);
         
         Question q244 = new Question();
         q244.setNumberOfCorrectAnswers(1);
         q244.setQuestionText("Which of the following contains only valid Project Team roles?");
         Answer a244 = new Answer("Project Manager, Business Analyst, Business User",0);
         Answer b244 = new Answer("Domain Expert, Project Sponsor, Business User",0);
         Answer c244 = new Answer("Project Manager, Business Analyst, Developer",1);
         Answer d244 = new Answer("Domain Expert, Project Manager, Business Analyst",0);
         List<Answer> ansList244 = Arrays.asList(a244, b244, c244, d244);
                q244.setPossibleAnswers(ansList244);
                q244.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q244);
         
         Question q245 = new Question();
         q245.setNumberOfCorrectAnswers(1);
         q245.setQuestionText("Which of the following describes a valid reason for using a modified requirements gathering process in Agile software development?");
         Answer a245 = new Answer("‘Scope creep’ may occur if developers miss the bigger picture (Business Objectives).",0);
         Answer b245 = new Answer("Traceability and detailed historical documentation may not be up to standard",0);
         Answer c245 = new Answer("Requirements gathering is a quicker process on Agile projects",0);
         Answer d245 = new Answer("Removes redundant work involved in repeatedly changing requirements document",1);
         List<Answer> ansList245 = Arrays.asList(a245, b245, c245, d245);
                q245.setPossibleAnswers(ansList245);
                q245.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q245);
         
         Question q246 = new Question();
         q246.setNumberOfCorrectAnswers(1);
         q246.setQuestionText("Of the following sets of requirements which one contains only non-functional requirements?");
         Answer a246 = new Answer("Archiving, screen contents, robustness",0);
         Answer b246 = new Answer("Response time, recovery, availability",1);
         Answer c246 = new Answer("Business rules, accuracy, capacity",0);
         Answer d246 = new Answer("Access rights, back-up levels, data validation",0);
         List<Answer> ansList246 = Arrays.asList(a246, b246, c246, d246);
                q246.setPossibleAnswers(ansList246);
                q246.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q246);
         
         Question q247 = new Question();
         q247.setNumberOfCorrectAnswers(1);
         q247.setQuestionText("Which of the following is essential to an effective Requirements Management process?");
         Answer a247 = new Answer("Cost Benefit Analysis",0);
         Answer b247 = new Answer("Traceability",1);
         Answer c247 = new Answer("Complexity",0);
         Answer d247 = new Answer("Risk Analysis",0);
         List<Answer> ansList247 = Arrays.asList(a247, b247, c247, d247);
                q247.setPossibleAnswers(ansList247);
                q247.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q247);
         
         Question q248 = new Question();
         q248.setNumberOfCorrectAnswers(1);
         q248.setQuestionText("A requirement has been identified to restrict the level of access to personal data. Which type of requirement is this?");
         Answer a248 = new Answer("Functional",0);
         Answer b248 = new Answer("Tangible",0);
         Answer c248 = new Answer("Usability",0);
         Answer d248 = new Answer("Non-functional",1);
         List<Answer> ansList248 = Arrays.asList(a248, b248, c248, d248);
                q248.setPossibleAnswers(ansList248);
                q248.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q248);
         
         Question q249 = new Question();
         q249.setNumberOfCorrectAnswers(1);
         q249.setQuestionText("When prioritising functionality, if a feature is deemed to be mandatory at some point in the future it is a < what > requirement?");
         Answer a249 = new Answer("Should Have",1);
         Answer b249 = new Answer("Must Have",0);
         Answer c249 = new Answer("Could Have",0);
         Answer d249 = new Answer("Want to Have",0);
         List<Answer> ansList249 = Arrays.asList(a249, b249, c249, d249);
                q249.setPossibleAnswers(ansList249);
                q249.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q249);
         
         Question q250 = new Question();
         q250.setNumberOfCorrectAnswers(1);
         q250.setQuestionText("Which types of requirement would Business Policies and Branding be categorised as?");
         Answer a250 = new Answer("Technical",0);
         Answer b250 = new Answer("General",1);
         Answer c250 = new Answer("Functional",0);
         Answer d250 = new Answer("Non-Functional",0);
         List<Answer> ansList250 = Arrays.asList(a250, b250, c250, d250);
                q250.setPossibleAnswers(ansList250);
                q250.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q250);

         Question q251 = new Question();
         q251.setNumberOfCorrectAnswers(1);
         q251.setQuestionText("If we need to find out more information about why a requirement was requested, which element of requirements management allows us to trace this?");
         Answer a251 = new Answer("Requirements Cross-Referencing", 0);
         Answer b251 = new Answer("Configuration Management", 0);
         Answer c251 = new Answer("Requirements Identification", 1);
         Answer d251 = new Answer("Origin and Ownership", 0);
         List<Answer> ansList251 = Arrays.asList(a251, b251, c251, d251);
         q251.setPossibleAnswers(ansList251);
         q251.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q251);
         
         
         Question q252 = new Question();
         q252.setNumberOfCorrectAnswers(1);
         q252.setQuestionText("A Use Case is triggered ultimately by which of the following?");
         Answer a252 = new Answer("System Event", 0);
         Answer b252 = new Answer("Business Rule", 0);
         Answer c252 = new Answer("Class Operation", 1);
         Answer d252 = new Answer("Association", 0);
         List<Answer> ansList252 = Arrays.asList(a252, b252, c252, d252);
         q252.setPossibleAnswers(ansList252);
         q252.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q252);
         
         
         Question q253 = new Question();
         q253.setNumberOfCorrectAnswers(1);
         q253.setQuestionText("Which of the following would NOT be an actor on a use case diagram?");
         Answer a253 = new Answer("User Role", 0);
         Answer b253 = new Answer("IT system", 0);
         Answer c253 = new Answer("Use Case", 1);
         Answer d253 = new Answer("Time", 0);
         List<Answer> ansList253 = Arrays.asList(a253, b253, c253, d253);
         q253.setPossibleAnswers(ansList253);
         q253.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q253);
         
         Question q254 = new Question();
         q254.setNumberOfCorrectAnswers(1);
         q254.setQuestionText("Which of the following is NOT a valid ERD Entity?");
         Answer a254 = new Answer("Booking", 0);
         Answer b254 = new Answer("Customer", 0);
         Answer c254 = new Answer("Date of Birth", 1);
         Answer d254 = new Answer("Meeting", 0);
         List<Answer> ansList254 = Arrays.asList(a254, b254, c254, d254);
         q254.setPossibleAnswers(ansList254);
         q254.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q254);
  
         
         Question q255 = new Question();
         q255.setNumberOfCorrectAnswers(1);
         q255.setQuestionText("Which of the following is not a valid Use Case function?");
         Answer a255 = new Answer("Record Sale", 0);
         Answer b255 = new Answer("Sales Report", 1);
         Answer c255 = new Answer("Confirm Address", 0);
         Answer d255 = new Answer("Track Progress", 0);
         List<Answer> ansList255 = Arrays.asList(a255, b255, c255, d255);
         q255.setPossibleAnswers(ansList255);
         q255.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q255);
                
         Question q256 = new Question();
         q256.setNumberOfCorrectAnswers(1);
         q256.setQuestionText("When we consider the delivery of the requirements, what phase is concerned with the methods and standards?");
         Answer a256 = new Answer("Lifecycle", 0);
         Answer b256 = new Answer("Approach", 1);
         Answer c256 = new Answer("Context", 0);
         Answer d256 = new Answer("Roles", 0);
         List<Answer> ansList256 = Arrays.asList(a256, b256, c256, d256);
         q256.setPossibleAnswers(ansList256);
         q256.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q256);
         
         
         Question q257 = new Question();
         q257.setNumberOfCorrectAnswers(1);
         q257.setQuestionText("In the Generic Agile Model, which stage do we start the software development process with?");
         Answer a257 = new Answer("Elaborate Solution Requirements", 1);
         Answer b257 = new Answer("Define and Agree Business Requirements", 0);
         Answer c257 = new Answer("Engineer Solution", 0);
         Answer d257 = new Answer("Evaluate Solution", 0);
         List<Answer> ansList257 = Arrays.asList(a257, b257, c257, d257);
         q257.setPossibleAnswers(ansList257);
         q257.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q257);
                      
         Question q258 = new Question();
         q258.setNumberOfCorrectAnswers(1);
         q258.setQuestionText("In which phase of the V-Model do we develop our acceptance criteria?");
         Answer a258 = new Answer("Analyse Requirements", 1);
         Answer b258 = new Answer("Design System", 0);
         Answer c258 = new Answer("Develop Systems Modules", 0);
         Answer d258 = new Answer("Feasibility Study", 0);
         List<Answer> ansList258 = Arrays.asList(a258, b258, c258, d258);
         q258.setPossibleAnswers(ansList258);
         q258.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q258);
  
         
         Question q259 = new Question();
         q259.setNumberOfCorrectAnswers(1);
         q259.setQuestionText("For a safety critical system, which lifecycle would be the most suitable?");
         Answer a259 = new Answer("V-Model", 0);
         Answer b259 = new Answer("Iterative", 0);
         Answer c259 = new Answer("Agile", 0);
         Answer d259 = new Answer("Waterfall", 1);
         List<Answer> ansList259 = Arrays.asList(a259, b259, c259, d259);
         q259.setPossibleAnswers(ansList259);
         q259.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q259);
  
         
         Question q260 = new Question();
         q260.setNumberOfCorrectAnswers(1);
         q260.setQuestionText("In the Design stage of the Business Change Lifecycle, which of the following techniques is used in the design and performance of User Acceptance Tests (UAT)?");
         Answer a260 = new Answer("CATWOE", 0);
         Answer b260 = new Answer("Business Activity Models", 0);
         Answer c260 = new Answer("Decision Tables", 0);
         Answer d260 = new Answer("Six Sigma", 1);
         List<Answer> ansList260 = Arrays.asList(a260, b260, c260, d260);
         q260.setPossibleAnswers(ansList260);
         q260.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q260);

         
         Question q261 = new Question();
         q261.setNumberOfCorrectAnswers(1);
         q261.setQuestionText("Which of these are the first four stages of people’s emotional reactions to change?");
         Answer a261 = new Answer("Shock, Anger, Rejection, Acceptance", 1);
         Answer b261 = new Answer("Shock, Acceptance, Rejection, Anger", 0);
         Answer c261 = new Answer("Shock, Rejection, Anger, Acceptance", 0);
         Answer d261 = new Answer("Shock, Acceptance, Anger, Rejection", 0);
         List<Answer> ansList261 = Arrays.asList(a261, b261, c261, d261);
         q261.setPossibleAnswers(ansList261);
         q261.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q261);
  
         
         Question q262 = new Question();
         q262.setNumberOfCorrectAnswers(1);
         q262.setQuestionText("Which phase of the Business Change Lifecycle is concerned with gaining user acceptance and buy in of the new system?");
         Answer a262 = new Answer("Design", 1);
         Answer b262 = new Answer("Implementation", 0);
         Answer c262 = new Answer("Realisation", 0);
         Answer d262 = new Answer("Definition", 0);
         List<Answer> ansList262 = Arrays.asList(a262, b262, c262, d262);
         q262.setPossibleAnswers(ansList262);
         q262.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q262);
         
  
         Question q263 = new Question();
         q263.setNumberOfCorrectAnswers(1);
         q263.setQuestionText("The Alignment stage of the Business Change Lifecycle is concerned with our strategy implementation. Which tool could we use to ensure strategy alignment?");
         Answer a263 = new Answer("Porters Five Forces", 0);
         Answer b263 = new Answer("MOST", 0);
         Answer c263 = new Answer("Balanced Business Scorecard", 1);
         Answer d263 = new Answer("CATWOE", 0);
         List<Answer> ansList263 = Arrays.asList(a263, b263, c263, d263);
         q263.setPossibleAnswers(ansList263);
         q263.setTypeOfExam(typeOfExam);
         questionService.newQuestion(q263);
         

				

	}

}
