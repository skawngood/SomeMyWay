package com.smm.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.smm.domain.ZipcodeVO;
import com.smm.domain.MemberVO;
import com.smm.service.MemberService;

@Controller
@SessionAttributes({"user"})
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
			logger.info("해당 ID 또는 비밀번호 존재하지 않음");
			mav.setViewName("member/login_fail");
		} else {
			logger.info("결과 == " + vo.toString());
			model.addAttribute("msg","로그인 성공!");
			model.addAttribute("user", vo);
			mav.setViewName("mypage/mypage");
		}
		
		return mav;
	}
	
	@RequestMapping(value = "/regist", method=RequestMethod.GET)
	public String regist() throws Exception{
		return "member/regist";
	}
	
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public ModelAndView join(MemberVO vo) throws Exception{
		ModelAndView mav = new ModelAndView();
		
		logger.info(vo.toString());
		
		service.regist(vo);
		
		mav.setViewName("member/registAction");
		
		return mav;
	}
	
	@RequestMapping(value="/zipcode_page",method=RequestMethod.GET)
	public String zipcode(){
		return "member/zipcode";
	}
	
	@RequestMapping(value="/zipcode_page",method=RequestMethod.POST)
	public String zipcode( String dong, Model model) throws Exception{
		List<ZipcodeVO> list=service.getZipcodeList(dong);
		model.addAttribute("list",list);
		
		logger.info("동: "+dong);
		
		return "member/zipcode";
	}
	
	@RequestMapping("/idcheck")
	public ModelAndView idcheck(MemberVO memberVO, HttpServletRequest request ) throws Exception{
		ModelAndView mav = new ModelAndView();
		
		logger.info("idCheck - member : " + memberVO.toString());
		
		int a = service.idcheck(memberVO.getId());
		
		//String vo = request.getParameter("member");
		
		//logger.info(vo);
				
		if(a == 1) {
			logger.info("중복");
			request.setAttribute("msg", "아이디 중복입니다.");
			
		}
		else{
			logger.info("가능");
			request.setAttribute("msg", "사용 가능한 아이디입니다.");
		}
		mav.setViewName("member/regist");
		//mav.addObject("member", vo);
		return mav;
		
	}
}
