package ����ƽ;

public class Money {
	
	String name;
	int age;
	static int money = 10000;
	
	public Money(String name, int age) {
		this.name = name;
		this.age = age;
		money -=1000;
	}
	
	
	@Override
	public String toString() {
		return "Money [name=" + name + ", age=" + age + "]";
	}
	
	public void play() {
		System.out.println("���� ��ƿ�.");
	}
	public void tv() {
		System.out.println("TV�� ����.");
	}
	

}
