package projecttest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Order1 {
	Connection con = null;
	 PreparedStatement pstmt = null;
	 ResultSet rs = null;
	 String sql, number, menu, amount, price;
	 static Vector col = new Vector();
	 static Vector data = new Vector();
	 JTable j;
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
	 public void defJTable() {
		  try {
		   conn();
		   pstmt = con.prepareStatement("select * from foodlist");
		   rs = pstmt.executeQuery();
		   //DB�� ������ �޾� �� row�Է�
		  while(rs.next()) {
		    Vector row = new Vector();
		    row.addElement(rs.getString(1));
		    row.addElement(rs.getString(2));
		    row.addElement(rs.getString(3));
		    row.addElement(rs.getString(4));
		    data.addElement(row);
		  }
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }
		  finally{
		   disconn();
		  }
		 }
		 //renew
		 public void redefJTable() {
		  data.clear();
		  try {
		   conn();
		   pstmt = con.prepareStatement("select * from foodlist");
		   rs = pstmt.executeQuery();
		   while (rs.next()) {
		    Vector row = new Vector();
		    row.addElement(rs.getString(1));
		    row.addElement(rs.getString(2));
		    row.addElement(rs.getString(3));
		    row.addElement(rs.getString(4));
		    data.addElement(row);
		   }
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }
		  finally{
		   disconn();
		  }
		 }
		 //JTable�� ����.
		 public JTable getJTable(){
		  defJTable();
		  col.addElement("��ȣ");
		  col.addElement("�޴���");
		  col.addElement("����");
		  col.addElement("�ݾ�");
		  DefaultTableModel model = new DefaultTableModel(data, col){
		   public boolean isCellEditable(int row,int column){
		    return false;
		   }
		  };
		  j = new JTable(model);
		  return j;
		 }

}
