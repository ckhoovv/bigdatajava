package �ݺ���;

import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���.");
		System.out.print("����1 �Է�: ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է�: ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		while(num1 <= num2) {
			
			sum = sum + num1;
			num1++;
			
		}
		System.out.println(sum);
		
		
	}

}
