package data;

public class DataTest {

	public static void main(String[] args) {
		// comment, 주석, 설명
        // 컨트롤+/(한글 주석)
		// Sysout, syso + (컨트롤+스페이스바) : 자동완성
		System.out.println("나의 데이터 프린트..");
		// 컨트롤 + s(저장)
		// 컨트롤 + F11(실행)
		// 정수(integer, int)
		int spaceY = 300;  // -21 ~ 21억
		//byte(1바이트, 8비트: -128 ~ 127)
		//--> short(2)
		//--> int(4)
		//--> long(8)
		
		int startX = 0; //대입 연산자, 할당 연산자
		int startY = 0;
		
		int result = startX + startY;
		String result2 = "그랙픽의 시작점은 Y축은" + startY;
		
		System.out.println("그래픽의 시작점은 x축은" + startX);
		System.out.println(result2);
		
		System.out.println();
		
		float x = 5.5f;
		double y = 5.5;
		
		char gender = '남';
		boolean breakTime = true; //false(거짓)
		

	}

}
