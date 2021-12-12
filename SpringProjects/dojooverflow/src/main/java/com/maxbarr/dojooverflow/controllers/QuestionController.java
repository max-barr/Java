package com.maxbarr.dojooverflow.controllers;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maxbarr.dojooverflow.models.Answer;
import com.maxbarr.dojooverflow.models.Question;
import com.maxbarr.dojooverflow.models.Tag;
import com.maxbarr.dojooverflow.services.AnswerService;
import com.maxbarr.dojooverflow.services.QuestionService;
import com.maxbarr.dojooverflow.services.TagService;


@Controller
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private TagService tagService;
//	
	@Autowired
	private AnswerService answerService;
	
	
//	GET request for Questions dash board
	
	@GetMapping("/questions")
	public String index(@ModelAttribute("question") Question question, Model model) {
		List<Question> questions = questionService.allQuestions();
		model.addAttribute("questions", questions);
		return "dashboard.jsp";
	}
	
//	GET request for form to add a new question and tags
	
	@GetMapping("/questions/new")
	public String add(@ModelAttribute("question") Question question) {
		return "question.jsp";
	}
	
//	POST request for new question and tags
	
	@PostMapping("/questions/new")
	public String create(@Valid @ModelAttribute("question") Question question, BindingResult result, @RequestParam("tags") String tags) {
		tags = tags.toLowerCase();
		ArrayList<Tag> dividedTags = splitTags(tags);
		
		System.out.println(dividedTags);
		
		for (Tag tag : dividedTags) {
			if (question.getTags() != null) {
				question.getTags().add((Tag)tag);
			}
			else {
				question.setTags((List<Tag>)dividedTags);
				questionService.createQuestion(question);
				return "redirect:/questions/new";
			}
		}
		
		if (result.hasErrors()) {
			return "question.jsp"; 
		} else {	
			questionService.createQuestion(question);
			return "redirect:/questions/new";
		}
	}

//	GET request for Question profile page with form for adding answers
	
	@GetMapping("/questions/{id}")
	public String show(@PathVariable("id") Long id, @ModelAttribute("answer") Answer answer, Model model) {
		Question question = questionService.findQuestion(id);
		model.addAttribute("question", question);
		
//		model.addAttribute("answers", answerService.allAnswers());
		
//		model.addAttribute("tags", tagService.allTags());
		
		return "showQuestion.jsp";
	}
	
//	POST request for adding a new answer to a question
	
	@PostMapping("/questions/addAnswer")
	public String createAnswer(@Valid @ModelAttribute("answer") Answer answer, BindingResult result) {
		if (result.hasErrors()) {
			return "showQuestion.jsp"; 
		} else {
			Answer newAnswer = answerService.createAnswer(answer);
			return "redirect:/questions/" + newAnswer.getQuestion().getId();
		}
	}
	
	public ArrayList<Tag> splitTags(String newTags) {
		String[] parsedTags = new String[3];
		String result = newTags.trim();
		parsedTags = newTags.split(",");
		
		ArrayList<Tag> tags = new ArrayList<Tag>();
		
		for (int i = 0; i < parsedTags.length; i++) {
			Tag newTag = new Tag();
			
			Tag tagInDb = tagService.findBySubject(parsedTags[i]);
//			check if newTag is in database
			if (tagInDb != null) {
				tags.add(tagInDb);
			} else {
				
				tagService.createTag(newTag);
				newTag.setSubject(parsedTags[i]);
				
				tags.add(newTag);
			}
		}
		
		return tags;
	}
	
	
}

