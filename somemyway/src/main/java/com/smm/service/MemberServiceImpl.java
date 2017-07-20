package com.smm.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.smm.domain.MemberVO;
import com.smm.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO dao;

	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return dao.login(vo);
	}
	
	/*@Override
	public List<ZipcodeVO> getZipcodeList(String dong) throws Exception {
		logger.info("�١١١١١١� zipcode go �١١١١١١�");
		return Mapper.getZipcodeList(dong);
	}

	@Override
	public void regist(MemberVO vo) throws Exception {
		logger.info("�١١١١١١� regist go �١١١١١١�");
		Mapper.regist(vo);
	}

	@Override
	public int idcheck(String id) throws Exception {
		logger.info("�١١١١١١� idcheck go �١١١١١١�");
		return Mapper.idcheck(id);
	}*/

}
