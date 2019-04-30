package ¿œ±‚¿Â;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;



public class ¥Ÿ¿ÃæÓ∏Æ {
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	
	public ¥Ÿ¿ÃæÓ∏Æ() {
		JFrame f = new JFrame("≥™¿« ¿œ±‚¿Â ¿€º∫ »≠∏È");
		f.getContentPane().setFont(new Font("±º∏≤", Font.BOLD, 27));
		f.setSize(600, 700);
		
		JLabel lblNewLabel = new JLabel("<<<<<\uC77C\uAE30\uC791\uC131\uB0A0\uC9DC>>>>>");
		lblNewLabel.setFont(new Font("±º∏≤", Font.BOLD, 16));
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("±º∏≤", Font.BOLD, 16));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		f.getContentPane().add(separator);
		
		JLabel label = new JLabel("<<<<<\uC77C\uAE30\uC791\uC131\uC81C\uBAA9>>>>>");
		label.setFont(new Font("±º∏≤", Font.BOLD, 16));
		f.getContentPane().add(label);
		
		t2 = new JTextField();
		t2.setFont(new Font("±º∏≤", Font.BOLD, 16));
		t2.setColumns(10);
		f.getContentPane().add(t2);
		
		JSeparator separator_1 = new JSeparator();
		f.getContentPane().add(separator_1);
		
		JLabel label_1 = new JLabel("<<<<<\uC77C\uAE30\uC791\uC131\uB0B4\uC6A9>>>>>");
		label_1.setFont(new Font("±º∏≤", Font.BOLD, 16));
		f.getContentPane().add(label_1);
		
		
		JTextArea t3 = new JTextArea();
		t3.setFont(new Font("±º∏≤√º", Font.BOLD, 18));
		t3.setColumns(40);
		t3.setRows(20);
		f.getContentPane().add(t3);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JButton btnNewButton = new JButton("\uD30C\uC77C\uC5D0 \uC800\uC7A5\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String date = t1.getText();
	                String title = t2.getText();
	                String content = t3.getText();
	                System.out.println(date);
	                System.out.println(title);
	                System.out.println(content);
	                
	                FileWriter file;
	                try {
	                    file = new FileWriter(date+".txt");
	                    file.write(date+"\n");
	                    file.write(title+"\n");
	                    file.write(content+"\n");
	                    file.close();
	                } catch (IOException e1) {
	                    e1.printStackTrace();
	                }
			}
		});
		btnNewButton.setFont(new Font("±º∏≤", Font.PLAIN, 25));
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\uD30C\uC77C\uC5D0\uC11C \uBD88\uB7EC\uC624\uAE30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setFont(new Font("±º∏≤", Font.PLAIN, 25));
		f.getContentPane().add(button);
		
		
		
		
		
		
		
		f.setVisible(true);
		
	}



}
