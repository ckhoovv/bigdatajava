package ������;

public class Car {
	
	//�����Ӽ�
	String color;
	boolean convertible;
	
	


	//����Ű: ��Ʈ + ����Ʈ + S + O
	public Car() {
	}
	public Car(String color) {
		this.color = color;
	}
	public Car(String color, boolean convertible) {
		this.color = color;
		this.convertible = convertible;
	}
	


	//�����Ӽ�
	public void change() {
		System.out.println("�� �ٲٴ�.");
	}
	public int speedup(int nowSpeed) {
		return nowSpeed + 30;
	}
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", convertible=" + convertible + "]";
	}
	
	

}
