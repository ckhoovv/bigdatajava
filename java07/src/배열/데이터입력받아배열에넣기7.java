package �迭;


public class �������Է¹޾ƹ迭���ֱ�7 {

	public static void main(String[] args) {
		
		int num[] = {66, 77, 88, 99};
		
		int max = num[0];
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
			if (min > num[i]) {
				min = num[i];
				
			}
		}
		System.out.println("�ִ밪�� " + max + "�Դϴ�.");
		System.out.println("�ּҰ��� " + min + "�Դϴ�.");
		
	}

}
