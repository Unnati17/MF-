package com.ncu.entity;

import java.io.Serializable;

//import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="answer")
public class Answer implements Serializable{
    
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Question quest;
    private String content;
    private boolean correct;

    public Answer() {
    }
    
    public Answer(Question quest,String content,boolean correct) {
    	this.quest=quest;
    	this.content=content;
    	this.correct=correct;
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content=content;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

	public Question getQuest() {
		return quest;
	}

	public void setQuest(Question quest) {
		this.quest = quest;
	}
    
    
    
}
