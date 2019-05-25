package pos;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class MaeChul extends JFrame {

	private int cnt[] = new int[9];
	private JLabel Timage;
	private ImageIcon img = null;
	private URL imageURL;
	
	public void setCnt(int[] cnt) {
		for(int i=0;i<9;i++){
			this.cnt[i]+=cnt[i];
		}
	}
	public MaeChul(PosMain posMain) {
		setBackground(new Color(255, 192, 203));
		this.setUndecorated(true);
		//setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("chickenicon.png")));

		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("\uC77C\uC77C \uB9E4\uCD9C");
		JPanel panel1 = new JPanel();
		panel1.setBackground(SystemColor.inactiveCaption);
		panel1.setLayout(null);
		panel1.setBounds(24, 17, 844, 394);
		getContentPane().add(panel1);
		Container contentPane = getContentPane();
		graphicPanel drawingPanel = new graphicPanel();
		drawingPanel.setSize(880, 900);
		contentPane.setLayout(null);
		panel1.add(drawingPanel);
		
		imageURL = getClass().getClassLoader().getResource("kk.gif");
		img = new ImageIcon(imageURL);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setLayout(null);
		panel.setBounds(18, 423, 850, 159);
		getContentPane().add(panel);
		Timage= new JLabel();
		Timage.setBounds(257, 6, 234, 135);
		panel.add(Timage);
		JButton bt_re = new JButton("\u2190");
		bt_re.setFont(new Font("�޸տ�ü", Font.PLAIN, 26));
		bt_re.setBounds(768, 103, 70, 46);
		panel.add(bt_re);
		bt_re.setBackground(new Color(250, 235, 215));
		bt_re.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				posMain.setVisible(true);
			}
		});
		bt_re.setFocusable(false);
		
		JLabel lblNewLabel = new JLabel(" \uB9E4\uCD9C \uC21C\uC704");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("�޸�����ü", Font.BOLD, 60));
		lblNewLabel.setBounds(271, 23, 326, 118);
		panel.add(lblNewLabel);
		setSize(900,600);
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize(); //ȭ�� ����� �־���		 
		Dimension dimen1 = getSize(); //������ ������ �Է�
		int xpos = (int)(dimen.getWidth())/2-(int)dimen1.getWidth()/2; //ȭ�������/2 - �����ӻ�����/2 (ȭ���߾�)		
		int ypos = (int)(dimen.getHeight())/2 -(int)dimen1.getHeight()/2;		
		setLocation(xpos, ypos); //ȭ���߾ӿ� ��ġ
		setVisible(true);
		setResizable(false);
	}
	class graphicPanel extends JPanel
	{
		public void paint(Graphics g){
			
			g.clearRect(0,0,getWidth(),getHeight());
			g.drawLine(50,350,780,350);//���� �ؿ� ��
			for(int cnt = 1 ;cnt<12;cnt++)
			{
				Font font = new Font("Sitka Small", Font.BOLD, 20);
				g.setFont(font);
				g.drawString(cnt *1 +" ",20,357-30*cnt);   //�׷��� �� ����
				g.drawLine(50, 350-30*cnt, 780,350-30*cnt);//�׷���ǥ �� 
			}
			g.drawLine(50,20,50,350); // �� ���� ���ڿ��� 
			g.drawLine(780,20,780,350); // �� ������ �� 
			Font font = new Font("�޸ո���T", Font.BOLD, 15);
			g.setFont(font);
			g.setColor(Color.RED);
			g.drawString("�Ķ��̵�",60,370);
			g.setColor(new Color(0xFFFF4500));
			g.drawString("���ġŲ",140,370);
			g.setColor(Color.YELLOW);
			g.drawString("�������",220,370);
			g.setColor(new Color(0xFF32CD32));
			g.drawString("����ġŲ",300,370);
			g.setColor(new Color(0xFF1E90FF));
			g.drawString("�����Ϲ�",380,370);
			g.setColor(new Color(0xFF00008B));
			g.drawString("������",460,370);
			g.setColor(new Color(0xFF800080));
			g.drawString("�ݹ�ġŲ",540,370);
			g.setColor(new Color(0xFFDDA0DD));
			g.drawString("����ݹ�",620,370);
			g.setColor(new Color(0xFFFFDAB9));
			g.drawString("����ġŲ",700,370);
			draw(g);
		}
		public void draw(Graphics g) {
			if (cnt[0]>0){
				g.setColor(Color.RED);
				g.fillRect(70,350-cnt[0]*30,40,cnt[0]*30);}
			if(cnt[1]>0){
				g.setColor(new Color(0xFFFF4500));
				g.fillRect(150,350-cnt[1]*30,40,cnt[1]*30);}
			if(cnt[2]>0){
				g.setColor(Color.YELLOW);
				g.fillRect(230,350-cnt[2]*30,40,cnt[2]*30);}
			if(cnt[3]>0){
				g.setColor(new Color(0xFF32CD32));
				g.fillRect(310,350-cnt[3]*30,40,cnt[3]*30);}
			if(cnt[4]>0){
				g.setColor(new Color(0xFF1E90FF));
				g.fillRect(390,350-cnt[4]*30,40,cnt[4]*30);}
			if(cnt[5]>0){
				g.setColor(new Color(0xFF00008B));
				g.fillRect(470,350-cnt[5]*30,40,cnt[5]*30);}
			if(cnt[6]>0){
				g.setColor(new Color(0xFF800080));
				g.fillRect(550,350-cnt[6]*30,40,cnt[6]*30);}
			if(cnt[7]>0){
				g.setColor(new Color(0xFFDDA0DD));
				g.fillRect(630,350-cnt[7]*30,40,cnt[7]*30);}
			if(cnt[8]>0){
				g.setColor(new Color(0xFFFFDAB9));
				g.fillRect(710,350-cnt[8]*30,40,cnt[8]*30);}
		}
	}
}
