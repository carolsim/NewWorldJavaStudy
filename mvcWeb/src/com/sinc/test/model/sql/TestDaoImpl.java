package com.sinc.test.model.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.sinc.test.model.vo.TestDTO;
import com.sinc.test.model.vo.TestVO;

public class TestDaoImpl implements TestDao {
	
	public static final String DRIVER ="oracle.jdbc.driver.OracleDriver";//package이름 + 맨뒤에는 클래스 이름
	public static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";//오라클 기본 포트이름은 1521임. xe는 디비의 sid
	public static final String USER= "hr";
	public static final String PASSWORD="hr";
	
	public TestDaoImpl() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public TestVO selectedRow(TestDTO dto) {
		Connection 			conn = null;
		PreparedStatement	pstmt = null;
		ResultSet			rset = null;
		String selectSQL = "SELECT ID, PWD, NAME, DEPT, POINT "
							+" FROM WEB_TEST_MEM_TBL"
							+" WHERE	ID = ? AND PWD =?";
		TestVO result = null;
		try {
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			pstmt = conn.prepareStatement(selectSQL);
			pstmt.setString(1, dto.getId()); pstmt.setString(2, dto.getPwd());
			rset= pstmt.executeQuery();
			while(rset.next()) {
				result = new TestVO(rset.getString(1),rset.getString(2),rset.getString(3),
						rset.getString(4),rset.getInt(5));
			}
			System.out.println(dto);

		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {conn.close();}//안정적인 코드는 아님. connection이 널일 수도 있기 때문 ... 그래서 null 조건을 추가해준다.
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Dao Dbug..........>>>>>>"+result);
		
		return result;//List를 리턴해야함 - 나중에 생성.... 이건 저스트어가이드라인. 현재 다른 클래스에서 void를 리턴하고 있기때문에 다 바꿔야함
	}
}
