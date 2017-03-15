package util;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		
		int year = c.get( Calendar.YEAR);
		int date = c.get( Calendar.DATE);
		int month = c.get( Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);
		
		char [] daystr = {'일','월','화','수','목','금','토'};
		
		System.out.println(day);
		System.out.println(year + "년 " + (month + 1) + "월 " + date + "일 " + daystr[day-1] + "요일");
	}
}