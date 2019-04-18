package control;

import java.util.Scanner;

public class 콘솔테스트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("먹고 싶은 메뉴를 입력하세요: ");
		String like = sc.next();
		System.out.print("먹기 싫은 메뉴를 입력하세요: ");
		String dislike = sc.next();
		
		System.out.println("당신이 먹고 싶어하는 메뉴는 " + like + "이고, " +
				            "당신이 먹기 싫어하는 메뉴는 " + dislike + "입니다.");
		
	}

}
