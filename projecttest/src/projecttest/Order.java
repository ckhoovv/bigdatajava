package projecttest;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	JLabel jl;
	
	
	Order(){
		setTitle("¸Þ´º ÁÖ¹®Ã¢");
		
		jtf = new JTextField(20);
		jtf.setFont(new Font("±¼¸²", Font.PLAIN, 33));
		jp1 = new JPanel();
		getContentPane().add(jp1,"East");
		jp1.setSize(300, 500);
		getContentPane().add(new JScrollPane(or.getJTable()), "Center");
		
		
		jl = new JLabel("ÃÑ±Ý¾×");
		jl.setFont(new Font("±¼¸²", Font.PLAIN, 33));
		jp2 = new JPanel();
		getContentPane().add(jp2,"South");
		jp2.add(jl);
		jp2.add(jtf);
		
		
		
		
		
		
		setSize(1000, 800);
		
		
		setVisible(true);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Order();
	}

}
