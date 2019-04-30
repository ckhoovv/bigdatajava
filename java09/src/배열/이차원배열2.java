package 배열;

public class 이차원배열2 {

	public static void main(String[] args) {
		int[][] num = {
				{44, 55, 66},       //1반
				{77, 88, 99, 100},  //2반
		};
			
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[i].length; j++) {
					sum = sum + num[i][j];
				}
				System.out.println(i+1 + "반의 평균은: " + sum / num[i].length);
				sum = 0;
			}
		
		
		

	}

}
