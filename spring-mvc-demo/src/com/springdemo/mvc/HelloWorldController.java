package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	//need a controller method to show the initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new controller method to read form data and add data to the model
	@RequestMapping("/processFormTwo")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		
		//read the request parameter from the HTML form
		String theName = request.getParameter("studentName"); //form name
		//convert data to all UPPERCASE
		theName = theName.toUpperCase();
		//create message
		String result = "Yo! " + theName;
		//add message to the model
		model.addAttribute("message", result); //(name,value)
		return "helloworld";
	}
	
	
}
