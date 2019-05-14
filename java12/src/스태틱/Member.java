package ½ºÅÂÆ½;

public class Member {
	
	String name;
	String gender;
	int age;
	static int sum;
	static int count;
	public Member(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		count++;
		sum+=age;
	}


	@Override
	public String toString() {
		return "Member [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
	

}
