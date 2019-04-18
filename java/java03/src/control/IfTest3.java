package control;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 입력1: ");
		int num1 = sc.nextInt();
		System.out.print("정수 값 입력2: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2 ) {
			System.out.println("정수1의 값이 더 큽니다.");
			
		}else {
			System.out.println("정수2의 값이 더 큽니다.");
		}
		
		
		

	}//main end

}//class end
