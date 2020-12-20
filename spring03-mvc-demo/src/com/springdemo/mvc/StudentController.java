package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		//create a new student object
		Student theStudent = new Student();
		//add that student object to the model
		model.addAttribute("student", theStudent);// (attribute, value)
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		//log the input data
		System.out.println("theStudent: "+theStudent.getFirstName() + " " + theStudent.getLastName());
		return "student-confirmation";
	}
}
