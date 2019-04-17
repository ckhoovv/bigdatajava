package cal;

import java.util.Scanner;

public class Me2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 취미는?");
		String hobby = sc.next();
		System.out.print("평소 TV시청 시간은 얼마인가요?");
		int time = sc.nextInt();
		System.out.print("봄여행을 다녀왔나요?");
		String ans = sc.next();
		System.out.println("------------------------------");
		System.out.println("내 취미는 " + hobby + "이고, " + "평소에 TV를 "+ time +"시간도 보지 않아요.");
		if(ans.equals("y")) {
			System.out.println("봄여행은 true예요.");
			
		}else {
			System.out.println("봄여행은 false예요.");
		}

	}

}
