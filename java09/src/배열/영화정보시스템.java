package 배열;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화정보시스템 {

	public static void main(String[] args) {
		String[] movies = {"m1.PNG","m2.PNG","m3.PNG","m4.PNG","m5.PNG"};
		JFrame f = new JFrame();
		f.setTitle("나의 영화 정보 시스템");
		f.setSize(300, 400);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		JButton img = new JButton();
		f.getContentPane().add(img);
		
		ImageIcon icon = new ImageIcon("m1.PNG");
		img.setIcon(icon);
		
		JButton b1 = new JButton("<<<<<\uC0DD\uC77C>>>>>");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m1.PNG");
				img.setIcon(icon);
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 17));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("<<<<<\uD5EC\uBCF4\uC774>>>>>");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m2.PNG");
				img.setIcon(icon);
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 17));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("<<<<<\uB3C8>>>>>");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m3.PNG");
				img.setIcon(icon);
			}
		});
		b3.setFont(new Font("굴림", Font.BOLD, 17));
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("<<<<<\uD30C\uC774\uBE0C\uD53C\uD2B8>>>>>");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m4.PNG");
				img.setIcon(icon);
			}
		});
		b4.setFont(new Font("굴림", Font.BOLD, 17));
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("<<<<<\uC5B4\uC2A4>>>>>");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m5.PNG");
				img.setIcon(icon);
			}
		});
		b5.setFont(new Font("굴림", Font.BOLD, 17));
		f.getContentPane().add(b5);
		
		
		
		
		
		
		
		f.setVisible(true);
		
		
		
		

	}

}
