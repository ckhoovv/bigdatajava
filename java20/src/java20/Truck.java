package java20;

public class Truck extends Car {
	int weight;
	int length;
	
	
	public Truck() {
		System.out.println("트럭 객체생성.....");
		
	}
	
	public Truck(int weight, int length) {
		super();//자식 클래스 생성시 부모의 기본 생성자를 무조건 호출하게 되어있다
		this.weight = weight;
		this.length = length;
	}
	
	
	

}
