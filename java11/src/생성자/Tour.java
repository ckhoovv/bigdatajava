package 생성자;

public class Tour {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "검정색";
		car1.convertible = true;
		System.out.println(car1);
		car1.change();
		int exSpeed = car1.speedup(100);
		System.out.println(exSpeed + "로 속도를 UP");
		
		System.out.println();
		
		Car car2 = new Car("빨강", false);
		System.out.println(car2);
		
		System.out.println();
		
		Car car3 = new Car("빨강");
		System.out.println(car3);

	}

}
