package pos;

import java.util.Scanner;

public class �Է� {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id �Է�: ");
		String id = sc.next();
		System.out.print("pw �Է�: ");
		String pw = sc.next();
		System.out.print("name �Է�: ");
		String name = sc.next();
		System.out.print("birth �Է�: ");
		int birth = sc.nextInt();
		System.out.print("tel �Է�: ");
		int tel = sc.nextInt();
		
		Member mb1 = new Member();
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setBirth(birth);
		dto.setTel(tel);
		
		
		try {
			mb1.member(dto);
		} catch (Exception e) {
			System.out.println("�����߻�!!�����߻�!!");
			e.printStackTrace();
		}

	}

}
