package java17;

public class 중학생 extends 학생 {
	int weight;
	public void eat() {
		System.out.println("밥을 먹다.");

	}
	@Override
	public String toString() {
		return "중학생 [weight=" + weight + ", eye=" + eye + "]";
	}
	@Override
	public void 공부하다() {
		System.out.println("영어를 공부하다.");
	}

}
