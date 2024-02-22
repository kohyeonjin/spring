package com.simple.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.MemberVO;

@Controller
@RequestMapping("/request") //상위 요청 request
public class RequestController {
	
//	//ȭ���� ���� ������, ��Ʈ�ѷ� ȭ���� ���� ����
//	@RequestMapping("/ex01")
//	public String ex01() {
////		return "ȭ���ǰ��";
//		return "request/ex01";
//	}
	
	//화면을 띄우는 요청
	@RequestMapping(value="/ex01")
	public void ex01() {
		
	}
		
	//GET방식만 허용됨 RequestMethod.GET
	//POST 방식만 허용함. RequestMetgod.POST
	//안적으면 둘 다 허용됨
	@RequestMapping(value="/basic",method=RequestMethod.POST) 
	public void basic() {
		System.out.println("잘 실행됨");
	}
	
	//ex02화면
	@RequestMapping("/ex02")
	public String ex02() {
		
		return "request/ex02";
	}
	
	//전통적인 방법
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(HttpServletRequest request) { //데이터를 받음
//		System.out.println(request.getParameter("id"));
//		System.out.println(request.getParameter("name"));
//		System.out.println(request.getParameter("age"));
//		System.out.println(Arrays.toString(request.getParameterValues("inter")));
//		
//		return "request/ex02_result";
//	}
	
	
	//@RequestParam - 반드시 필수로 값을 넘겨야하는 파라미터
//	@RequestMapping(value = "/param" , method=RequestMethod.POST)
//	public String param(@RequestParam("id") String id,
//						@RequestParam("name") String x,
//						@RequestParam("age") int y,
//						@RequestParam(value = "inter",
//									  required = false,
//									  defaultValue = "") ArrayList<String> list) {
//		
//		System.out.println(id);
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(list.toString());
//		
//		return "request/ex02_result";
//	}
	
	//VO객체를 이용한 자동맵핑
	@RequestMapping("/param")
	public String param(MemberVO vo) {
		
		System.out.println(vo.toString());
		
		return "request/ex02_result";
	}
}
