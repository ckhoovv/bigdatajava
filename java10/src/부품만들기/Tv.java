package ��ǰ�����;

public class Tv {

//	TV - class
//
//	-����Ư��: ������ư����, ������, �� =>�������
	boolean power;
	int size;
	String color;
//	-����Ư��: ä�κ����ϴ�., �Ҹ��� �����ϴ�., �迬���ϴ�.=>����޼ҵ�
	public void changeCh() {
		System.out.println("ä���� �����ϴ�.");
	}
	public void sound() {
		System.out.println("�Ҹ��� �����ϴ�.");
	}
	public void connect() {
		System.out.println("���� �����ϴ�.");
	}
	
		public String toString() {
		
			return power + " " + size + " " + color;
		}
	
	
	
	
	
	

}
