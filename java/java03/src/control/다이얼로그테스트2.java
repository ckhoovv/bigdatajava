package control;

import javax.swing.JOptionPane;

public class 다이얼로그테스트2 {

	public static void main(String[] args) {
		String like = JOptionPane.showInputDialog("먹고 싶은 메뉴를 입력하세요");
		System.out.println("당신이 먹고 싶어하는 메뉴는" + like + "입니다.");
		String dislike = JOptionPane.showInputDialog("먹기 싫은 메뉴를 입력하세요");
		System.out.println("당신이 먹기 싫어하는 메뉴는" + dislike + "입니다.");
		
        
	}

}
