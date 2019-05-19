package projecttest;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Order extends JFrame {
	JTextField jtf1;
	JPanel jp1,jp2,jp3;
	JTable jt;
	JScrollPane jsp = null;
	JButton [] jb = new JButton[20];
	JTable table;
	Order1 or = new Order1();
	

	Order() {
		
		setTitle("메뉴 주문창");
		setSize(1100, 700);
		getContentPane().setLayout(null);
		
		jt = new JTable();
		jt.setBounds(12, 48, 465, 422);
		getContentPane().add(jt);
		
		JTextArea t = new JTextArea();
		t.setBounds(12, 515, 465, 72);
		getContentPane().add(t);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(489, 48, 138, 72);
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(639, 48, 138, 72);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(789, 48, 138, 72);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(939, 48, 138, 72);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(489, 156, 138, 72);
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.setBounds(639, 156, 138, 72);
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.setBounds(789, 156, 138, 72);
		getContentPane().add(button_5);
		
		JButton button_6 = new JButton("New button");
		button_6.setBounds(939, 156, 138, 72);
		getContentPane().add(button_6);
		
		JButton button_7 = new JButton("New button");
		button_7.setBounds(489, 262, 138, 72);
		getContentPane().add(button_7);
		
		JButton button_8 = new JButton("New button");
		button_8.setBounds(639, 262, 138, 72);
		getContentPane().add(button_8);
		
		JButton button_9 = new JButton("New button");
		button_9.setBounds(789, 262, 138, 72);
		getContentPane().add(button_9);
		
		JButton button_10 = new JButton("New button");
		button_10.setBounds(939, 262, 138, 72);
		getContentPane().add(button_10);
		
		JButton button_11 = new JButton("New button");
		button_11.setBounds(489, 368, 138, 72);
		getContentPane().add(button_11);
		
		JButton button_12 = new JButton("New button");
		button_12.setBounds(639, 368, 138, 72);
		getContentPane().add(button_12);
		
		JButton button_13 = new JButton("New button");
		button_13.setBounds(789, 368, 138, 72);
		getContentPane().add(button_13);
		
		JButton button_14 = new JButton("New button");
		button_14.setBounds(939, 368, 138, 72);
		getContentPane().add(button_14);
		
		JButton button_15 = new JButton("New button");
		button_15.setBounds(489, 515, 138, 72);
		getContentPane().add(button_15);
		
		JButton button_16 = new JButton("New button");
		button_16.setBounds(639, 515, 138, 72);
		getContentPane().add(button_16);
		
		JButton button_17 = new JButton("New button");
		button_17.setBounds(789, 515, 138, 72);
		getContentPane().add(button_17);
		
		JButton button_18 = new JButton("New button");
		button_18.setBounds(939, 515, 138, 72);
		getContentPane().add(button_18);
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		
		
		jt = or.getJTable();

		add(new JScrollPane(jt), "Center");
		
		setVisible(true);
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		new Order();	
		}
}
