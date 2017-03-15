package operator;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SungTest {
	public static void main(String[] args) {
		
		Calendar pre = Calendar.getInstance();
		int year = pre.get(pre.YEAR);
		
		String id = "020211-4149318";
		char sung = id.charAt(7);
		
//		if ( sung == '1' || sung == '3' || sung == '9') {
//			System.out.println("남자입니다");
//		}else if(sung == '2' || sung == '4' || sung == '0'){
//			System.out.println("여자입니다");
//		}

		
//		char chul = id.charAt(8);
//		
//		switch (chul) {
//		case 0:
//			System.out.println("서울");
//			break;
//		case 1:
//			System.out.println("인천, 부산");
//			break;
//		case 2:
//			System.out.println("경기");
//			break;
//		default:
//			break;
//		}
		
		
		String birth = id.substring(0, 2);
		String month = id.substring(3, 5);
		String day = id.substring(5, 7);
		
		int age2 = Integer.parseInt(birth);
		int age3 = Integer.parseInt(month);
		int age4 = Integer.parseInt(day);
		int age = 0;

		if (sung == '4' | sung == '3')
			 		age = year - (2000 + Integer.parseInt(birth)) + 1;
		else if(sung == '1' | sung == '2')
					age = year - (1900 + Integer.parseInt(birth)) + 1;
		else if(sung == '0' | sung == '9') 
					age = year - (1800 + Integer.parseInt(birth)) + 1;

		System.out.println("나이는? " + age);
		
		
	}
	
}