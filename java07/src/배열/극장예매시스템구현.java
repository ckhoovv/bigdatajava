package �迭;

import java.util.Scanner;

public class ���忹�Žý��۱��� {

	public static void main(String[] args) {
		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		while(true) {		
		System.out.println("----------------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + "  ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		for (int i= 0; i< seat.length; i++) {
			System.out.print(seat[i] + "  ");
		}
		System.out.println();
		System.out.println("==================================");
		System.out.print("����� x, ���Ŵ� o >>> ");
		String end = sc.next();
		if(end.equals("x")) {
			System.out.println("���� �ý����� �����մϴ�.");
			break;
		}
		System.out.print("������ �¼���ȣ �Է� >>> ");
		int input = sc.nextInt();
		if(seat[input - 1] != 1) {
		    seat[input - 1] = 1;//����ó��
		    System.out.println("�¼� ���� �Ϸ�.!!");
		}else {
			System.out.println("�̹� ���ŵ� �ڼ��Դϴ�.");
			System.out.println("�ٸ� �¼��� �������ּ���.");
		}
		
		
	 }//while
		
	}

}
