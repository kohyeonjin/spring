package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/example/aaa")
	public String home(Model model) {
		
		model.addAttribute("data", "�������� ������ ������~");
		
		return "home";
	}
	
	@RequestMapping("/example/bbb")
	public String home2() {
		return "home2";
	}
	
}
