package ��ǰ�����;

public class ���� {

	
	
	//�Ķ���� ������
	public ����() {
	}
	// �ڹٴ� �޼ҵ� �̸��� �����ϰ� �� �� �ִ�.
	// �ϳ��� �̸����� �پ��� ������ ����� �����ϰ� �ϴ� ���.
	// ������(overloading, �����ε�)

	// add(200,100)
	public int add(int x, int y) {
		return x + y;
	}

	// add(200, 11.11)
	public void add(int x, double y) {
		System.out.println(x + y);
	}
	
	//add("ȫ�浿", 1000): Okay
	//add(1000, "ȫ�浿"): NO �����ٲٸ� �ȵȴ�!
	//add("ȫ�浿"): NO ������ �ٸ���.
	//�Է°��� ����, Ÿ��, ������ �߿�!!
	//�Է°��� ���Ǵ� ������ �Ű�����(�Ķ����, parameter)
	public void add(String x, int y) {
		System.out.println(x + y);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
