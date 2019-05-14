package pos;

import java.util.Scanner;

public class 입력 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id 입력: ");
		String id = sc.next();
		System.out.print("pw 입력: ");
		String pw = sc.next();
		System.out.print("name 입력: ");
		String name = sc.next();
		System.out.print("birth 입력: ");
		int birth = sc.nextInt();
		System.out.print("tel 입력: ");
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
			System.out.println("에러발생!!에러발생!!");
			e.printStackTrace();
		}

	}

}
