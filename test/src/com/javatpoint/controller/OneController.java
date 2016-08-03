package com.javatpoint.controller;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/one")
public class OneController {
	@RequestMapping(value = "/one")
	public ModelAndView onemethod() {
		//write the code here to add contact
		return new ModelAndView("one");
	}
	
	
}
