package com.simple.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.simple.command.ScoreVO;

//마이바티스의 xml의 연결되는 인터페이스
//동일한 이름으로 TestMapper.xml
public interface TestMapper {

	public String getTime();
	public int insertOne(String name); //insert
	public int insertTwo(ScoreVO vo);
	public int insertFour(Map<String, String> map);
	public int insertThree(@Param("이름") String name,@Param("국어") int kor); //매개변수가 2개
	public ScoreVO selectOne(int sno); // 단일행 조회
	public Map<String,Object> selectTwo(int sno);
	public ArrayList<ScoreVO> selectThree();
	public ArrayList<Map<String,Object>> selectFour();
	public int updateOne(ScoreVO vo);
	public int deleteOne(int sno);
}
