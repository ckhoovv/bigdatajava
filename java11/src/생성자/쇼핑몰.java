package ������;

import java.util.Scanner;

public class ���θ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member[] member = new Member[3];
		System.out.println("������ ������ �Է����ּ���.");
		for (int i = 0; i < member.length; i++) {
			System.out.print("������  �̸�: ");
			String name = sc.next();
			System.out.print("������ ����: ");
			int age = sc.nextInt();
			System.out.print("������ ��ȭ��ȣ: ");
			String tel = sc.next();
			System.out.print("������ �ּ�: ");
			String addr = sc.next();
			
		    member[i] = new Member(name, age, tel, addr);
		}
		System.out.println("--------------------------------");
		System.out.println("���θ� ȸ������ ���");
		System.out.println("================================");
		System.out.println("�̸�      ����       ��ȭ��ȣ      �ּ�");
		System.out.println("--------------------------------");
		
		for (int i = 0; i < member.length; i++) {
			System.out.println(member[i]);
			
			
		}	
		

	}

}
