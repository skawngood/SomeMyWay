package com.smm.persistence;

import com.smm.domain.MemberVO;

public interface MemberDAO {
	//�α���
	public MemberVO login(MemberVO vo) throws Exception;
	//ȸ������
	/*List<ZipcodeVO> getZipcodeList(String dong) throws Exception;
	
	public void regist(MemberVO vo) throws Exception;
	
	public int idcheck(String id) throws Exception;*/
}
