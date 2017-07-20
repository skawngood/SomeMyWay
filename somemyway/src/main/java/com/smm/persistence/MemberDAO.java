package com.smm.persistence;

import com.smm.domain.MemberVO;

public interface MemberDAO {
	//로그인
	public MemberVO login(MemberVO vo) throws Exception;
	//회원가입
	/*List<ZipcodeVO> getZipcodeList(String dong) throws Exception;
	
	public void regist(MemberVO vo) throws Exception;
	
	public int idcheck(String id) throws Exception;*/
}
