package �迭;

public class �������迭2 {

	public static void main(String[] args) {
		int[][] num = {
				{44, 55, 66},       //1��
				{77, 88, 99, 100},  //2��
		};
			
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[i].length; j++) {
					sum = sum + num[i][j];
				}
				System.out.println(i+1 + "���� �����: " + sum / num[i].length);
				sum = 0;
			}
		
		
		

	}

}
