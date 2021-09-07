package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.CredentialsConfiguration;

@RestController
public class HelloController {

	@Value("${welcome.message}")
	private String welcomeMessage;
	
	 @RequestMapping("/hello")
	 public String hello() {
		 return "Hello from Hello Controller and the welcome message is : "+welcomeMessage;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	
	 @RequestMapping("/h")
	 public String welcome() {
		 return "Welcome in Hello Controller";
	 }
	 

	 
	
	// CredentialsConfiguration credentialsConfiguration = new CredentialsConfiguration();
	 
	 //@Autowired( required = false)
	 @Autowired
	 CredentialsConfiguration credentialsConfiguration;
	 
	 @RequestMapping("/printCredentials")
	 public String printCredentials() {
		 
		 return "Username is :"+credentialsConfiguration.getUsername();
	 }
	 
	 
}
