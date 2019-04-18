package control;

import java.util.Scanner;

public class Day3Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나의 나이를 입력하세요: ");
		int age = sc.nextInt();
		System.out.print("동생의 나이를 입력하세요: ");
		int age2 = sc.nextInt();
		
		if(age >= age2) {
			System.out.println("내가 떡 2개를 먹어요.");
		 
		}else {
			System.out.println("동생이 떡 2개를 먹어요.");
		}
	
	}

}
