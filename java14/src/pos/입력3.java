package pos;

import java.util.Scanner;

public class 입력3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("material 입력: ");
		String material = sc.next();
		System.out.print("warehousing 입력: ");
		int warehousing = sc.nextInt();
		System.out.print("stock 입력: ");
		int stock = sc.nextInt();
		System.out.print("warehousingdate 입력: ");
		int warehousingdate = sc.nextInt();
		
		Order or = new Order();
		OrderDTO dto = new OrderDTO();
		
		dto.setMaterial(material);
		dto.setWarehousing(warehousing);
		dto.setStock(stock);
		dto.setWarehousingdate(warehousingdate);
		
		try {
			or.ordertable(dto);
		} catch (Exception e) {
			System.out.println("에러발생!!에러발생!!");
			e.printStackTrace();
		}

	}

}
