package 스태틱;

public class MoneyTest {

	public static void main(String[] args) {
		
		Money mem1 = new Money("김아무개1", 15);
		Money mem2 = new Money("김아무개2", 5);
		
		System.out.println("첫째 딸의 이름은:" + mem1.name + "이고, " + "둘째 딸의 이름은: " + mem2.name + "입니다.");
		System.out.println("두딸은 " );  mem1.play(); mem1.tv();
		
		System.out.println("아빠의 지갑에는 " + Money.money + "원이 남아있어요.");

	}

}
