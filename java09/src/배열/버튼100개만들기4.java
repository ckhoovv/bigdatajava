package 배열;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;

public class 버튼100개만들기4 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.CYAN);
		f.setTitle("나의 버튼들......200개");
		f.setSize(1200, 800);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(null); //배치부품들 안쓰겠다.
		
		JButton[] buttons = new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("나는 버튼 " + i);
		}
		
		Random random = new Random();
		for (int i = 0; i < buttons.length; i++) {
			int x = random.nextInt(1000);
			int y = random.nextInt(800);
			
			buttons[i].setBounds(x, y, 100, 50);
			f.getContentPane().add(buttons[i]);
			
		}
		
		
		


		
		
		
		
		
		
		f.setVisible(true);
	}

}
