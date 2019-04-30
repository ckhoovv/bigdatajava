package 생성자;

import java.util.Scanner;

public class 쇼핑몰 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member[] member = new Member[3];
		System.out.println("가입할 정보를 입력해주세요.");
		for (int i = 0; i < member.length; i++) {
			System.out.print("가입할  이름: ");
			String name = sc.next();
			System.out.print("가입할 나이: ");
			int age = sc.nextInt();
			System.out.print("가입할 전화번호: ");
			String tel = sc.next();
			System.out.print("가입할 주소: ");
			String addr = sc.next();
			
		    member[i] = new Member(name, age, tel, addr);
		}
		System.out.println("--------------------------------");
		System.out.println("쇼핑몰 회원가입 명단");
		System.out.println("================================");
		System.out.println("이름      나이       전화번호      주소");
		System.out.println("--------------------------------");
		
		for (int i = 0; i < member.length; i++) {
			System.out.println(member[i]);
			
			
		}	
		

	}

}
