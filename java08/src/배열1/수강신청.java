package �迭1;

import java.util.Scanner;

public class ������û {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("������û�� �����մϴ�.");
		System.out.println("���ϴ� ������ ��û���ּ���.");
		while(true) {
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("1) �ڹ�  2)������ 3)�ȵ���̵� 4) ���̽� 5) ��������");
		System.out.println("---------------------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.print("   "+num[i] + "    ");
			
		}
        System.out.println();	
		System.out.println("=============================================");
		System.out.print("���ϴ� �����ڵ带 �Է����ּ���.(����0) ==> ");
		int input = sc.nextInt();
		if(input == 0) {
			System.out.println("��û�� �����մϴ�.");
			System.out.println("�ȳ��� ������.");
			break;
			
		}
		if(num[input -1] != 1) {
			num[input -1] = 1;
			System.out.println("��û�����մϴ�.");
			System.out.println("��û�Ϸ�Ǿ����ϴ�.");
			
		}else {
			System.out.println("��û �Ұ��� �մϴ�.");
			System.out.println("�ٸ� �ڵ� ��ȣ�� �Է����ּ���.");
		}
		
		}//while
	}

}
