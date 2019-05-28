package java22;

import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class CountDownTest extends JFrame {

	JLabel label1, label2;
	
	public CountDownTest() {
		setTitle("카운트 다운");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		label1 =new JLabel("Start");
		label1.setForeground(Color.BLUE);
		label1.setFont(new Font("굴림", Font.PLAIN, 70));
		label2 = new JLabel();
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(label1);
		getContentPane().add(label2);
		
		(new Thread1()).start();
		(new Thread2()).start();
		
		
		
		
		setVisible(true);
	}
	
	class Thread1 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
				label1.setText(i + "");
			}
			
		}
		
	}
	class Thread2 extends Thread{
		@Override
		public void run() {
			String[] img = {
					"1.jpeg","2.jpeg","3.jpeg",
					"1.jpeg","2.jpeg","3.jpeg",
					"1.jpeg","3.jpeg","3.jpeg",
					"1.jpeg","1.jpeg","2.jpeg",
					"1.jpeg","2.jpeg","3.jpeg",
					"1.jpeg","3.jpeg","3.jpeg",
					"1.jpeg","3.jpeg","3.jpeg",
					"3.jpeg","2.jpeg","3.jpeg",
					"1.jpeg","3.jpeg","3.jpeg",
					"1.jpeg","1.jpeg","3.jpeg",
					"1.jpeg","2.jpeg","2.jpeg",
					"3.jpeg","1.jpeg","3.jpeg",
					"2.jpeg","3.jpeg","1.jpeg",
					"1.jpeg","3.jpeg","2.jpeg",
					"2.jpeg","1.jpeg","3.jpeg",
					"3.jpeg","2.jpeg","1.jpeg"
			};
			for (int i = 0; i < img.length; i++) {
				
				try {
					Thread.sleep(1000);
					
					ImageIcon icon = new ImageIcon(img[i]);
					label2.setIcon(icon);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
			
			
		}
	}
	
	public static void main(String[] args) {
		
		CountDownTest t = new CountDownTest();
		
	}
	
	
	
	
	
	
	
	
	
}
