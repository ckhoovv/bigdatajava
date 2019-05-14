package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FoodList {
	
	Connection con;
	PreparedStatement ps;
	
	String url;
	String user;
	String password;
	

	public void foodlist(FoodListDTO dto) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		url = "jdbc:mysql://localhost:3306/pos";
		user = "root";
		password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		
		String sql = "insert into foodlist values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql); 
		
		ps.setInt(1, dto.getNumber());
		ps.setString(2, dto.getMenu());
		ps.setInt(3, dto.getAmount());
		ps.setInt(4, dto.getPrice());

		
		ps.executeUpdate();
		
		
		
	}

}
