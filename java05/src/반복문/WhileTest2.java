package �ݺ���;

public class WhileTest2 {

	public static void main(String[] args) {

		
		int start = 1;
		int sum = 0;
		while(start <= 10) {//���ǽ�
			//1���� 10������ ���ϱ�
			sum = sum + start;
			
			start = start + 1; //start++; ������
			
		}
		System.out.println(sum);
		
	}

}
