package control;

public class Day3 {

	public static void main(String[] args) {
		/* 오늘 아침에 대한 정보출력(변수에 저장해서 출력)
		 * -----------------------
		 * 오늘 아침을 먹고 왔나요? true
		 * 오늘 타고 온 버스의 번호나 지하철 노선은? 2호선
		 * 오늘은 어제(10.5)보다 5.5도 낮아요. 오늘의 온도는: 9
		 * 오늘 부터 프로젝트 함께할 우리 조원의 이름은: 홍길동
		 */
		System.out.println("오늘 아침에 대한 정보출력");
		System.out.println("----------------");
		boolean ans = true;
		int line = 2;
		double tem1 = 10.5;
		double tem3 = 9;
		double tem2 = 5.5;
		String name =  "최주호";
		
		System.out.println("오늘 아침을 먹고 왔나요?" + ans);
		System.out.println("오늘 타고온 버스이 번호나 지하철 노선은?" + line + "호선");
		System.out.println("오늘은 어제(" + tem1 +")보다 " + tem2 +"도 낮아요. 오늘의 온도는:" + tem3);
		System.out.println("오늘 부터 프로젝트 함께할 우리 조원의 이름은:" + name);

	}

}
