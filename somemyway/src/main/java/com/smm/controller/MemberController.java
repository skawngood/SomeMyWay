package com.smm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String front(Model model){
		
		model.addAttribute("url", "login.jsp");
		
		return "member/main";
	}
}
