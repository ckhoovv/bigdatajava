package projecttest;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
 
 
public class Member_List extends JFrame implements MouseListener,ActionListener{
   
    Vector v;  
    Vector cols;
    DefaultTableModel model;
    JTable jTable;
    JScrollPane pane;
    JPanel pbtn;
       
   
    public Member_List(){
        super("ȸ������ ���α׷�");
        MemberDAO1 dao = new MemberDAO1();
        v = dao.getMemberList();
        System.out.println("v="+v);
        cols = getColumn();
        model = new DefaultTableModel(v, cols);
       
        jTable = new JTable(model);
        pane = new JScrollPane(jTable);
        getContentPane().add(pane);
       
        pbtn = new JPanel();
        getContentPane().add(pbtn,BorderLayout.NORTH);
       
       
        jTable.addMouseListener(this);
       
        setSize(600,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//end ������
   
   
    //JTable�� �÷�
    public Vector getColumn(){
        Vector col = new Vector();
        col.add("���̵�");
        col.add("��й�ȣ");
        col.add("�̸�");
        col.add("��ȭ");
        col.add("�ּ�");
        col.add("����");
        col.add("����");
        col.add("����");
        col.add("�̸���");
        col.add("�ڱ�Ұ�");
       
        return col;
    }//getColumn
   
   
    //Jtable ���� ���� �޼���
    public void jTableRefresh(){
       
        MemberDAO1 dao = new MemberDAO1();
        DefaultTableModel model= new DefaultTableModel(dao.getMemberList(), getColumn());
        jTable.setModel(model);    
       
    }
   
    public static void main(String[] args) {
        new Member_List();
    }//main
    @Override
    public void mouseClicked(MouseEvent e) {
        // mouseClicked �� ���
        int r = jTable.getSelectedRow();
        String id = (String) jTable.getValueAt(r, 0);
        //System.out.println("id="+id);
        MemberProc mem = new MemberProc(id,this); //���̵� ���ڷ� ����â ����
               
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
   
}