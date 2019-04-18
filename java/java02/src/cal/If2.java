package cal;

public class If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 400;
		int y = 400 % 2;
		
		if(y % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		System.out.println("----삼항연산자");
		
		System.out.println(y == 0 ? "짝수" : "홀수");

	}

}
