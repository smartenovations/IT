package com.javatpoint.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller @RequestMapping("/two")
public class TwoController {
	@RequestMapping("/two")
	public ModelAndView helloWorld() {
		
		return new ModelAndView("two");
	}
}
