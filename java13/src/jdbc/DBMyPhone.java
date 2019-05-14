package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DBMyPhone {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.");
		
		String url = "jdbc:mysql://localhost:3306/myphone";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		
		System.out.println(2.);
		String id = JOptionPane.showInputDialog("ID입력: ");
		String title = JOptionPane.showInputDialog("TITLE입력: ");
		String price = JOptionPane.showInputDialog("PRICE입력: ");
		String company = JOptionPane.showInputDialog("COMPANY입력: ");
		
		String sql ="insert into product values (?,?,?,?)";
		System.out.println(sql);
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, price);
		ps.setString(4, company);
		
		
		
		
		
		ps.executeUpdate();
		
		
		
		

	}

}
