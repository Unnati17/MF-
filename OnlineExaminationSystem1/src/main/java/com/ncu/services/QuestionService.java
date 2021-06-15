package com.ncu.services;

import com.ncu.entity.Question;

public interface QuestionService {
	
	public Iterable<Question> findAll();

	public int findAnswerIdCorrect(int questionId);
	

}
