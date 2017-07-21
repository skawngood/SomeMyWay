package com.smm.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.smm.domain.BoardVO;
import com.smm.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(ContentController.class);
	
	@Inject
	private BoardService service; 
	
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void list(Model model) throws Exception {
		logger.info("listAll..........");
		model.addAttribute("list", service.listAll());
		
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registGET(BoardVO board, Model model) throws Exception{
		logger.info("regist get.......");
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		
		logger.info("regist post.......");
		logger.info(board.toString());
		
		service.b_regist(board);
		
		rttr.addFlashAttribute("msg","success");
		
		return "board/success";
		//return "redirect:/board/listAll";
	}
	
}
