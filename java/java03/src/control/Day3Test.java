package control;

import java.util.Scanner;

public class Day3Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("오늘의 치킨 가격은 얼마인가요?");
        int price =sc.nextInt();
        
        if(price > 9000) {
        	System.out.println("내일 다시 전화 할게요.");
        	
        }else {
        	System.out.println("주문할게요.");
        }
        
	
	}

}
