package com.smm.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.smm.domain.BoardVO;
import com.smm.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	@Inject
	private BoardDAO dao;
	
	@Override
	public void b_regist(BoardVO board) throws Exception {
		logger.info("�١١١١١١� b_regist go �١١١١١١�");
		dao.create(board);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		logger.info("�١١١١١١� read go �١١١١١١�");
		return dao.read(bno);
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		logger.info("�١١١١١١� modify go �١١١١١١�");
		dao.update(board);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		logger.info("�١١١١١١� remove go �١١١١١١�");
		dao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		logger.info("�١١١١١١� List go �١١١١١١�");
		return dao.listAll();
	}

}
