package ������;

public class ȸ�����ϸ��� {

	public static void main(String[] args) {
		
		Member2 m1 = new Member2("admin", "1234", "������", 1000);
		Member2 m2 = new Member2("manager", "pass", "�ذ�����", 1500);
		Member2 m3 = new Member2("sitemanager", "sitepass", "�ذ�����", 1800);
		
		int average = 0;
		int sum = 0;
		sum = m1.point + m2.point + m3.point;
		average = sum/ 3;
		System.out.println(m1.ID + "�� ��й�ȣ�� " + m1.PW + "�Դϴ�.");
		System.out.println(m2.ID + "�� " + m2.grade + "�̰�, ���ϸ����� " + m2.point + "�Դϴ�.");
		System.out.println("�� ���ϸ����� " + sum + "�Դϴ�.");
		System.out.println("��� ���ϸ�����" + average + "�Դϴ�.");

	}

}
