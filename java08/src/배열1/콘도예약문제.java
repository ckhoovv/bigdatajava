package �迭1;

import java.util.Scanner;

public class �ܵ����๮�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		System.out.println("-----------�ܵ� ������ �����մϴ�.---------------");
		while(true) {
		System.out.println("���Ͻô� ������ ��û���ּ���(�� ������ 2����� ��û����");
		System.out.println("-------------------------------------------");
		System.out.println("1)������ 2)���� 3)���� 4)���ֵ� 5)��û��");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < num.length; i++) {
			System.out.print("  " + num[i] + "    ");
		}
		System.out.println("");
		System.out.println("===========================================");
	    System.out.print("���Ͻô� �����ڵ带 �Է��ϼ���..(����� 0) >>>");
	    int input = sc.nextInt();
	    if(input == 0) {
	    	System.out.println("���α׷��� �����մϴ�.");
	    	break;
	    }
	    if(num[input - 1] < 2) {
	    	num[input -1] += 1;
	    	System.out.println("��û�����մϴ�.");
	    	System.out.println("��û�� �Ϸ�Ǿ����ϴ�.");
	    }else {
	    	System.out.println("�̹� �ο��� �ʰ��Ǿ� ��û�� �Ұ����մϴ�.");
	        System.out.println("�ٸ� ������ �������ּ���.");
	    }
		
		}//while

	}

}
