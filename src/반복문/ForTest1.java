package �ݺ���;

public class ForTest1 {
    //int test; //��������(global)
	public static void main(String[] args) {
//      for(�ʱⰪ; ���ǽ�; ������) {
		
		int sum = 0; // ��������(local)
		int start;
		for(start = 1; start <= 10; start++) {
			sum = start + sum;
			
			
		}
		
		System.out.println("1���� 10������ ����: " + sum );

	}

}
