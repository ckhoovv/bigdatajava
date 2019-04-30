package 배열1;

import java.util.Scanner;

public class 파티참석문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] age = new int[5];
		
		System.out.println("이름과 나이를 입력하세요.");
		for (int i = 0; i < name.length; i++) {
			System.out.print("입력 >>> ");
			name[i] = sc.next();
			age[i] = sc.nextInt();
		}
		System.out.println("=============");
		System.out.println("이름         나이");
		for (int i = 0; i < age.length; i++) {
			System.out.println(name[i] + "   "+ age[i]);
		}
		System.out.println("=============");
		System.out.println("전체 인원수는 "+name.length+"명 입니다.");
		int sum = 0;
		for (int i = 0; i < age.length; i++) {
			sum = sum + age[i];
		}
		System.out.println("참석자 나이의 평균은 " + sum/age.length + "입니다.");
	

	}

}
