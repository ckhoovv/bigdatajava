package ����ƽ;

public class Day {
	
	String doing;
	int time;
	String location;
	
	static int count;
	static int sum;
	
	static int total;//�ѽð� 
	
	public Day() {
		
	}


	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum+=time;
		total = total + time;
	}
	
	public static int getTotal() {
		return total; 
		//����ƽ�޼ҵ峻�� ���Ǵ� ��������� �ݵ�� ����ƽ������ ����
		//��ü������ ������� Ŭ�����̸����� ���ٰ�����
	}


	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
	
	
	

}
