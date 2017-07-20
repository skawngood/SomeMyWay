package com.smm.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.smm.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static String namespace = "com.smm.mapper.MemberMapper";
	
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return sqlSession.selectOne(namespace + ".login", vo);
	}

}
