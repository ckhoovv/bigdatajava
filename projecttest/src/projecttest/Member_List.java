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
        super("회원관리 프로그램");
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
    }//end 생성자
   
   
    //JTable의 컬럼
    public Vector getColumn(){
        Vector col = new Vector();
        col.add("아이디");
        col.add("비밀번호");
        col.add("이름");
        col.add("전화");
        col.add("주소");
        col.add("생일");
        col.add("직업");
        col.add("성별");
        col.add("이메일");
        col.add("자기소개");
       
        return col;
    }//getColumn
   
   
    //Jtable 내용 갱신 메서드
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
        // mouseClicked 만 사용
        int r = jTable.getSelectedRow();
        String id = (String) jTable.getValueAt(r, 0);
        //System.out.println("id="+id);
        MemberProc mem = new MemberProc(id,this); //아이디를 인자로 수정창 생성
               
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