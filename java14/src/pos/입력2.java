package pos;

import java.util.Scanner;

public class 입력2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("month 입력: ");
		int month = sc.nextInt();
		System.out.print("day 입력: ");
		int day = sc.nextInt();
		System.out.print("menu 입력: ");
		String menu = sc.next();
		
		Sales sa = new Sales();
		SalesDTO dto = new SalesDTO();
		dto.setMonth(month);
		dto.setDay(day);
		dto.setMenu(menu);
		
		try {
			sa.sales(dto);
		} catch (Exception e) {
			System.out.println("에러발생!!에러발생!!");
			e.printStackTrace();
		}

	}

}
