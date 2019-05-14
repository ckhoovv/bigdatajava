package java17;

public class GoodBank extends Bank{
	
	double rate1 = rate * 3;
	public void getInterestRate() {
		System.out.println("GoodBank의 이자율: " + rate1 + "입니다.");
		
	}

}
