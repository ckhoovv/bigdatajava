package �迭;

public class �迭�Ǻ��� {

	public static void main(String[] args) {
		int[] num = {1, 2, 3}; //�迭(����, �ּ�)
		int num2 = 100; //����(�⺻, ��)
		
		//������ ����(�⺻)
		int num3 = num2;
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);

		num2 = 555;
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		//�迭�� ����(����, ������ ����)
		
		System.out.println("----------------");
		int[] num4 = num;
		System.out.println("num[0]: " + num[0]);
		System.out.println("num4[0]: " + num4[0]);
		
		num[0] = 555;
		System.out.println("num[0]: " + num[0]);
		System.out.println("num4[0]: " + num4[0]);
		
		System.out.println("------------------");
		int[] num5 = num.clone();
		num[0] = 999;
		System.out.println("num[0]: " + num[0]);
		System.out.println("num5[0]: " + num5[0]);

	}

}
