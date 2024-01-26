package com.sist.main;
import java.sql.*;
public class MainClass {
	public static void main(String[] args) {
		try
		{  //핵심 => 자바(12장)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//오라클 연결 conn hr/happy
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			//네트워크 => ip/port XE => 데이터베이스 이용
			//파일 / 폴더
			// 테이블 / 데이터베이스 => book , emp , dept
			String id="hr";
			String pwd="happy";
			Connection conn=DriverManager.getConnection(url,id,pwd);
			String sql="SELECT ename,hiredate,job FROM emp";
			PreparedStatement ps=conn.prepareStatement(sql);// sql 문장을 오라클로 보내기
			ResultSet rs=ps.executeQuery(); // 오라클에보낸 결과값 가져오기
			while(rs.next())
			{
				System.out.println(rs.getString(1)+ " "
						+rs.getDate(2)+" "
						+rs.getString(3));
			}
			rs.close();
			ps.close();
			conn.close();
			
		}catch(Exception ex) {}
	}
}
