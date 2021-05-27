package db.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest 
{

	public static void main(String[] args) throws SQLException 
	{
		Connection conn = null;
		String url = "jdbc:oracle:thin@localhost:1521xe";
		
		String user = "myuser";
		String passwd = "12341";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver1");
			conn = DriverManager.getConnection(url, user, passwd);
			
			System.out.println("오라클 접속 성공!!");
		}catch(ClassNotFoundException e) {
			System.out.println("오라클 접속 실패");
			System.out.println("ojbdc6.jar 파일에 존재하는 자바 파일을 찾지 못함");
			System.out.println("이유 : " + e.toString());
		}catch(Exception e) {
			System.out.println("오라클 접속 실패 - 최종 Exception까지 호출함");
			System.out.println("이유 : " + e.toString());
		}finally {
			if(conn != null) {
				conn.close();
			}
		}
		conn = null;
	}

}
