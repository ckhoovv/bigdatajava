package �迭;

import java.util.Scanner;

public class �л��������α׷� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] score = new int[3];
		int[] score1 = new int[3];
		
		
		for (int i = 0; i < 3; i++) {
			System.out.print("�л��̸� >>> ");
			name[i] = sc.next();
			System.out.print("�л����� (�ڹ�) >>> ");
			score[i] = sc.nextInt();
			System.out.print("�л����� (������) >>> ");
			score1[i] = sc.nextInt();
		}
		System.out.println("=================================");
		System.out.println("�� �л��� �̸��� " + name[0] +", "+name[1]+", "+name[2]+"�Դϴ�.");
		System.out.println("=================================");
		int max = score[0];
		String name1 = null;
		for (int i = 0; i < 3; i++) {
			if(max < score[i]) {
				max = score[i];
				name1 = name[i];
			}
		}
	    int min = score1[0];
		String name2 = null;
		for (int i = 0; i < 3; i++) {
			
			if(min > score1[i]) {
				min = score1[i];
				name2 = name[i];
			
			}
		}
			System.out.println("�л� ���� �� ���� ���� �ڹ� ������ " + max+"("+name1+")"+"�Դϴ�");
			System.out.println("�л� ���� �� ���� ���� ������ ������ " + min+"("+name2+")"+"�Դϴ�");
		}
	}
	


