package java17;

public class BankUser {

	public static void main(String[] args) {
		
		BadBank bad = new BadBank();
		NormalBank normal = new NormalBank();
		GoodBank good = new GoodBank();
		
		bad.getInterestRate();
		normal.getInterestRate();
		good.getInterestRate();

	}

}
