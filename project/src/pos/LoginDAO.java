package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String password;

	public MemberDTO login(String inputid, String inputpw) {
		MemberDTO dto = null;
		try {
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
				dto = new MemberDTO();
				String pw = rs.getString(2);
				if(pw.equals(inputpw)) {
					JOptionPane.showMessageDialog(null, "로그인성공");
				}else {
					JOptionPane.showMessageDialog(null, "비밀번호를 확인하세요");
					
				}
				}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

}
