package java16;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		//순서가 중요.
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		int size = list.size();
		System.out.println("리스트의 개수는 " + size + "개");
		System.out.println(list);// toString 재정의
		list.remove(1);
		System.out.println(list);// toString 재정의
		list.add(1, "뉴인물");//값을 삽입할때는 add를 쓴다.
		System.out.println(list);// toString 재정의
		list.set(1, "올드인물");//값을 바꿀때는 set을 쓴다.
		System.out.println(list);// toString 재정의
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "등: " + list.get(i));
			
		}
		System.out.println("");
//		list.remove(0);
//		System.out.println(list);
//		list.remove(1);
//		System.out.println(list);
//		list.remove("정스키");
//		System.out.println(list);
		ArrayList list1 = new ArrayList();
		list1.add("박소정");
		list1.add("김정민");
		list1.add("소지현");
		list1.add("김개념");
		list1.remove(1);
		int size1 = list1.size();
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(i + 1 + "등:" + list1.get(i) + "  ");
			
		}
		
		
		
	}

}
