package �迭;

import java.util.Scanner;

public class �������Է¹޾ƹ迭���ֱ�2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			System.out.print("���� �Է�>>");
			num[i] = sc.nextInt();
		}
		
		for (int i : num) {
			System.out.println(i);
		}
		
		

	}

}
