package ����ƽ;

public class �����ϻ� {

	public static void main(String[] args) {
		Day day1 = new Day("�ڹٰ���", 10,"����");
		System.out.println(Day.count);
		Day day2 = new Day("����", 15, "������");
		System.out.println(Day.count);
		Day day3 = new Day("�", 11, "��Ʈ�Ͻ�");
		System.out.println(Day.count);
		
		//1������
		System.out.println("��ü �ð���: " + Day.sum);
		//2������
		System.out.println("��ü �ð��� �����: " + Day.sum/Day.count);
		System.out.println("��ĥ�� ���ߴ���: " + Day.count);
		//3������
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
		
		System.out.println();
		System.out.println(Day.total);
		
		
		
		
		

	}

}
