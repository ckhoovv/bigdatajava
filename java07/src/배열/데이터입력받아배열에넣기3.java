package �迭;

import java.util.Scanner;

public class �������Է¹޾ƹ迭���ֱ�3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//1�� ����
		String[] sub = new String[3];
		for (int i = 0; i < sub.length; i++) {
			System.out.print("���� �Է�>>");
			sub[i] = sc.next();
		}
		
		System.out.println("**" + sub[0] + "���ٴ� " + sub[2] + "**");
		//2������
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			System.out.print("���� �Է�>>");
			num[i] = sc.nextInt();
		}
		int result = num[0] + num[2];
		System.out.println(num[0] +" + " + num[2] + "�� " + result + "�Դϴ�." );

	}

}
