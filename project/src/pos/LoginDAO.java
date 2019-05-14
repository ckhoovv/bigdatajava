package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class LoginDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String password;

	public LoginDTO login(String inputid, String inputpw) {
		
		LoginDTO dto = null;
		try {
			int x = -1;
			Class.forName("com.mysql.jdbc.Driver");

			url = "jdbc:mysql://localhost:3306/pos";
			user = "root";
			password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from member where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputid);
			rs= ps.executeQuery();
			if(rs.next()){
                if(rs.getString(1).equals(inputpw)) {
                	
                	x = 1;
                	JOptionPane.showMessageDialog(null, "성공");
                }
                else {
                	x=0; // 비밀번호 불일치
                	JOptionPane.showMessageDialog(null, "실패");
                	
                }
            }
				

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

}
