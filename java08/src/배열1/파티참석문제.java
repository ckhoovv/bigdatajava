package �迭1;

import java.util.Scanner;

public class ��Ƽ�������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] age = new int[5];
		
		System.out.println("�̸��� ���̸� �Է��ϼ���.");
		for (int i = 0; i < name.length; i++) {
			System.out.print("�Է� >>> ");
			name[i] = sc.next();
			age[i] = sc.nextInt();
		}
		System.out.println("=============");
		System.out.println("�̸�         ����");
		for (int i = 0; i < age.length; i++) {
			System.out.println(name[i] + "   "+ age[i]);
		}
		System.out.println("=============");
		System.out.println("��ü �ο����� "+name.length+"�� �Դϴ�.");
		int sum = 0;
		for (int i = 0; i < age.length; i++) {
			sum = sum + age[i];
		}
		System.out.println("������ ������ ����� " + sum/age.length + "�Դϴ�.");
	

	}

}
