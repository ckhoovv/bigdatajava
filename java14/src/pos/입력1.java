package pos;

import java.util.Scanner;

public class �Է�1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("number �Է�: ");
		int number = sc.nextInt();
		System.out.print("menu �Է�: ");
		String menu = sc.next();
		System.out.print("amount �Է�: ");
		int amount = sc.nextInt();
		System.out.print("price �Է�: ");
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
			System.out.println("�����߻�!!�����߻�!!");
			e.printStackTrace();
		}

	}

}
