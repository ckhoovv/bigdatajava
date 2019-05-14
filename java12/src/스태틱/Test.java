package 스태틱;

public class Test {

	public static void main(String[] args) {
		
		Clock c1 = new Clock(7000, "최", 13, "fff");
		Clock c2 = new Clock(8000, 16, "def");
		Clock c3 = new Clock(9000, "abc");
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		Person m1 = new Person(170, 80, "aaa", "구로구");
		
		System.out.println(m1);
		System.out.println(m1.proper);
		

	}

}
