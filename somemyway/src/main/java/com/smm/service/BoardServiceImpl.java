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
		logger.info("』』』』』』』 b_regist go 』』』』』』』");
		dao.create(board);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		logger.info("』』』』』』』 read go 』』』』』』』");
		return dao.read(bno);
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		logger.info("』』』』』』』 modify go 』』』』』』』");
		dao.update(board);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		logger.info("』』』』』』』 remove go 』』』』』』』");
		dao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		logger.info("』』』』』』』 List go 』』』』』』』");
		return dao.listAll();
	}

}
