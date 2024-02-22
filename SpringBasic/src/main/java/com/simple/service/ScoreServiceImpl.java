package com.simple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.simple.command.ScoreVO;
import com.simple.dao.ScoreDAO;

@Service("xxx") //이름은 xxx //service 어노테이션은 컴포넌트스캔에 읽혀서 자동 빈생성
public class ScoreServiceImpl implements ScoreService {
	
	@Autowired
	@Qualifier("scoreDAO")
	private ScoreDAO scoreDAO;
	
	public void regist(ScoreVO vo) {
		// TODO Auto-generated method stub
		
		scoreDAO.regist(vo);
	}

}
