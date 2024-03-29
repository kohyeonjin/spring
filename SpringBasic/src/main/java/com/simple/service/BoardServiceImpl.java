package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.simple.board.mapper.BoardMapper;
import com.simple.command.BoardVO;

@Service
@Primary
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public void boardRegist(BoardVO vo) {
		// TODO Auto-generated method stub
		boardMapper.boardRegist(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {
		// TODO Auto-generated method stub
		
		ArrayList<BoardVO> list = boardMapper.getList();
		return list;
	}

	@Override
	public void boardDelete(int num) {
		// TODO Auto-generated method stub
		
		boardMapper.boardDelete(num);
		
	}

}
