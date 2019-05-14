package ½ºÅÂÆ½;

public class Clock {
	int price;
	String name;
	int nowtime;
	String company;
	
	public Clock() {
	}


	public Clock(int price, String name, int nowtime, String company) {
		this.price = price;
		this.name = name;
		this.nowtime = nowtime;
		this.company = company;
	}
	


	public Clock(int price, int nowtime, String company) {
		super();
		this.price = price;
		this.nowtime = nowtime;
		this.company = company;
	}


	public Clock(int price, String company) {
		this.price = price;
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}
	
	public int getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "Clock [price=" + price + ", name=" + name + ", nowtime=" + nowtime + ", company=" + company + "]";
	}
	
	
	

}
