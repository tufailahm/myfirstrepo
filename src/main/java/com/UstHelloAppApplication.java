package com;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//@ComponentScan(basePackages = "hello")
/**
 * 
 * 1. Sets up default configuration
 *  2. Starts Spring application context
 *  3. Performs class path scan
 *  4. Starts tomcat server
 */
public class UstHelloAppApplication {

	public static void main(String[] args) {
	 ApplicationContext ctx = 	SpringApplication.run(UstHelloAppApplication.class, args);
	 String [] beanNames = ctx.getBeanDefinitionNames();
	 
	 Arrays.sort(beanNames);
	 
	 for(String bn:beanNames) {
		 	System.out.println(bn);
	 }
	}

	@RequestMapping("/")
	public String sayHello() {
		return "Welcome to first spring boot hello -app";
	}
	
	@RequestMapping("/ust")
	public String ustMessage() {
		return "UST Global - Ernakulam";
	}
	
	@RequestMapping("/kochi")
	public String getKochi() {
		return "Kochi is an important city down south";
	}
	
	@RequestMapping("/helloust")
	public String hello() {
		return "Hi Hello how r u ";
	}
}
