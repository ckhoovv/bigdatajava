package �迭;

public class �迭����2 {

	public static void main(String[] args) {
		int [] num = {44, 66, 22, 88};
        
		
		//����Ʈ�� ����ִ� ������ ����
		System.out.println(num.length);

		//��ü ���
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println("");
		
		//ù��° ���� 55�� �����ؼ� ���
		num[0] = 55;
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
