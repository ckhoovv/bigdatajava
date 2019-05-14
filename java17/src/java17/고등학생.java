package java17;

public class 고등학생 extends 학생{
	int speed;
	public void play() {
		System.out.println("놀다.");
		
	}
	@Override
	public String toString() {
		return "고등학생 [speed=" + speed + ", eye=" + eye + "]";
	}
	@Override
	public void 공부하다() {
		System.out.println("입시공부하다.");
	}

}
