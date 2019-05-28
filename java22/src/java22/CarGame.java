package java22;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	
	public class CarThread extends Thread {
		int x,y;
		ImageIcon icon;
		JLabel label;
		
		public CarThread(String fileName,int x, int y) {
			this.x = x;
			this.y = y;
			icon = new ImageIcon(fileName);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 100, 100);
			add(label);
		}
		@Override
		public void run() {
			//for��.. x�� random���� �÷��� ���!!
			//random�� int�� �߻�.
			//�߻��� int�� x�࿡ ������.
			//setBounds�� �� x�ప���� ��ġ ����
			for (int i = 0; i < 200; i++) {
				x += 10 * Math.random();
				label.setBounds(x, y, 100, 100);
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		}
	}
	public CarGame() {
		setTitle("���� ������ �ڵ��� ���α׷�");
		setSize(600, 300);
		
		CarThread car1 = new CarThread("car1.gif", 100, 0);
		CarThread car2 = new CarThread("car2.gif", 100, 100);
		CarThread car3 = new CarThread("car3.gif", 100, 200);
		
		car1.start();
		car2.start();
		car3.start();
		
		
		
		setVisible(true);
	}


	public static void main(String[] args) {
		CarGame car = new CarGame();

	}

}
