package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB처리제거 {
	
	Connection con;
	PreparedStatement ps;
	String id;
	String url;
	String user;
	String password;
	

	public void delete(String id) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		
		con = DriverManager.getConnection(url, user, password);
		
		
		String sql ="delete from member where id = ?";
		
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		
		
		ps.executeUpdate();

	}

}
