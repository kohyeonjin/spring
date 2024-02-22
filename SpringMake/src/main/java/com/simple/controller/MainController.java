package com.simple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MainController extends MultiActionController {
	
	//�������� 3������ �����ϴ� ��Ʈ�ѷ��� �ϳ���, URL�� ���� ��û��θ� �޾� �� �� ����
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String uri = request.getRequestURI();
		String conpath = request.getContextPath();		
		String path = uri.substring( conpath.length() );
		
		if(path.equals("/example/aaa")) {
			System.out.println(path + "�����");
			//.......
			
			ModelAndView mv = new ModelAndView();
			mv.addObject("data", "�������� �����ϴ� ������"); //����������
			//mv.setViewName("/WEB-INF/view/home.jsp"); //����
			mv.setViewName("home"); //����
			
			return mv; //�����ļ������� ��ȯ
			
		} else if(path.equals("/example/bbb")) {
			System.out.println(path + "�����");
			//.......
			ModelAndView mv = new ModelAndView();
			mv.addObject("data", "�������� �����ϴ� ������2222222"); //����������
			//mv.setViewName("/WEB-INF/view/home2.jsp"); //����
			mv.setViewName("home2");
			
			
			return mv;
		}
				
		
		return super.handleRequestInternal(request, response);
	}

}
