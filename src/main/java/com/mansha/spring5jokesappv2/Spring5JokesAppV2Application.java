package com.mansha.spring5jokesappv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"guru.springframework.norris.chuck.ChuckNorrisQuotes", "com.mansha.spring5jokesappv2"})
@SpringBootApplication
public class Spring5JokesAppV2Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring5JokesAppV2Application.class, args);
	}

}
