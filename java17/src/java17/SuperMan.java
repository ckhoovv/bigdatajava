package java17;

public class SuperMan extends Man{
	//沥利加己
	boolean fly;
	//悼利加己
	public void flySpeed() {
		sleep();
		System.out.println("500栏肺 朝促.");
	}
	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", eye=" + eye + ", height=" + height + ", weight=" + weight + "]";
	}
	

}
