package window;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setTitle("자바 프로젝트 버튼");
		
		
		JButton button = new JButton("자바 프로젝트 버튼");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("다음주부터 자바프로젝트가 시작됩니다.");
			}
		});
		f.getContentPane().add(button);
		
		
		
		f.setVisible(true);
		


	}

}
