package com.mansha.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mansha.spring5jokesappv2.services.JokeService;
import com.mansha.spring5jokesappv2.services.JokeServiceImpl;

@Controller
public class JokeController {
	private final JokeService jokeService;

	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/", ""})
	public String getIndexPage(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "index";
	}
}
