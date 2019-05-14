package java17;

public class NormalBank extends Bank{
	double rate1 = rate * 5;
	public void getInterestRate() {
		System.out.println("NormalBank의 이자율: " + rate1 + "입니다.");
		
	}

}
