package com.smm.mapper;

import java.util.List;

import com.smm.domain.MemberVO;
import com.smm.domain.ZipcodeVO;

public interface MemberMapper {
	//로그인
	public MemberVO login(MemberVO vo) throws Exception;
	
	//회원가입
		List<ZipcodeVO> getZipcodeList(String dong) throws Exception;
		
		public void regist(MemberVO vo) throws Exception;
}
