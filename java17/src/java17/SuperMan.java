package java17;

public class SuperMan extends Man{
	//�����Ӽ�
	boolean fly;
	//�����Ӽ�
	public void flySpeed() {
		sleep();
		System.out.println("500���� ����.");
	}
	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", eye=" + eye + ", height=" + height + ", weight=" + weight + "]";
	}
	

}
