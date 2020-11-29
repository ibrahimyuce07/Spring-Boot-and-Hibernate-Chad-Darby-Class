package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // parent mapping. html'deki href'i düzelt
public class HelloWorldController {

	// need a controller method to show the initial form

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// new controller method to read form data and add data to the model
	@RequestMapping("/processFormTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {

		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName"); // form name
		// convert data to all UPPERCASE
		theName = theName.toUpperCase();
		// create message
		String result = "Yo! " + theName;
		// add message to the model
		model.addAttribute("message", result); // (name,value)
		return "helloworld";
	}

	// studentName form isminden okuduğu değeri thName Stringi olarak alacak.
	// üsttekine alternatif, daha iyi gibi. üstteki 31. satıra ihtiyacımız yok
	// artık.
	@RequestMapping("/processFormThree") // html 'e eklemeyi unutma
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		// studentName form isminden okuduğu değeri thName Stringi olarak alacak.

		// convert data to all UPPERCASE
		theName = theName.toUpperCase();
		// create message
		String result = "Hey My Friend from v3 <b>" + theName + " !</b>";
		// add message to the model
		model.addAttribute("message", result); // (name,value)
		return "helloworld";
	}
	
	@RequestMapping("/showTestForm")
	public String showTestForm() {
		return "kullaniciBirlestirFormu";
	}
	@RequestMapping("/processFormTest") 
	public String adSoyadBirlestir(@RequestParam("kullaniciAdi") String isim, @RequestParam("kullaniciSoyadi") String soyisim, Model model) {

		String fullName = isim + " " + soyisim;
		String result = "Tam adınız <b>" + fullName + " !</b>";
		model.addAttribute("message", result); // (name,value)
		return "kullaniciBirlestir";
	}

}
