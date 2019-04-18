package control;


public class Day3Test3 {

	public static void main(String[] args) {
		double pi = 3.14;
		double r = 12;
		double area = pi * r * r;
		double width = 11;
		double height = 22;
		double area1 = width * height;
		System.out.println("반지름이 12인 원의 면적은....." + area);
		
		String result;
		if(width == height ) {
			result = "true";
			
		}else {
			result = "false";
		}
		System.out.println("가로가 11, 세로가 22인 사간형의 면적은 가로세로가 같은가요?" + result);
		String result1;
		if(r > 10) {
			result1 = "true";
			
		}else {
			result1= "false";
		}
		System.out.println("반지름이 10보다 큰가요?" + result1);
		
		
		
		
		

	
	}

}
