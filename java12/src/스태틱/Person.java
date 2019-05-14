package ½ºÅÂÆ½;

public class Person {
	int height;
	int weight;
	String secret;
	String address;
	int proper;
	
	public Person() {
		
	}
	public Person(int height, int weight, String secret, String address) {
		this.height = height;
		this.weight = weight;
		this.secret = secret;
		this.address = address;
		this.proper = (int)((height-100)*0.9);
	}
	
	public Person(int height, int weight, String secret) {
		this.height = height;
		this.weight = weight;
		this.secret = secret;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getSecret() {
		return secret;
	}
	@Override
	public String toString() {
		return "Person [height=" + height + ", weight=" + weight + ", secret=" + secret + ", address=" + address + "]";
	}
	
    	

}