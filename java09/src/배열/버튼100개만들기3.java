package �迭;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ư100�������3 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("���� ��ư��......200��");
		f.setSize(1200, 800);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(null); //��ġ��ǰ�� �Ⱦ��ڴ�.
		
		JButton[] buttons = new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("���� ��ư " + i);
		}
		
		buttons[0].setBounds(50, 50, 150, 100);
		f.add(buttons[0]);
		buttons[1].setBounds(200, 50, 150, 100);
		f.add(buttons[1]);
		buttons[2].setBounds(350, 50, 150, 100);
		f.add(buttons[2]);
		buttons[3].setBounds(500, 50, 150, 100);
		f.add(buttons[3]);
		buttons[4].setBounds(650, 50, 150, 100);
		f.add(buttons[4]);
		
		System.out.println(buttons[4].getText());


		
		
		
		
		
		
		f.setVisible(true);
	}

}
