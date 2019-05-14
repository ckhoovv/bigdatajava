package java17;

public class 학생UserMain {

	public static void main(String[] args) {
		초등학생 s = new 초등학생();
		s.height = 150;
		s.eye = 2;
		System.out.println(s);
		s.go();
		s.study();
		중학생 d = new 중학생();
		d.weight = 80;
		d.eye = 1;
		System.out.println(d);
		d.eat();
		d.study();
		고등학생 f = new 고등학생();
		f.speed = 180;
		f.eye = 3;
		System.out.println(f);
		f.play();
		f.study();
		s.공부하다();
		d.공부하다();
		f.공부하다();
		
	}

}
