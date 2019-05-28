package 인터페이스;

public interface MemberInterface {
	//강제성있는 기능을 추상 메소드로 정의
	//일반 변수사용불가, 일반 메소드 사용불가
	//상수 사용가능.(권장사항은 아님)
	//추상 <-> 구체
	//추상: 불완전하다.
	//인터페이스는 객체를 생성하여 쓸 수 없다.
	
	
	public abstract void insert(MemberDTO dto);
	
	void delete(String id);
	
	void update(MemberDTO dto);
	
	MemberDTO select (String id);
	
	
	
	
	

}
