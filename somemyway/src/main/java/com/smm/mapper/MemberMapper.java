package com.smm.mapper;

import java.util.List;

import com.smm.domain.MemberVO;
import com.smm.domain.ZipcodeVO;

public interface MemberMapper {
	//�α���
	public MemberVO login(MemberVO vo) throws Exception;
	
	//ȸ������
		List<ZipcodeVO> getZipcodeList(String dong) throws Exception;
		
		public void regist(MemberVO vo) throws Exception;
}
