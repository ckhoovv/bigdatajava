package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB처리업데이트 {

	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	
	public void update(String tel, String id) throws Exception {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		
		con = DriverManager.getConnection(url, user, password);
		
		String sql ="update member set tel = ? where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		
		ps.executeUpdate();

	}

}
