package java18;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("���� ��Ʈ��");
		//String (��,�ڽ�) -> Object(�� , ũ��)
		//�ڵ�����ȯ, ��ĳ����
		list.add(100);
		System.out.println(list);
		String name = (String) list.get(0);
		//Object(��, ũ��) -> String(��, �ڽ�)
		//��������ȯ, �ٿ�ĳ����
		
		

	}

}
