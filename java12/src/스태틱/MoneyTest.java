package ����ƽ;

public class MoneyTest {

	public static void main(String[] args) {
		
		Money mem1 = new Money("��ƹ���1", 15);
		Money mem2 = new Money("��ƹ���2", 5);
		
		System.out.println("ù° ���� �̸���:" + mem1.name + "�̰�, " + "��° ���� �̸���: " + mem2.name + "�Դϴ�.");
		System.out.println("�ε��� " );  mem1.play(); mem1.tv();
		
		System.out.println("�ƺ��� �������� " + Money.money + "���� �����־��.");

	}

}
