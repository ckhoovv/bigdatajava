package �ݺ���;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		System.out.print("���� 1�� �Է� : ");
		int n1 = sc.nextInt();
		
		System.out.print("���� 2�� �Է� : ");
		int n2 = sc.nextInt();
		
		System.out.print("���� 3�� �Է� : ");
		int n3 = sc.nextInt();
		
		int sum = n1 + n2 + n3;

		System.out.println("������ ���� ���� ���� " + sum +"�Դϴ�.");
	}

}
