package pos;

import java.util.Scanner;

public class �Է�2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("month �Է�: ");
		int month = sc.nextInt();
		System.out.print("day �Է�: ");
		int day = sc.nextInt();
		System.out.print("menu �Է�: ");
		String menu = sc.next();
		
		Sales sa = new Sales();
		SalesDTO dto = new SalesDTO();
		dto.setMonth(month);
		dto.setDay(day);
		dto.setMenu(menu);
		
		try {
			sa.sales(dto);
		} catch (Exception e) {
			System.out.println("�����߻�!!�����߻�!!");
			e.printStackTrace();
		}

	}

}
