package control;

import java.util.Scanner;

public class IfTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 입력1: ");
		int num1 = sc.nextInt();
		System.out.print("정수 값 입력2: ");
		int num2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		
		if(num2 == 0 ) {
			System.out.println("나눌수 없습니다.");
			
		}else {
			System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		}
		
		
		

	}//main end

}//class end
