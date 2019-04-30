package 배열1;

import java.util.Scanner;

public class 동아리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = {"김아무개","박아무개","송아무개","정아무개","장아무개"};
		String name1;
		int[] year = {1,2,3,1,1};
		String[] grade = {"A","B","C","A","B"};
		System.out.println("동아리 명단의 이번학기 성적입니다.");
		System.out.println();
		System.out.println("1. 전체인원은? " + name.length + "명입니다.");
		System.out.println("2. 전체 명단 프린트");
		System.out.println("이름     " + "     학년" + "     학점");
		System.out.println("-----------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(name[i] + "       "+year[i] + "    "+ grade[i]);
		}
		System.out.println();
		System.out.println("3. 학년별 인원수, 학점 별 인원수!");
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
		System.out.println("1학년 학생의 인원은: " + count + "명 입니다. " + "A학점의 인원은 " + sum + "명 입니다.");
		System.out.println("2학년 학생의 인원은: " + count1 + "명 입니다. " +"B학점의 인원은 " + sum1 + "명 입니다.");
		System.out.println("3학년 학생의 인원은: " + count2 + "명 입니다. " +"C학점의 인원은 "+ sum2 + "명 입니다.");
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
       System.out.print("4. 이 동아리에 가장 많은 학년은? ");
	   System.out.println("가장 많은 학년은 " + n + "학년 " + max + "명입니다." );
	   
	   
	  System.out.println("6. 이름을 입력받아 몇번째 인덱스에 있는지 찾아보세요.");
	  System.out.print("이름 입력>>>> ");
	  name1 = sc.next();
	  for (int i = 0; i < index.length; i++) {
		if(name1.equals(name[i])) {
			System.out.println("입력하신 이름 " + name1+ "위치는 " + i + "입니다.");
			System.out.println("학년은 " + year[i] + "학년 입니다.");
			System.out.println("학점은 " + grade[i] + "학점입니다.");
			
		}
	}
	

		
		

	}

}
