package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	//�������
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String password;
	
	
	public String[] select(String id) throws Exception {
//		1. ����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� Ok.....");
				
//		2. DB���� (DB��, ID, PW)
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� OK....");
		
//		3. SQL�� ����
		String sql ="select * from member where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL�� ���� OK.....");
		
//		4. SQL����
		rs = ps.executeQuery();
		System.out.println("4. SQL�� ���� OK.....");
		String[] mem = null;
		if(rs.next()) { //���ڵ� ����
			mem = new String[4];
			String s1 = rs.getString(1); //id
			String s2 = rs.getString(2); //pw
			String s3 = rs.getString(3); //name
			String s4 = rs.getString(4); //tel
			mem[0] = s1;
			mem[1] = s2;
			mem[2] = s3;
			mem[3] = s4;
//			System.out.println("�˻��� ID: " + s1);
//			System.out.println("�˻��� PW: " + s2);
//			System.out.println("�˻��� NAME: " + s3);
//			System.out.println("�˻��� TEL: " + s4);
		}else { //���ڵ� ����x
			System.out.println("�˻� ����� �����ϴ�.");
		}
		return mem;
		
	}
	//����޼ҵ�

	public void insert(MemberDTO dto) throws Exception {
//		1. ����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� Ok.....");
				
//		2. DB���� (DB��, ID, PW)
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� OK....");
		
		
//		3. SQL�� ����
		String sql ="insert into member values (?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		System.out.println("3. SQL�� ���� OK.....");
		
		
		
		
//		4. SQL����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� OK.....");
		

	}

}
