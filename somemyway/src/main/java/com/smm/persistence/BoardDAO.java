package com.smm.persistence;

import java.util.List;

import com.smm.domain.BoardVO;

public interface BoardDAO {
	//�Խ���
	public void create(BoardVO vo)throws Exception;
			
	public BoardVO read(int bno)throws Exception;
			
	public void update (BoardVO vo)throws Exception;
			
	public void delete(int bno)throws Exception;
			
	public List<BoardVO> listAll()throws Exception;
}
