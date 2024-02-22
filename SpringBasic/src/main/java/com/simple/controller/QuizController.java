package com.simple.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.MemberVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	@RequestMapping("/quiz01")
	public String quiz01() {
		
		return "quiz/quiz01";
	}
	
	@RequestMapping(value = "/sendBirth" , method=RequestMethod.POST)
	public String sendBirth(@RequestParam("year") String year,
							@RequestParam("month") String month,
							@RequestParam("day") String day,
							Model model) {
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		
		model.addAttribute("year" , year);
		model.addAttribute("month" , month);
		model.addAttribute("day" , day);
		
		
		return "quiz/quiz01_ok";
	}
	
	
	@RequestMapping("/quiz02")
	public String quiz02(Model model) {
		
		List<MemberVO> list = new ArrayList<>();
		
		MemberVO vo = new MemberVO("1","홍길동",20,null);
		list.add(vo);
		vo = new MemberVO("2","홍길자",30,null);
		list.add(vo);
		vo = new MemberVO("3","홍길순",40,null);
		list.add(vo);
		
		model.addAttribute("list",list);
		
		return "quiz/quiz02";
	}
	
	@RequestMapping("/quiz02_info")
	public String quiz02_info(@RequestParam("id") String id ,Model model) {
		
		model.addAttribute("id" , id);
		
		return "quiz/quiz02_info";
	}
		
	}
