package �ݺ���;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("����[1-4]�� �Է��ϼ���=> ");
			int num = sc.nextInt();
			
		if(num == 1 ) {
			System.out.println("���Դϴ�.");
			break;
		}else if(num == 2 ) {
			System.out.println("�����Դϴ�.");
			break;
		}else if(num == 3 ) {
			System.out.println("�����Դϴ�.");
			break;
		}else if(num == 4){
			System.out.println("�ܿ��Դϴ�.");
			break;
		}
		
		}
		sc.close();
	}
}
