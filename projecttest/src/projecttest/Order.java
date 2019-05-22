package projecttest;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;
import java.util.Vector;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Order extends JFrame{
	JButton[] jb = new JButton[16];
	JTable jt;
	JTextField jtf;
	JScrollPane jsp = null;
	JPanel jp1, jp2, jp3;
	JButton[] jb1 = new JButton[4];
	Order1 or = new Order1();
	private JTable table;
	Connection con = null;
	 PreparedStatement pstmt = null;
	 ResultSet rs = null;
	 ResultSet rs1 = null;
	 String sql;
	 String[] colname = { "��ȣ", "�޴���", "����", "����" };
		String[][] data;
		DefaultTableModel model = new DefaultTableModel(data, colname);
		private JTextField t1;
	 public void conn() {
		  try {
		   Class.forName("com.mysql.jdbc.Driver");
		  } catch (ClassNotFoundException cnfe) {
		   cnfe.printStackTrace();
		   return;
		  }
		  try {
		   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos","root", "1234");
		   
		  } catch (SQLException ee) {
		   ee.printStackTrace();
		  }
		 }
		 public void disconn() {
		  // ���� ����
		  try {
		   if (rs != null)
		    rs.close();
		   if (pstmt != null)
		    pstmt.close();
		   if (con != null)
		    con.close();
		  } catch (SQLException ee) {
		   ee.printStackTrace();
		  }
		 }
	Order(){
		setTitle("�޴� �ֹ�â");
		
		setSize(1000, 800);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 44, 510, 575);
		getContentPane().add(scrollPane);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("����", Font.BOLD, 30));
		t1.setBounds(14, 654, 510, 62);
		getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton b1 = new JButton("����");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btnNewButton = (JButton)e.getSource();
				table.setValueAt(0, table.getSelectedRow(), 3);
			}
		});
		b1.setBounds(536, 632, 103, 84);
		getContentPane().add(b1);
		
		JButton b2 = new JButton("���");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.removeRow(table.getSelectedRow());
			}
		});
		b2.setBounds(645, 632, 103, 84);
		getContentPane().add(b2);
		
		JButton b3 = new JButton("����");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getRowCount();
				
				int sum = 0;
				for(int i=0;i<row;i++) {
					sum += Integer.parseInt((String) table.getValueAt(i, 3));
				}
				t1.setText(String.valueOf(" �� �ݾ� : "+sum+"��"));
				
				
				int result = JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
	            if(result == JOptionPane.YES_OPTION) {
	            	JOptionPane.showMessageDialog(null, "��������");
	            	dispose();
	            }else if(result == JOptionPane.NO_OPTION) {
	            	JOptionPane.showMessageDialog(null, "�������");
	            	
	            }
			}
		});
		b3.setBounds(754, 632, 103, 84);
		getContentPane().add(b3);
		
		JButton b4 = new JButton("�ֹ�");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		b4.setBounds(863, 632, 103, 84);
		getContentPane().add(b4);
		JButton[] buttonList = null;
		int rowCount = 0;
		int i = 0, x=538,y=-27,width=135,height=61, cnt=0;
		try {
			   conn();
			   sql = "select * from foodlist";
			   pstmt = con.prepareStatement(sql);
			   rs = pstmt.executeQuery();
			   rs.last();
			   rowCount = rs.getRow();
			   //DB�� ������ �޾� �� row�Է�
			   buttonList = new JButton[rowCount];
			   
			   rs = pstmt.executeQuery();//ó�����·� �̵��Ǵ°� 
				while (rs.next()) {
					buttonList[i] = new JButton(rs.getString(2));
					buttonList[i].setName(rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getInt(4));
					x += width+10;
					if(cnt%3 ==0) {
						x = 538;
						y += height + 10;
					}
					buttonList[i].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
//							System.out.println(((JButton)e.getSource()).getName());
							String[] temp = ((JButton)e.getSource()).getName().split("\\|");//���ø��� ���ڸ� �����°� 
							model.addRow(new Object[] {temp[0],temp[1],temp[2],temp[3]});
						}
					});
					
					
					buttonList[i].setBounds(x, y, width, height);
					getContentPane().add(buttonList[i]);
					cnt++;
					i++;
					
				}
			   
			  } catch (SQLException e) {
			   e.printStackTrace();
			  }
			  finally{
			   disconn();
			  }
		
		
		
		setVisible(true);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Order();
	}
}