package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.hcl.entity.Feedback;
import com.hcl.service.FeedbackService;

@RestController
public class FeedbackController {
	@Autowired
	private FeedbackService fbService;
	

	@PostMapping("/addFeedback")
	public RedirectView addFBform(@RequestParam("uname") String name,
			@RequestParam("desc") String description,
			@RequestParam("rating") int rating) {
		fbService.addFeedback(name, description, rating);
		
		return new RedirectView("/loadFeedback");
	}
	
	@GetMapping("/addFeedback")
	public ModelAndView addFBForm() {
		Feedback feedback = new Feedback();
		return new ModelAndView("addfeedback", "addFBForm", feedback);
	}
	
	@GetMapping("/loadFeedback")
	public String loadFeedback() {
		return fbService.getAllFeedback().toString();
	}
	@GetMapping("/deleteFeedback/{id}")
	public String deleteFeedback(@PathVariable("id") int id ) {
		if (fbService.deleteFeedback(id)) { // returned true
			return "feedback with corresponding id deleted";
		} 
		return "feedback not deleted";
		
	}
	
}
