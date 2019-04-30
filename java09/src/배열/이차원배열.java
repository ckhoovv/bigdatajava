package 배열;

public class 이차원배열 {

	public static void main(String[] args) {
		//배열을 만들때
		//초기값을 지정하지 않는 경우
		int[][] seat = new int[3][10];
		//초기값을 지정하는 경우
		int[][] num = {
				{1, 2, 3},
				{4, 5, 6},
		};
		System.out.println(num[0][1]);
		System.out.println(num[1][2]);
		
		System.out.println("배열의 개수(행의 개수): " + num.length);
		System.out.println("배열 0행의 열 개수: " + num[0].length);
		System.out.println("배열 1행의 열 개수: " + num[1].length);
		
		
		
		
		

	}

}
