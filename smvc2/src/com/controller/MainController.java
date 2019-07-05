package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/main.mc")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/login.mc")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("center","login");
		mv.addObject("navi", Navi.login);
		mv.setViewName("main");
		return mv;
	}
}








