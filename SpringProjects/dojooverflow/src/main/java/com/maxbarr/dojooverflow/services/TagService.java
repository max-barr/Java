package com.maxbarr.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.maxbarr.dojooverflow.models.Question;
import com.maxbarr.dojooverflow.models.Tag;
import com.maxbarr.dojooverflow.repositories.TagRepository;

@Service
public class TagService {
	private final TagRepository tagRepository;
	
	public TagService(TagRepository tagRepository) {
		this.tagRepository = tagRepository;
	}
	
	public List<Tag> allTags() {
		return tagRepository.findAll();
	}
	
	public Tag createTag(Tag tag) {
		return tagRepository.save(tag);
	}
	
	public Tag saveTag(Tag tag) {
		return tagRepository.save(tag);
	}
	
	public Tag findTag(Long id) {
		Optional<Tag> optionalTag = tagRepository.findById(id);
		if(optionalTag.isPresent()) {
			return optionalTag.get();
		} else {
			return null;
		}
	}
	
	public Tag findBySubject(String subject) {
		Optional<Tag> optionalTag = tagRepository.findTagBySubject(subject);
		if(optionalTag.isPresent()) {
			return optionalTag.get();
		} else {
			return null;
		}
	}
	
//	public List<Question> findQuestions(Tag tag) {
//		return tag.getQuestions();
//	}
}
	
	
//	method for splitting
//	implement .split string method
//	-requires a for loop, will return a string
//	-call on method that uses findBySubjectContaining
//	if the tag is in the database, do not save it
//	if it is not in the database, save it
	
//	public String splitTag(Tag tag) {
//		tag = tag.split();
//		
//		for (int i = 0; i <= 3; i++) {
//			
//		}
//		
//		return tag.getSubject();
//	}
//	
//	
////	method that uses findBySubjectContaining
////	method for querying the database for the tags to see if they exist
////	for loop to check Tag objects
////	compare using .equals(Tag object returned from query.getSubject())
//	
////	if the list of tags is empty, return null
////	
//	public String checkTags(Tag tag) {
//		
//		return tagRepository.findBySubjectContaining(null);
//	}
//}
