package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.BoardVO;
import com.simple.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@RequestMapping("/boardRegister")
	public String boardRegister() {
		
		return "board/boardRegister";
	}
	
	@RequestMapping("/boardForm")
	public String boardForm(BoardVO vo) {
		
		service.boardRegist(vo);
		
		return "board/boardResult";
	}
	
	
	@RequestMapping("/boardList")
	
	public String boardList(Model model) {
		
		ArrayList<BoardVO> list = service.getList();
		
		model.addAttribute("list", list);
		
		return "board/boardList";
	}
	
	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("num") int num) {
		
		service.boardDelete(num);
		
		return "redirect:/board/boardList";
	}
}
