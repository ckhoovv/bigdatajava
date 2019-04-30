package 부품만들기;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 중화요리 {
	private static JTextField t1;
	private static JTextField t2;
	static int price = 0;
	static int count = 0;

	public static void main(String[] args) {
		String[] menu = {"123.PNG","112.PNG","113.PNG","114.PNG"};
		JFrame f = new JFrame();
		f.setSize(600, 600);
		f.setTitle("주문하세요...");
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		JButton img = new JButton();
		JButton b1 = new JButton("\uC9EC\uBF55");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count+=1;
				t1.setText(String.valueOf(count));
				price += 5500;
				t2.setText(String.valueOf(price));
				ImageIcon icon = new ImageIcon("113.PNG");
				img.setIcon(icon);
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 15));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("\uC6B0\uB3D9");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count+=1;
				t1.setText(String.valueOf(count));
				price+=6000;
				t2.setText(String.valueOf(price));
				ImageIcon icon = new ImageIcon("114.PNG");
				img.setIcon(icon);
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 15));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("\uC9DC\uC7A5\uBA74");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count+=1;
				t1.setText(String.valueOf(count));
				price+=4500;
				t2.setText(String.valueOf(price));
				
				ImageIcon icon = new ImageIcon("112.PNG");
				img.setIcon(icon);
			}
		});
		b3.setFont(new Font("굴림", Font.BOLD, 15));
		f.getContentPane().add(b3);
		
		JLabel label = new JLabel("\uAC1C\uC218");
		f.getContentPane().add(label);
		
		t1 = new JTextField();
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel label1 = new JLabel("\uAE08\uC561");
		f.getContentPane().add(label1);
		
		t2 = new JTextField();
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		f.getContentPane().add(img);
		
		ImageIcon icon = new ImageIcon("123.PNG");
		img.setIcon(icon);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);

	}

}
