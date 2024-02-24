package com.simple.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;

@Repository("scoreDAO")
public class ScoreDAOImpl implements ScoreDAO {
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public void regist(ScoreVO vo) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO SCORE VALUES(SCORE_SEQ.NEXTVAL,?,?,?,?)";
		//JDBC기본문법으로 insert ->
		try {
			
			conn = dataSource.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getKor());
			pstmt.setString(3, vo.getEng());
			pstmt.setString(4, vo.getMath());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstmt!=null)pstmt.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	@Override
	public ArrayList<ScoreVO> getList() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ScoreVO> list = new ArrayList<>();
		
		String sql = "SELECT * FROM SCORE ORDER BY SNO DESC";
		
		try {
			
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int sno = rs.getInt("sno");
				String name = rs.getString("name");
				String kor = rs.getString("kor");
				String eng = rs.getString("eng");
				String math = rs.getString("math");
				
				ScoreVO vo = new ScoreVO(sno, name, kor, math, eng);
				list.add(vo);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
				if(rs!=null) rs.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return list;
	}

	@Override
	public void delete(int sno) {
		// TODO Auto-generated method stub
		
		String sql = "DELETE SCORE WHERE SNO = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = dataSource.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sno);
			pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
	}

}
