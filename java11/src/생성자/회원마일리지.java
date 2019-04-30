package 생성자;

public class 회원마일리지 {

	public static void main(String[] args) {
		
		Member2 m1 = new Member2("admin", "1234", "관리자", 1000);
		Member2 m2 = new Member2("manager", "pass", "준관리자", 1500);
		Member2 m3 = new Member2("sitemanager", "sitepass", "준관리자", 1800);
		
		int average = 0;
		int sum = 0;
		sum = m1.point + m2.point + m3.point;
		average = sum/ 3;
		System.out.println(m1.ID + "의 비밀번호는 " + m1.PW + "입니다.");
		System.out.println(m2.ID + "는 " + m2.grade + "이고, 마일리지는 " + m2.point + "입니다.");
		System.out.println("총 마일리지는 " + sum + "입니다.");
		System.out.println("평균 마일리지는" + average + "입니다.");

	}

}
