package util;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		
		int year = c.get( Calendar.YEAR);
		int date = c.get( Calendar.DATE);
		int month = c.get( Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);
		
		char [] daystr = {'��','��','ȭ','��','��','��','��'};
		
		System.out.println(day);
		System.out.println(year + "�� " + (month + 1) + "�� " + date + "�� " + daystr[day-1] + "����");
	}
}