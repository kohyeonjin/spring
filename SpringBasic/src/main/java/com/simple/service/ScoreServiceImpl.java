package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.simple.command.ScoreVO;
import com.simple.dao.ScoreDAO;
import com.simple.score.mapper.ScoreMapper;

@Service("xxx") //이름은 xxx //service 어노테이션은 컴포넌트스캔에 읽혀서 자동 빈생성
public class ScoreServiceImpl implements ScoreService {
	
//	@Autowired
//	@Qualifier("scoreDAO")
//	private ScoreDAO scoreDAO;
	
	@Autowired
	private ScoreMapper scoreMapper;
	
	public void regist(ScoreVO vo) {
		// TODO Auto-generated method stub
		
		scoreMapper.regist(vo);
	}

	@Override
	public ArrayList<ScoreVO> getList() {
	
		
		//여기에서 별다른 작업이 없으면
		return scoreMapper.getList();
	}

	@Override
	public void delete(int sno) {

		scoreMapper.delete(sno);
		
	}

}
