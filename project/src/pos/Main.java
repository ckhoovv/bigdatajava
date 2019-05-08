package pos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("À½½ÄÁ¡ POS½Ã½ºÅÛ");
		f.setSize(900, 800);
		f.getContentPane().setLayout(null);
		
		JPanel p = new JPanel();
		p.setBounds(0, 0, 884, 761);
		f.getContentPane().add(p);
		p.setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBounds(0, 0, 884, 761);
		f.getContentPane().add(p1);
		p1.setLayout(null);
		
		JButton btnNewButton = new JButton("\uC885\uB8CC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(f, "Á¤¸» Á¾·áÇÏ½Ã°Ú½À´Ï±î?", "Á¾·á", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
	            if(result == JOptionPane.NO_OPTION) {
	               
	            }else if(result == JOptionPane.YES_OPTION){
	               System.exit(0);
	            }
			}
		});
		btnNewButton.setBounds(12, 10, 116, 61);
		p.add(btnNewButton);
		
		JButton button = new JButton("\uB85C\uADF8\uC778");
		button.setBounds(756, 10, 116, 61);
		p.add(button);
		
		JButton button_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		button_1.setBounds(608, 10, 116, 61);
		p.add(button_1);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setVisible(false);
				p1.setVisible(true);
			}
		});
		b1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		b1.setVerticalAlignment(SwingConstants.TOP);
		b1.setBounds(12, 140, 191, 148);
		p.add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setVisible(false);
				p1.setVisible(true);
			}
		});
		b2.setFont(new Font("±¼¸²", Font.BOLD, 15));
		b2.setVerticalAlignment(SwingConstants.TOP);
		b2.setBounds(237, 140, 191, 148);
		p.add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setVisible(false);
				p1.setVisible(true);
			}
		});
		b3.setFont(new Font("±¼¸²", Font.BOLD, 15));
		b3.setVerticalAlignment(SwingConstants.TOP);
		b3.setBounds(459, 140, 191, 148);
		p.add(b3);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setVisible(false);
				p1.setVisible(true);
			}
		});
		b4.setFont(new Font("±¼¸²", Font.BOLD, 15));
		b4.setVerticalAlignment(SwingConstants.TOP);
		b4.setBounds(681, 140, 191, 148);
		p.add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setVisible(false);
				p1.setVisible(true);
			}
		});
		b5.setFont(new Font("±¼¸²", Font.BOLD, 15));
		b5.setVerticalAlignment(SwingConstants.TOP);
		b5.setBounds(12, 298, 191, 148);
		p.add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setVisible(false);
				p1.setVisible(true);
			}
		});
		b6.setFont(new Font("±¼¸²", Font.BOLD, 15));
		b6.setVerticalAlignment(SwingConstants.TOP);
		b6.setBounds(237, 298, 191, 148);
		p.add(b6);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setVisible(false);
				p1.setVisible(true);
			}
		});
		b7.setFont(new Font("±¼¸²", Font.BOLD, 15));
		b7.setVerticalAlignment(SwingConstants.TOP);
		b7.setBounds(459, 298, 191, 148);
		p.add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setVisible(false);
				p1.setVisible(true);
			}
		});
		b8.setFont(new Font("±¼¸²", Font.BOLD, 15));
		b8.setVerticalAlignment(SwingConstants.TOP);
		b8.setBounds(681, 298, 191, 148);
		p.add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setVisible(false);
				p1.setVisible(true);
			}
		});
		b9.setFont(new Font("±¼¸²", Font.BOLD, 15));
		b9.setVerticalAlignment(SwingConstants.TOP);
		b9.setBounds(12, 456, 191, 148);
		p.add(b9);
		
		JButton b10 = new JButton("10");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setVisible(false);
				p1.setVisible(true);
			}
		});
		b10.setFont(new Font("±¼¸²", Font.BOLD, 15));
		b10.setVerticalAlignment(SwingConstants.TOP);
		b10.setBounds(237, 456, 191, 148);
		p.add(b10);
		
		JButton b11 = new JButton("11");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setVisible(false);
				p1.setVisible(true);
			}
		});
		b11.setFont(new Font("±¼¸²", Font.BOLD, 15));
		b11.setVerticalAlignment(SwingConstants.TOP);
		b11.setBounds(459, 456, 191, 148);
		p.add(b11);
		
		JButton b12 = new JButton("12");
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setVisible(false);
				p1.setVisible(true);
			}
		});
		b12.setFont(new Font("±¼¸²", Font.BOLD, 15));
		b12.setVerticalAlignment(SwingConstants.TOP);
		b12.setBounds(681, 456, 191, 148);
		p.add(b12);
		
		JButton button_13 = new JButton("\uBA54\uB274\uAD00\uB9AC");
		button_13.setBounds(87, 664, 116, 61);
		p.add(button_13);
		
		JButton button_14 = new JButton("\uC790\uB9AC\uC774\uB3D9");
		button_14.setBounds(237, 664, 116, 61);
		p.add(button_14);
		
		JButton button_15 = new JButton("\uB9E4\uCD9C\uD604\uD669");
		button_15.setBounds(390, 664, 116, 61);
		p.add(button_15);
		
		JButton button_16 = new JButton("\uBC1C\uC8FC\uC2DC\uC2A4\uD15C");
		button_16.setBounds(534, 664, 116, 61);
		p.add(button_16);
		
		JButton button_17 = new JButton("\uADFC\uD1F4\uD604\uD669");
		button_17.setBounds(681, 664, 116, 61);
		p.add(button_17);
		
		
		JButton bb1 = new JButton("\uC8FC\uBB38");
		bb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.setVisible(false);
				p.setVisible(true);
			}
		});
		bb1.setBounds(764, 610, 108, 141);
		p1.add(bb1);
		
		
		
		
		
		
		
		
		
		
		p1.setVisible(false);
		f.setVisible(true);
		

	}
}
