package java18;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("���� ��Ʈ��");
		list.add(100);
		
		//int <----> integer �ڵ���ȯ
		//int ---> integer ---> object
		//  (boxing)    (upcasting)
		//int ---> integer (auto-boxing)�������� Ŭ������ ��ȯ�Ǵ°�
		//int <--- integer (auto-unboxing)Ŭ������ ����������
		
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
