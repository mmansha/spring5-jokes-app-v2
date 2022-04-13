package com.mansha.spring5jokesappv2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
	
	@Autowired
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	

//	public JokeServiceImpl() {
//		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
//	}
	
	
	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}


	
	
	public String getJoke() {
		
		return chuckNorrisQuotes.getRandomQuote();
	}


	
	
}
