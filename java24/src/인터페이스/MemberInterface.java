package �������̽�;

public interface MemberInterface {
	//�������ִ� ����� �߻� �޼ҵ�� ����
	//�Ϲ� �������Ұ�, �Ϲ� �޼ҵ� ���Ұ�
	//��� ��밡��.(��������� �ƴ�)
	//�߻� <-> ��ü
	//�߻�: �ҿ����ϴ�.
	//�������̽��� ��ü�� �����Ͽ� �� �� ����.
	
	
	public abstract void insert(MemberDTO dto);
	
	void delete(String id);
	
	void update(MemberDTO dto);
	
	MemberDTO select (String id);
	
	
	
	
	

}
