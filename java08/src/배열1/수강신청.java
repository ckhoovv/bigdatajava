package 배열1;

import java.util.Scanner;

public class 수강신청 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("수강신청을 진행합니다.");
		System.out.println("원하는 과목을 신청해주세요.");
		while(true) {
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("1) 자바  2)스프링 3)안드로이드 4) 파이썬 5) 제이쿼리");
		System.out.println("---------------------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.print("   "+num[i] + "    ");
			
		}
        System.out.println();	
		System.out.println("=============================================");
		System.out.print("원하는 과목코드를 입력해주세요.(종료0) ==> ");
		int input = sc.nextInt();
		if(input == 0) {
			System.out.println("신청을 종료합니다.");
			System.out.println("안녕히 가세요.");
			break;
			
		}
		if(num[input -1] != 1) {
			num[input -1] = 1;
			System.out.println("신청가능합니다.");
			System.out.println("신청완료되었습니다.");
			
		}else {
			System.out.println("신청 불가능 합니다.");
			System.out.println("다른 코드 번호를 입력해주세요.");
		}
		
		}//while
	}

}
