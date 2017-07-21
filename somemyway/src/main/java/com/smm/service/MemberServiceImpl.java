package com.smm.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.smm.domain.MemberVO;
import com.smm.domain.ZipcodeVO;
import com.smm.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	@Inject
	private MemberDAO dao;

	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		logger.info("』』』』』』』 login go 』』』』』』』");
		return dao.login(vo);
	}
	
	@Override
	public List<ZipcodeVO> getZipcodeList(String dong) throws Exception {
		logger.info("』』』』』』』 zipcode go 』』』』』』』");
		return dao.getZipcodeList(dong);
	}

	@Override
	public void regist(MemberVO vo) throws Exception {
		logger.info("』』』』』』』 regist go 』』』』』』』");
		dao.regist(vo);
	}

	@Override
	public int idcheck(String id) throws Exception {
		logger.info("』』』』』』』 idcheck go 』』』』』』』");
		return dao.idcheck(id);
	}

}
