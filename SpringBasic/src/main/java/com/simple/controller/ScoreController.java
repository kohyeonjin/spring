package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;
import com.simple.service.ScoreServiceImpl;

@Controller
@RequestMapping("/score")
public class ScoreController {
	
	//1st
//	private ScoreService service = new ScoreServiceImpl();
	
	//2nd
	@Autowired
	@Qualifier("xxx") //이름으로 연결
	private ScoreService service;
	
	@RequestMapping("/scoreRegist")
	public String scoreRegist() {
		
		return "score/scoreRegist";
	}
	
	@RequestMapping("/scoreResult")
	public String scoreResult() {
		
		return "score/scoreResult";
	}
	
	@RequestMapping("/scoreList")
	public String scoreList(Model model) {
		
		//select 해서 모델에 담아서 화면에 가지고 나감
		ArrayList<ScoreVO> list = service.getList();
		model.addAttribute("list" , list);
		
		return "score/scoreList";
	}
	
	//등록요청
	@RequestMapping(value="/scoreForm" , method=RequestMethod.POST)
	public String scoreForm(ScoreVO vo) {
		//점수등록작업~~~
		service.regist(vo);
		return "redirect:/score/scoreResult";
	}
	
	@RequestMapping("/deleteForm")
	public String deleteForm(@RequestParam("sno") int sno) {
		
		service.delete(sno);
		
		//삭제 후
		return "redirect:/score/scoreList";
	}
}
