package java17;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
	public MyWindow() {
		setTitle("���� ������ ������");
		setSize(500, 500);
		MyPanel p = new MyPanel();
		add(p);
		setVisible(true);
	}
	public static void maid(String arg[]) {
		MyWindow name = new MyWindow();
		
	}

}
