package projecttest;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Order extends JFrame{
	JButton[] jb = new JButton[16];
	JTable jt;
	JTextField jtf;
	JScrollPane jsp = null;
	JPanel jp1, jp2, jp3;
	JButton[] jb1 = new JButton[4];
	Order1 or = new Order1();
	
	
	
	
	Order(){
		setTitle("메뉴 주문창");
		
		setSize(1000, 800);
		
		
		setVisible(true);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Order();
	}

}
