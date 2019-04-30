package 배열;

public class 별여러줄2 {

	public static void main(String[] args) {
		int[][] num = {
				{1, 2},
				{4, 5, 6},
		};
		
		//2줄 프린트
		for (int i = 0; i < num.length; i++) {
			//1줄 프린트
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]);
			}
			System.out.println("");
		}
		
		
		
		
	}

}
