package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class MemberDAO {
	
	Connection con;
	PreparedStatement ps;
	
	String url;
	String user;
	String password;
	boolean ok = false;

	public void member(MemberDTO dto) throws Exception {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		url = "jdbc:mysql://localhost:3306/pos";
		user = "root";
		password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		try {
			
			String sql = "insert into member values (?,?,?,?,?)";
			ps = con.prepareStatement(sql); 
			
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getBirth());
			ps.setString(5, dto.getTel());
			
			
			int r = ps.executeUpdate();
			if(r>0) {
				JOptionPane.showMessageDialog(null, "가입완료");
				ok = true;
			}else {
				JOptionPane.showMessageDialog(null, "가입불가");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
       
		
	}

}
