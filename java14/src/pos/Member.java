package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Member {
	
	Connection con;
	PreparedStatement ps;
	
	String url;
	String user;
	String password;
	

	public void member(MemberDTO dto) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		url = "jdbc:mysql://localhost:3306/pos";
		user = "root";
		password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		
		String sql = "insert into member values (?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql); 
		
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setInt(4, dto.getBirth());
		ps.setInt(5, dto.getTel());

		
		ps.executeUpdate();
		
		
		
	}

}
