package com.ncu.model;

import java.sql.Timestamp;

public class ExamDetails {
	
	private String examName;
	//private String examDate;
	private Timestamp createdDate;
    private Timestamp modifiedDate;
	
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
//	public String getExamDate() {
//		return examDate;
//	}
//	public void setExamDate(String examDate) {
//		this.examDate = examDate;
//	}
	/**
	 * @return the createdDate
	 */
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}
	
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
}