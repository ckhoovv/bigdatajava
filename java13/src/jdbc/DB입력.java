package jdbc;

import java.util.Scanner;

public class DB�Է� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------ȸ������ ���� �Է�-------");
		
		System.out.print("���̵�: ");
		String id = sc.next();
		System.out.print("�н�����: ");
		String pw = sc.next();
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("����ó: ");
		String tel = sc.next();
		
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
