package �迭;


public class ��Ʈ���迭 {

	public static void main(String[] args) {
		int[] ages = {50, 100, 10};
		for (int i : ages) {
			System.out.print(i + " ");
		}
		System.out.println();
		String[] names = {"ȫ�浿", "�ڱ浿", "��浿"};
		
		names[2] = "�赿��";
		names[names.length-1] = "�赿��";
		
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		
		for (int i : ages) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (String imsi : names) {
			System.out.print(imsi + " ");
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
