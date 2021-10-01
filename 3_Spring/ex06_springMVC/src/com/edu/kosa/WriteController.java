package com.edu.kosa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WriteController implements Controller {

	
	/**
	 * page=3
	 * 글제목, 작성자 
	 * write.jsp로 이동해서 출력하기
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.addObject("page",3);
		mav.addObject("title","임의의 제목");
		mav.addObject("writer","임의의 작성자");

		mav.setViewName("write");
		return mav;
	}

}
