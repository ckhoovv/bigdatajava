package �迭;

import java.util.Scanner;

public class �α���ǥ {

	public static void main(String[] args) {
		String[] singer = new String[3];
		Scanner sc = new Scanner(System.in);
		int[] sum = new int[3];
		
		
		for (int i = 0; i < singer.length; i++) {
			System.out.print("�����̸� �Է� >>> ");
			singer[i] = sc.next();
		}
		System.out.println(singer[0] +", "+ singer[1] + ", " + singer[2]);
		while(true){
			System.out.println("1)" + singer[0] +"2) "+ singer[1] + "3) " + singer[2]);
			System.out.print("��ǥ��ȣ >>> ");
			int num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("��ǥ�� �����մϴ�.");
				break;
			}
			if(num == 1) {
				sum[0] += 1;
			}else if(num == 2) {
				sum[1] += 1;
			}else if(num == 3){
				sum[2] += 1;
			}
		
		}//while
		System.out.println(singer[0] + ": " + sum[0]);
		System.out.println(singer[1] + ": " + sum[1]);
		System.out.println(singer[2] + ": " + sum[2]);
		

	}

}
