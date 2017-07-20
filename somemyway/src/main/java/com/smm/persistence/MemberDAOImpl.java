package com.smm.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.smm.domain.MemberVO;
import com.smm.domain.ZipcodeVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static String namespace = "com.smm.mapper.MemberMapper";
	
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return sqlSession.selectOne(namespace + ".login", vo);
	}

	@Override
	public List<ZipcodeVO> getZipcodeList(String dong) throws Exception {
		return sqlSession.selectList(namespace + ".getZipcodeList", dong) ;
	}

	@Override
	public void regist(MemberVO vo) throws Exception {
		sqlSession.insert(namespace + ".regist", vo);
	}

	/*@Override
	public int idcheck(String id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}*/

}
