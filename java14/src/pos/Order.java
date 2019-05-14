package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Order {
	
	Connection con;
	PreparedStatement ps;
	
	String url;
	String user;
	String password;
	

	public void ordertable(OrderDTO dto) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		url = "jdbc:mysql://localhost:3306/pos";
		user = "root";
		password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		
		String sql = "insert into ordertable values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql); 
		
		ps.setString(1, dto.getMaterial());
		ps.setInt(2, dto.getWarehousing());
		ps.setInt(3, dto.getStock());
		ps.setInt(4, dto.getWarehousingdate());

		
		ps.executeUpdate();
		
		
		
	}

}
