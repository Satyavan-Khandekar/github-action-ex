package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsCicdApplication {

	@GetMapping("/display")
	public String welcome()
	{
		return "This is demo for cicd pipeline using github actions";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubActionsCicdApplication.class, args);
	}

}
