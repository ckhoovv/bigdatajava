package �ݺ���;


public class WhileTest3 {

	public static void main(String[] args) {
		//�� ���� �Է°��� �޾Ƽ�,
		//ù��°������ �ι�°������ ����.
		int num1 = 11;//�ʱⰪ
		int num2 = 20;
		
		int sum = 0;
		while(num1 <= num2) {//���ǽ�
			sum = num1 + sum;//���ϴ� ��.
			num1++;//������
			
		}
		System.out.println(sum);
	}

}
