package java10_jdbc_oarcle;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	//변수
	protected Connection connection =null;
	protected PreparedStatement pstmt = null;
	protected CallableStatement cstmt = null;
	protected ResultSet rs = null;
	
	String url= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String username = "scott";
	String password = "tiger";
	
	protected String sql = null;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("드라이브 로딩 예외...");
			e.printStackTrace();
		}
	}
	
	//DB 연결
	public void getConnection() {
		try {
			connection = DriverManager.getConnection(url,username,password);	
		} catch (Exception e) {
			System.out.println("DB연결예외 발생...");
			e.printStackTrace();
		}
	}
	
	//DB 종료
	public void dbClose() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(cstmt !=null) cstmt.close();
			if(connection != null) connection.close();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
