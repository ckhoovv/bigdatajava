package 배열1;

import java.util.Scanner;

public class 콘도예약문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		System.out.println("-----------콘도 예약을 진행합니다.---------------");
		while(true) {
		System.out.println("원하시는 지역을 신청해주세요(각 지역은 2명까지 신청가능");
		System.out.println("-------------------------------------------");
		System.out.println("1)강원도 2)전라도 3)파주 4)제주도 5)충청도");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < num.length; i++) {
			System.out.print("  " + num[i] + "    ");
		}
		System.out.println("");
		System.out.println("===========================================");
	    System.out.print("원하시는 지역코드를 입력하세요..(종료는 0) >>>");
	    int input = sc.nextInt();
	    if(input == 0) {
	    	System.out.println("프로그램을 종료합니다.");
	    	break;
	    }
	    if(num[input - 1] < 2) {
	    	num[input -1] += 1;
	    	System.out.println("신청가능합니다.");
	    	System.out.println("신청이 완료되었습니다.");
	    }else {
	    	System.out.println("이미 인원이 초과되어 신청이 불가능합니다.");
	        System.out.println("다른 지역을 선택해주세요.");
	    }
		
		}//while

	}

}
