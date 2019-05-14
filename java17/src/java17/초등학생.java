package java17;

public class 초등학생 extends 학생{
	int height;
	public void go() {
		System.out.println("초등학교에 가다.");
		
	}
	@Override
	public String toString() {
		return "초등학생 [height=" + height + ", eye=" + eye + "]";
	}
	@Override
	public void 공부하다() {
		System.out.println("줄넘기 연습하다.");
	}

}
