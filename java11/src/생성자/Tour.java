package ������;

public class Tour {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "������";
		car1.convertible = true;
		System.out.println(car1);
		car1.change();
		int exSpeed = car1.speedup(100);
		System.out.println(exSpeed + "�� �ӵ��� UP");
		
		System.out.println();
		
		Car car2 = new Car("����", false);
		System.out.println(car2);
		
		System.out.println();
		
		Car car3 = new Car("����");
		System.out.println(car3);

	}

}
