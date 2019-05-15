package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class MenuDAO {
	Connection con;
	ResultSet rs;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	DefaultTableModel model;
	JTable table;
	
	
	
	public MenuDTO menu () {
		MenuDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			url = "jdbc:mysql://localhost:3306/pos";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			String sql = "select * from foodlist";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String number = rs.getString(1);
				String menu = rs.getString(2);
				String amount = rs.getString(3);
				String price = rs.getString(4);
				
				
			}
			
			
			
			
			
			
		}catch(Exception e) {
			
		}
		return dto;
		
	}

}
