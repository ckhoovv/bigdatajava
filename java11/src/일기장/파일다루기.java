package �ϱ���;

import java.io.FileWriter;
import java.io.IOException;
public class ���ϴٷ�� {

	public static void main(String[] args) throws IOException {
		
		//���Ͽ� ����
		//��ü ����
		FileWriter w = new FileWriter("start.txt");
		
		//�޼ҵ� ���(ȣ��)
		w.write("�ȳ��ϼ���\n");
		w.write("�ݰ����ϴ�\n");
		
		
		w.close();

	}

}
