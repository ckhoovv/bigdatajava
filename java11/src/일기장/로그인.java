package �ϱ���;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class �α��� {
	private JTextField textField;
	private JTextField textField_1;
	public �α���() {
		JFrame f = new JFrame("���� �ϱ��� �α��� ȭ��");
		f.getContentPane().setFont(new Font("����", Font.BOLD, 18));
		f.setSize(550, 700);
		JLabel l = new JLabel();
		ImageIcon icon = new ImageIcon("999.PNG");
		l.setIcon(icon);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(l);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778 \uCC98\uB9AC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���̾ diary = new ���̾();
			}
		});
		
		JLabel lblNewLabel = new JLabel("ID \uC785\uB825:");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 18));
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("����", Font.BOLD, 18));
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPw = new JLabel("PW \uC785\uB825:");
		lblPw.setFont(new Font("����", Font.BOLD, 18));
		f.getContentPane().add(lblPw);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("����", Font.BOLD, 18));
		textField_1.setColumns(10);
		f.getContentPane().add(textField_1);
		btnNewButton.setFont(new Font("����", Font.BOLD, 33));
		f.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		�α��� log = new �α���();
		
	}

		


}
