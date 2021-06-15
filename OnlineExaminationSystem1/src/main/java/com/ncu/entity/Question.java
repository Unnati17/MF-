package com.ncu.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="question")
public class Question implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
    private String content;
    private Set<Answer> ans=new HashSet<Answer>();

    public Question() {
    }
    
    public Question(String content)
    {
    	this.content=content;
    }
    public Question(String content,Set<Answer> ans){
        this.content = content;
        this.ans = ans;       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content=content;
    }

    public Set<Answer> getAnswers() {
        return ans;
    }

    public void setAnswers(Set<Answer> ans) {
        this.ans= ans;
    }

}
