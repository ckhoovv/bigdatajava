package �迭;

import java.util.Scanner;

public class ���̳��͹迭ũ�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] classAB = new int[2][];
		
		for (int i = 0; i < classAB.length; i++) {
			System.out.print(i + 1 +"�� �ο� �Է�: ");
			int count =sc.nextInt();
			classAB[i] = new int[count];
		}
		
		for (int i = 0; i < classAB.length; i++) {
			for (int j = 0; j < classAB[i].length; j++) {
				System.out.print(classAB[i][j]);
				
			}System.out.println();
		}

	}

}
