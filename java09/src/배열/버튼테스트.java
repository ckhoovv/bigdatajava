package �迭;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ��ư�׽�Ʈ {
	static int status = 2;//������ ��ġ��

	public static void main(String[] args) {
		
		String[] pictures = {"m1.PNG","m2.PNG","m3.PNG","m4.PNG","m5.PNG"};
		String[] pictures2 = new String[5];
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);

		f.setSize(400, 500);
		f.setTitle("��ư �׽�Ʈ");
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		JButton img = new JButton();
		img.setBackground(Color.BLUE);
		f.getContentPane().add(img);
		
		ImageIcon icon = new ImageIcon("m1.PNG");
		img.setIcon(icon);
		
		JButton b1 = new JButton("<<\uC67C\uCABD\uC73C\uB85C");
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(status - 1 >= 0) {
                    ImageIcon icon = new ImageIcon(pictures[status-1]);
                    img.setIcon(icon);
                    status = status - 1;
                }else {
                    JOptionPane.showMessageDialog(null, "���� �������Դϴ�. ������ư�� Ŭ�����ּ���.");
				
                }
			}
		});
		b1.setFont(new Font("����", Font.BOLD, 24));
		f.getContentPane().add(b1);
		JButton b2 = new JButton("\uC624\uB978\uCABD\uC73C\uB85C>>");
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   if(status + 1 <= 4) {
	                    ImageIcon icon = new ImageIcon(pictures[status+1]);
	                    img.setIcon(icon);
	                    status = status + 1;
	                }else {
	                    JOptionPane.showMessageDialog(null, "������ �������Դϴ�. ������ư�� Ŭ�����ּ���.");
	                }
			}
		});
		b2.setFont(new Font("����", Font.BOLD, 24));
		f.getContentPane().add(b2);
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
		
	}

}
