package 스태틱;

public class 창업직원 {

	public static void main(String[] args) {
		Member mem1 = new Member("임아무개", "남", 24);
		Member mem2 = new Member("김아무개", "여", 23);
		Member mem3 = new Member("박아무개", "남", 25);
		
		
		
		System.out.println("전체 직원의 수는: " + Member.count + "명 입니다.");
		System.out.println("직원들의 평균 나이는: " + Member.sum/Member.count + "세 입니다.");
		System.out.println("첫번째 직원의 이름은: " + mem1.name + " 입니다.");

	}

}
