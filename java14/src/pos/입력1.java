package pos;

import java.util.Scanner;

public class 입력1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("number 입력: ");
		int number = sc.nextInt();
		System.out.print("menu 입력: ");
		String menu = sc.next();
		System.out.print("amount 입력: ");
		int amount = sc.nextInt();
		System.out.print("price 입력: ");
		int price = sc.nextInt();
		
		FoodList fl = new FoodList();
		FoodListDTO dto = new FoodListDTO();
		dto.setNumber(number);
		dto.setMenu(menu);
		dto.setAmount(amount);
		dto.setPrice(price);
		
		try {
			fl.foodlist(dto);
		} catch (Exception e) {
			System.out.println("에러발생!!에러발생!!");
			e.printStackTrace();
		}

	}

}
