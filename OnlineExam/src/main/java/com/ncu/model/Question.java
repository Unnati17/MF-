package com.ncu.model;

public class Question {
	
	private String examName;
	private String sno;
	private String question;
	private String optA;
	private String optB;
	private String optC;
	private String optD;
	private String correct;

	
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOptA() {
		return optA;
	}
	public void setOptA(String optionA) {
		this.optA = optionA;
	}
	public String getOptB() {
		return optB;
	}
	public void setOptB(String optionB) {
		this.optB = optionB;
	}
	public String getOptC() {
		return optC;
	}
	public void setOptC(String optionC) {
		this.optC = optionC;
	}
	public String getOptD() {
		return optD;
	}
	public void setOptD(String optionD) {
		this.optD = optionD;
	}
	public String getCorrect() {
		return correct;
	}
	public void setCorrect(String correct) {
		this.correct = correct;
	}
	
}
