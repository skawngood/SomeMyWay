package com.smm.persistence;

import java.util.List;

import com.smm.domain.MemberVO;
import com.smm.domain.ZipcodeVO;

public interface MemberDAO {
	//로그인
	public MemberVO login(MemberVO vo) throws Exception;
	
	//회원가입
	List<ZipcodeVO> getZipcodeList(String dong) throws Exception;
	
	public void regist(MemberVO vo) throws Exception;
	
	public int idcheck(String id) throws Exception;
}
