package �迭;

public class �迭��ġ���� {

	public static void main(String[] args) {
		int num[] = {66, 77, 88, 99};
		
		int n;
		n = num[0];
		num[0] = num[3];
		num[3] = n;
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
