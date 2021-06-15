package com.ncu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.entity.Answer;
import com.ncu.entity.Question;
import com.ncu.repositories.QuestionRepository;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private QuestionRepository questRepo;
	
	@Override
	public Iterable<Question> findAll() {
		return questRepo.findAll();
	}

	@Override
	public int findAnswerIdCorrect(int questionId) {
		Question quest=questRepo.findById(questionId).get();
		for(Answer answer:quest.getAnswers())
		{
			if(answer.isCorrect())
			{
				return answer.getId();
			}
		}
		return -1;
	}

	
}
