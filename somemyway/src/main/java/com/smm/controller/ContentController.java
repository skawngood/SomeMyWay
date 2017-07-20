package com.smm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/content")
public class ContentController {
	private static final Logger logger = LoggerFactory.getLogger(ContentController.class);
	
	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage(Model model) {
		return "mypage/mypage";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(Model model) {
		return "search/search";
	}
}
