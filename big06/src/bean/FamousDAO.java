package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FamousDAO {
	   public void insert(FamousDTO dto) throws Exception {
		      
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("드라이버 설정 ok<br>");
		      String url = "jdbc:mysql://localhost:3306/shopping";
		      String user = "root";
		      String pwd = "1234";
		      
		      Connection con = null;
		      PreparedStatement ps = null;
		     
		      con = DriverManager.getConnection(url, user, pwd);
		      String sql = "insert into famous values(?,?,?,?,?,?)";
		      ps = con.prepareStatement(sql);
		      
		      ps.setString(1,dto.getNumber());
		      ps.setString(2,dto.getName());
		      ps.setString(3,dto.getAge());
		      ps.setString(4,dto.getTall());
		      ps.setString(5,dto.getSex());
		      ps.setString(6,dto.getKg());
		      ps.executeUpdate();
		}
		}

