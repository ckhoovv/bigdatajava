package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class MemberDAO {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String password;

	public boolean member(MemberDTO dto)  {
		
		
		boolean ok = false;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			url = "jdbc:mysql://localhost:3306/pos";
			user = "root";
			password = "1234";
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into member values (?,?,?,?,?)";
			ps = con.prepareStatement(sql); 
			
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getBirth());
			ps.setString(5, dto.getTel());
			
			
			int r = ps.executeUpdate();
			if(r>0) {
				JOptionPane.showMessageDialog(null, "���ԿϷ�");
				ok = true;
			}else {
				
				JOptionPane.showMessageDialog(null, "���ԺҰ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
		
	}
	public MemberDTO insert(String inputid)  {
       MemberDTO dto = null;
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
			rs = ps.executeQuery();
			if(rs.next()) {
				x=1;
				JOptionPane.showMessageDialog(null, "�ߺ��� ���̵��Դϴ�.");
				
			}else {
			    x=-1;
			    JOptionPane.showMessageDialog(null, "��밡���� ���̵��Դϴ�.");
			}
			
		} catch (Exception e) {
		}
		return dto;
		
		
		
	}
	
 
}
