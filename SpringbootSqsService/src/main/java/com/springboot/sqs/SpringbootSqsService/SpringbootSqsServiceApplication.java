package com.springboot.sqs.SpringbootSqsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.awspring.cloud.sqs.annotation.SqsListener;
import io.awspring.cloud.sqs.operations.SqsTemplate;

@SpringBootApplication
@RestController
public class SpringbootSqsServiceApplication {

	@Autowired
	SqsTemplate sqsTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootSqsServiceApplication.class, args);
	}

	@GetMapping("send/{message}")
	public void send(@PathVariable String message) {
		sqsTemplate.send("https://sqs.ap-south-1.amazonaws.com/113491373537/SpringbootQueue", message);
	}
	
	@SqsListener("SpringbootQueue")
	public void receive(String message) {
		System.out.println(message);
	}
}
