package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class DBTest {

	public static void main(String[] args) throws Exception {
//		1. ����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� Ok.....");
				
//		2. DB���� (DB��, ID, PW)
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� OK....");
		
		
//		3. SQL�� ����
		String sql ="insert into member values ('win','win','win','win')";
		java.sql.PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL�� ���� OK.....");
		
		
		//��üȭ
//		String url = "http://www.naver.com";
//		URL url2 = new URL(url);
		
		
//		4. SQL����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� OK.....");
		

	}

}
