package �ϱ���;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class ���ϴٷ��2 {

	public static void main(String[] args) throws Exception{
		
		//���Ͽ� ����
		//��ü ����
		String name = JOptionPane.showInputDialog("�̸��� �Է�");
		String tel = JOptionPane.showInputDialog("��ȭ��ȣ�� �Է�");
		String addr = JOptionPane.showInputDialog("�ּ��� �Է�");
		FileWriter w = new FileWriter(name + ".txt");
		
		//�޼ҵ� ���(ȣ��)
		w.write(name + "\n");
		w.write(tel + "\n");
		w.write(addr + "\n");
		
		
		w.close();

	}

}
