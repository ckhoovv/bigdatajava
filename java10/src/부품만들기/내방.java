package ��ǰ�����;

public class ���� {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.company = "apple";
		p1.shape = "�׸���";
		p1.size = 11;
		
		System.out.println(p1.company);
		System.out.println(p1.shape);
		System.out.println(p1.size);
		p1.call();
		p1.text();
		p1.alarm();
		System.out.println();
		
		Phone p2 = new Phone();
		p2.company = "Galaxy";
		p2.shape = "�׸���";
		p2.size = 15;
		
		System.out.println(p2.company);
		System.out.println(p2.shape);
		System.out.println(p2.size);
		
		p2.call();
		p2.text();
		p2.alarm();
		
		System.out.println("------------");
		
		Tv tv1 = new Tv();
		tv1.color = "������";
		tv1.power = true;
		tv1.size = 50;
//		System.out.println(tv1.color);
//		System.out.println(tv1.power);
//		System.out.println(tv1.size);
		System.out.println(tv1);
		
		tv1.changeCh();
		tv1.sound();
		tv1.connect();
		System.out.println("------------");
		
		//class�� �����ؼ� ����  tv2�� ��ü��� �θ���.(���, object)
		//new�� ����: ��ü ����
		
		Tv tv2 = new Tv();
		tv2.color = "�Ͼ��";
		tv2.power = false;
		tv2.size = 100;
//		System.out.println(tv2.color);
//		System.out.println(tv2.power);
//		System.out.println(tv2.size);
		
		System.out.println(tv2);
	}

}
