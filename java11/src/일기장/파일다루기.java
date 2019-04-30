package 일기장;

import java.io.FileWriter;
import java.io.IOException;
public class 파일다루기 {

	public static void main(String[] args) throws IOException {
		
		//파일에 저장
		//객체 생성
		FileWriter w = new FileWriter("start.txt");
		
		//메소드 사용(호출)
		w.write("안녕하세요\n");
		w.write("반갑습니다\n");
		
		
		w.close();

	}

}
