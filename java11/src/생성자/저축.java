package 생성자;


public class 저축 {

	public static void main(String[] args) {
		
		Member1 m1 = new Member1("청약적금","김아무개",500);
		Member1 m2 = new Member1("내비상금","김아무개딸",30);
		Member1 m3 = new Member1("자유적금","박아무개",100);
		int sum = 0;
		sum = m1.money+m2.money+m3.money;
		
		System.out.println(m2.product + " 통장에는 " + m2.money + "만원이 들어있어요.");
		System.out.println(m3.name + "의 통장에는 " + m3.money + "만원이 들어있어요.");
		System.out.println("우리 집 전체의 예금액은 " + sum +"만원 이예요.");
		

	}

}
