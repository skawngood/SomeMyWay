package com.smm.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.smm.domain.MemberVO;
import com.smm.service.MemberService;

@Controller
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(ContentController.class);
	
	@Inject
	private MemberService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String front(){
		return "member/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(MemberVO param, Model model) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		
		logger.info("id == "+param.getId());
		logger.info("pass == "+param.getPass());
		
		MemberVO vo = service.login(param);
		
		if(vo == null) {
			logger.info("�ش� ID �Ǵ� ��й�ȣ �������� ����");
			mav.setViewName("member/login_fail");
		} else {
			logger.info("��� == " + vo.toString());
			model.addAttribute("msg","�α��� ����!");
			model.addAttribute("user", vo);
			mav.setViewName("member/login");
		}
		
		return mav;
	}
	
	/*@RequestMapping(value = "/regist", method=RequestMethod.GET)
	public String regist() throws Exception{
		return "member/regist";
	}*/
	/*
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public ModelAndView join(MemberVO vo) throws Exception{
		ModelAndView mav = new ModelAndView();
		
		logger.info(vo.toString());
		
		memberservice.regist(vo);
		
		mav.setViewName("member/registAction");
		
		return mav;
	}*/
}
