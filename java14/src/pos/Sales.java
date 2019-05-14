package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Sales {
	
	Connection con;
	PreparedStatement ps;
	
	String url;
	String user;
	String password;
	

	public void sales(SalesDTO dto) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		url = "jdbc:mysql://localhost:3306/pos";
		user = "root";
		password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		
		String sql = "insert into sales values (?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql); 
		
		ps.setInt(1, dto.getMonth());
		ps.setInt(2, dto.getDay());
		ps.setString(3, dto.getMenu());

		
		ps.executeUpdate();
		
		
		
	}

}
