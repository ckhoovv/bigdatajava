package pos;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;

import javax.swing.JPanel;

public class PosLogin extends JFrame {
	private JPasswordField tfpwd;
	private JButton bt_exit = new JButton("\uC885\uB8CC");
	private JButton bt_ok = new JButton("\uB85C\uADF8\uC778");
	private String str="";
	private JLabel lbTitle = new JLabel("LOGIN");
	private PosMain ps;
	private ImageIcon img = null;
	private URL imageURL;
	private final JPanel panel2 = new JPanel();
	private final JTextField tfid = new JTextField();
	private final JButton bt_member = new JButton("\uD68C\uC6D0\uAC00\uC785");

	public PosLogin(){
		super("POS");
		tfid.setBounds(245, 51, 240, 44);
		tfid.setColumns(10);
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("")));
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		login_bt();//�α��� â
		ok_exit_bt();//Ȯ��,����
		num_bt();//���ڹ�ư
		background();//���
	}
	public void login_bt(){
		getContentPane().setFont(new Font("����", Font.PLAIN, 12));
		setTitle("POS \uB85C\uADF8\uC778");
		getContentPane().setLayout(null);
	}
	public void ok_exit_bt(){
		bt_ok.setIcon(null);
		bt_ok.setBounds(223, 227, 103, 66);
		panel2.setBackground(new Color(255, 255, 224));
		panel2.add(bt_ok);
		bt_ok.setFont(new Font("Dialog", Font.BOLD, 17));
		bt_ok.setBackground(new Color(250, 235, 215));

		bt_ok.setForeground(new Color(0, 0, 0));
		bt_ok.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) { //�α��� ��ư
	 String id = tfid.getText();
     String pw = tfpwd.getText();

     MemberDAO1 dao = new MemberDAO1();
     MemberDTO1 dto = dao.getMemberDTO(id);

     if (id.equals(dto.getId()) && pw.equals(dto.getPwd())) {
           JOptionPane.showMessageDialog(null, "�α��� ����");
           try {
			ps = new PosMain(PosLogin.this);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
           dispose();
     } else if (id.equals("") || pw.equals("")) {
        JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��й�ȣ�� �Է����ּ���.");
     } else {
        JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
        tfid.setText("");
        tfpwd.setText("");
     }
  }
});


		bt_exit.setIcon(null);
		bt_exit.setBounds(355, 227, 96, 66);
		panel2.add(bt_exit);
		bt_exit.setFont(new Font("Dialog", Font.BOLD, 17));
		bt_exit.setForeground(new Color(0, 0, 0));
		bt_exit.setBackground(new Color(250, 235, 215));
		bt_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label = new JLabel("���� ���� �Ͻðڽ��ϱ�?");
				label.setFont(new Font("�޸տ�ü", Font.PLAIN, 15));
				int result = JOptionPane.showConfirmDialog(null,label,"����",
								JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(result==JOptionPane.OK_OPTION){
					System.exit(0);
				}
				
			}
		});
}
	public void num_bt(){
	}
	public void focus(){
		bt_exit.setFocusable(false);
		bt_ok.setFocusable(false);
		tfpwd.setFocusable(true);
	}
	public void background(){
		
		
		imageURL = getClass().getClassLoader().getResource("login.gif");
		img = new ImageIcon(imageURL);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 224));
		panel.setLayout(null);
		panel.setBounds(63, 34, 550, 108);
		getContentPane().add(panel);
		lbTitle.setForeground(Color.BLUE);
		lbTitle.setBounds(84, 0, 398, 108);
		panel.add(lbTitle);
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("Papyrus", Font.BOLD, 75));
		
		panel2.setLayout(null);
		panel2.setBounds(60, 172, 553, 303);
		getContentPane().add(panel2);
		JLabel lbid = new JLabel("\uC544\uC774\uB514");
		lbid.setForeground(new Color(0, 0, 0));
		lbid.setBounds(41, 51, 109, 41);
		panel2.add(lbid);
		lbid.setFont(new Font("Dialog", Font.BOLD, 32));
		
				JLabel lbpwd = new JLabel("\uBE44\uBC00\uBC88\uD638");
				lbpwd.setForeground(new Color(0, 0, 0));
				lbpwd.setBounds(41, 156, 156, 41);
				panel2.add(lbpwd);
				lbpwd.setFont(new Font("Dialog", Font.BOLD, 32));
						
								tfpwd = new JPasswordField();
								tfpwd.setForeground(Color.BLACK);
								tfpwd.setBounds(245, 160, 240, 40);
								panel2.add(tfpwd);
								tfpwd.setFont(new Font("SansSerif", Font.PLAIN, 23));
								tfpwd.setBackground(Color.WHITE);
								
								panel2.add(tfid);
								bt_member.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										MemberProc mp = new MemberProc();
									}
								});
								bt_member.setForeground(Color.BLACK);
								bt_member.setFont(new Font("Dialog", Font.BOLD, 17));
								bt_member.setFocusable(false);
								bt_member.setBackground(new Color(250, 235, 215));
								bt_member.setBounds(94, 227, 103, 66);
								setSize(350,500);
								
								panel2.add(bt_member);
		setSize(670,540);
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize(); //ȭ�� ����� �־���		 
		Dimension dimen1 = getSize(); //������ ������ �Է�
		int xpos = (int)(dimen.getWidth())/2-(int)dimen1.getWidth()/2; //ȭ�������/2 - �����ӻ�����/2 (ȭ���߾�)		
		int ypos = (int)(dimen.getHeight())/2 -(int)dimen1.getHeight()/2;		
		this.setUndecorated(true);
		setLocation(xpos, ypos); //ȭ���߾ӿ� ��ġ
		setVisible(true);
		setResizable(false);
		focus();
	}
}
