package com.maxbarr.greatideas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxbarr.greatideas.models.Idea;
import com.maxbarr.greatideas.repositories.IdeaRepository;

@Service
public class IdeaService {

	@Autowired
	private IdeaRepository ideaRepository;
	
//	Create a new idea
	
	public Idea createIdea(Idea idea) {
		return ideaRepository.save(idea);
	}
	
//	Return all ideas
	
	public List<Idea> allIdeas() {
		return ideaRepository.findAll();
	}
	
//	Save or update an idea
	
	public Idea saveIdea(Idea idea) {
		return ideaRepository.save(idea);
	}
	
//	Find an idea by id
	
	public Idea findIdea(Long id) {
		return ideaRepository.findById(id).orElse(null);
	}
	
//	Delete an idea
	
	public void delete(Long id) {
		ideaRepository.deleteById(id);
	}
}
