package ��ǰ�����;

public class Phone {

//		��ȭ�� => class
//		-Ư¡�� ã�Ƽ� ��ǰ�� ������ ��.
//
//		-Ư¡(attribute, property), Ư��, �Ӽ�
//		=> ����Ư��: ���, ũ��, ȸ�� >>> �������
		String shape;
		int size;
		String company;
		
//		=> ����Ư��: ��ȭ�ϴ�, ���ں�����, �˶��� ���ߴ�>>> ����޼ҵ�
		public String call() {
			return "ģ��";
		}
		public void text() {
			System.out.println("�����ϴ�.");
		}
		public int alarm() {
			return 6;
		}
		@Override
		public String toString() {
			return "Phone [shape=" + shape + ", size=" + size + ", company=" + company + "]";
		}
		
		


}
