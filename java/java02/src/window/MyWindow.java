package window;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setTitle("나의 첫번째 그래픽 프로그램");
		
		JButton button = new JButton("나를 눌러주세요..!!!!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("나를 눌렀군요!!");
			}
		});
		f.getContentPane().add(button);
		
		
		f.setVisible(true);
		
		

	}

}
