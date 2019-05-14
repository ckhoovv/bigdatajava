package java18;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("나는 스트링");
		list.add(100);
		
		//int <----> integer 자동변환
		//int ---> integer ---> object
		//  (boxing)    (upcasting)
		//int ---> integer (auto-boxing)기초형이 클래스로 변환되는것
		//int <--- integer (auto-unboxing)클래스가 기초형으로
		
		int num =(int)list.get(1);

		
		
		list.add(11.22);
		list.add(true);
		
		MemberDTO dto = new MemberDTO("java","java","java","java");
		list.add(dto);
		list.remove(3);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
	
	
	
	
	
	
	
	
	}

}
