package jdbc;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DB�Է�2 {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("ID �Է�:");
		String pw = JOptionPane.showInputDialog("PW �Է�:");
		String name = JOptionPane.showInputDialog("NAME �Է�:");
		String tel = JOptionPane.showInputDialog("TEL �Է�:");
		
		
		
		MemberDAO db = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setTel(tel);
		
		try {
			db.insert(dto);
		} catch (Exception e) {
			System.out.println("�����߻�!!�����߻�!!");
			e.printStackTrace();
		}
		

	}

}
