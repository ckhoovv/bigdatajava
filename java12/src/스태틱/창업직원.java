package ����ƽ;

public class â������ {

	public static void main(String[] args) {
		Member mem1 = new Member("�Ӿƹ���", "��", 24);
		Member mem2 = new Member("��ƹ���", "��", 23);
		Member mem3 = new Member("�ھƹ���", "��", 25);
		
		
		
		System.out.println("��ü ������ ����: " + Member.count + "�� �Դϴ�.");
		System.out.println("�������� ��� ���̴�: " + Member.sum/Member.count + "�� �Դϴ�.");
		System.out.println("ù��° ������ �̸���: " + mem1.name + " �Դϴ�.");

	}

}
