package ��ǰ�����;

public class �Ž� {

	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		p1.company = "���";
		p1.shape = "�׸�";
		p1.size = 11;
		
		System.out.println(p1);
		System.out.println("------------------");
		
		
		//�޼ҵ� ���(call, �θ���.)
		String name = p1.call();
		System.out.println(name + "�� ��ȭ�� �ϴ�.");
		
		//void���� �޼ҵ带 ȣ���� ��쿡��
		//���Ϲ��� ���� �����Ƿ�
		//������ �־��� ���� ����,
		//����Ʈ ���� ���� ����.
//		System.out.println(p1.call());
		int time = p1.alarm();
		System.out.println(time + "�ÿ� �˶��� ��������ϴ�.");
		
		
		
		
		
		
		
		
		
		

	}

}
