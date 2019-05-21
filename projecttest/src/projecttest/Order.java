package projecttest;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Order extends JFrame {
	JTable jt;
	JTextField jtf;
	JScrollPane jsp = null;
	JPanel jp1, jp2, jp3;
	private JTable table;
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql;
	String[] colname = { "번호", "메뉴명", "수량", "가격" };
	String[][] data;
	DefaultTableModel model = new DefaultTableModel(data, colname);
	String number;
	public void conn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			return;
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos", "root", "1234");

		} catch (SQLException ee) {
			ee.printStackTrace();
		}
	}

	public void disconn() {
		// 연결 끊기
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

	Order() {
		setTitle("메뉴 주문창");

		setSize(1000, 800);
		getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 44, 510, 593);
		getContentPane().add(scrollPane);

		table = new JTable(model);
		scrollPane.setViewportView(table);
		JButton[] buttonList = null;
		int rowCount = 0;
		int i = 0, x = 538, y = -37, width = 122, height = 95, cnt = 0;
		Vector row = new Vector();
		try {
			conn();
			pstmt = con.prepareStatement("select * from foodlist");
			rs = pstmt.executeQuery();
			rs.last();
			rowCount = rs.getRow();
			// DB의 데이터 받아 와 row입력
			buttonList = new JButton[rowCount];
			rs.beforeFirst();// 처음상태로 이동되는거
			while (rs.next()) {
				buttonList[i] = new JButton(rs.getString(2));
				buttonList[i].setName(rs.getString(1));
				row.addElement(rs.getString(1));
				row.addElement(rs.getString(2));
				row.addElement(rs.getString(3));
				row.addElement(rs.getString(4));
				
				
				x += width + 10;
				if (cnt % 3 == 0) {
					x = 558;
					y += height + 20;
				}
				buttonList[i].setBounds(x, y, width, height);
				getContentPane().add(buttonList[i]);
				cnt++;
				i++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
			}
		}

		for (int j = 0; j < buttonList.length; j++) {
			buttonList[j].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DefaultTableModel m = (DefaultTableModel) table.getModel();
					m.addRow(row);
				}
			});
		}

		setVisible(true);

	}

	public static void main(String[] args) {
		new Order();

	}
}