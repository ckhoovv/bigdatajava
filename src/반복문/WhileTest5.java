package �ݺ���;

import java.util.Scanner;

public class WhileTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���.");
		System.out.print("����1 �Է�: ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է�: ");
		int num2 = sc.nextInt();
		
		int mul = 1;
		while(num1 <= num2) {
			mul = num1 * mul;
			num1++;
			
		}
		System.out.println(mul);
	}

}
