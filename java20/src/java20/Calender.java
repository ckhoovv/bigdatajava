package java20;

import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
        int mon = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        
        System.out.println("����ð�");
        System.out.println(year + "�� "+ mon+"�� "+day+"��");
        System.out.println(hour + "�� "+ min+"�� "+sec+"��");



	}

}
