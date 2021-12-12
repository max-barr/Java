package com.maxbarr.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.maxbarr.dojooverflow.models.Question;
import com.maxbarr.dojooverflow.repositories.QuestionRepository;

@Service
public class QuestionService {
	private final QuestionRepository questionRepository;
	
	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	public Question createQuestion(Question newQuestion) {
		
		
		
		return questionRepository.save(newQuestion);
	}
	
	public List<Question> allQuestions() {
		return questionRepository.findAll();
	}
	
	
	public Question saveQuestion(Question question) {
		return questionRepository.save(question);
	}
	
	public Question findQuestion(Long id) {
		Optional<Question> optionalQuestion = questionRepository.findById(id);
		if(optionalQuestion.isPresent()) {
			return optionalQuestion.get();
		} else {
			return null;
		}
	}
	
}
