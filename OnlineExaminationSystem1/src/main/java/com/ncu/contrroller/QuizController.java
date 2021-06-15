package com.ncu.contrroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncu.services.QuestionService;

@Controller
@RequestMapping("quest")
public class QuizController {
	
	@Autowired
	private QuestionService qS;

	@RequestMapping(method=RequestMethod.GET)
	public String index(ModelMap m)
	{
		m.put("questions",qS.findAll());
		return "quest/index";
	}
	
	@RequestMapping(value="submit", method=RequestMethod.POST)
	public String submit(HttpServletRequest request)
	{
		int score=0;
		
		String questionIds[]=request.getParameterValues("questionId");
		for(String questionId:questionIds)
		{
			int answerIdCorrect=qS.findAnswerIdCorrect(Integer.parseInt(questionId));
			if(answerIdCorrect==Integer.parseInt(request.getParameter("question_"+questionId)))
			{
				score++;
			}
		}
		request.setAttribute("score",score);
		return "quest/result";
	}
	
	
	
}
