package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/silly") //parent mapping
public class SillyController {
	
	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "silly";
	}
}
