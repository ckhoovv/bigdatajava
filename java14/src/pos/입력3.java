package pos;

import java.util.Scanner;

public class �Է�3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("material �Է�: ");
		String material = sc.next();
		System.out.print("warehousing �Է�: ");
		int warehousing = sc.nextInt();
		System.out.print("stock �Է�: ");
		int stock = sc.nextInt();
		System.out.print("warehousingdate �Է�: ");
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
			System.out.println("�����߻�!!�����߻�!!");
			e.printStackTrace();
		}

	}

}
