package ������;


public class ���� {

	public static void main(String[] args) {
		
		Member1 m1 = new Member1("û������","��ƹ���",500);
		Member1 m2 = new Member1("������","��ƹ�����",30);
		Member1 m3 = new Member1("��������","�ھƹ���",100);
		int sum = 0;
		sum = m1.money+m2.money+m3.money;
		
		System.out.println(m2.product + " ���忡�� " + m2.money + "������ ����־��.");
		System.out.println(m3.name + "�� ���忡�� " + m3.money + "������ ����־��.");
		System.out.println("�츮 �� ��ü�� ���ݾ��� " + sum +"���� �̿���.");
		

	}

}
