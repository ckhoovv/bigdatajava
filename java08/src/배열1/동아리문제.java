package �迭1;

import java.util.Scanner;

public class ���Ƹ����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = {"��ƹ���","�ھƹ���","�۾ƹ���","���ƹ���","��ƹ���"};
		String name1;
		int[] year = {1,2,3,1,1};
		String[] grade = {"A","B","C","A","B"};
		System.out.println("���Ƹ� ����� �̹��б� �����Դϴ�.");
		System.out.println();
		System.out.println("1. ��ü�ο���? " + name.length + "���Դϴ�.");
		System.out.println("2. ��ü ��� ����Ʈ");
		System.out.println("�̸�     " + "     �г�" + "     ����");
		System.out.println("-----------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(name[i] + "       "+year[i] + "    "+ grade[i]);
		}
		System.out.println();
		System.out.println("3. �г⺰ �ο���, ���� �� �ο���!");
		int count = 0;   int sum = 0;
		int count1 = 0;  int sum1 = 0;
		int count2= 0;   int sum2 = 0;
		for (int i = 0; i < 5; i++) {
			if(year[i] == 1) {
				count++;
			}else if(year[i] == 2) {
				count1++;
			}else if(year[i] == 3) {
				count2++;
			}
			if(grade[i].equals("A")) {
				sum++;
			}else if(grade[i].equals("B")) {
				sum1++;
			}else if(grade[i].equals("C")) {
				sum2++;
			}
		}
		System.out.println("1�г� �л��� �ο���: " + count + "�� �Դϴ�. " + "A������ �ο��� " + sum + "�� �Դϴ�.");
		System.out.println("2�г� �л��� �ο���: " + count1 + "�� �Դϴ�. " +"B������ �ο��� " + sum1 + "�� �Դϴ�.");
		System.out.println("3�г� �л��� �ο���: " + count2 + "�� �Դϴ�. " +"C������ �ο��� "+ sum2 + "�� �Դϴ�.");
		int n = 0;
		int[] index = new int[5];
		int max = year[0];
		for (int i = 0; i < year.length; i++) {
			index[year[i]]++;
		}
		for (int i = 0; i < index.length; i++) {
			if(max < index[i]) {
				max= index[i];
				n = i;
			}
		}
       System.out.print("4. �� ���Ƹ��� ���� ���� �г���? ");
	   System.out.println("���� ���� �г��� " + n + "�г� " + max + "���Դϴ�." );
	   
	   
	  System.out.println("6. �̸��� �Է¹޾� ���° �ε����� �ִ��� ã�ƺ�����.");
	  System.out.print("�̸� �Է�>>>> ");
	  name1 = sc.next();
	  for (int i = 0; i < index.length; i++) {
		if(name1.equals(name[i])) {
			System.out.println("�Է��Ͻ� �̸� " + name1+ "��ġ�� " + i + "�Դϴ�.");
			System.out.println("�г��� " + year[i] + "�г� �Դϴ�.");
			System.out.println("������ " + grade[i] + "�����Դϴ�.");
			
		}
	}
	

		
		

	}

}
