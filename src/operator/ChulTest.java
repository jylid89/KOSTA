package operator;

import java.util.Scanner;

public class ChulTest {

	public static void main(String[] args) {
		
		
		
//		char sung = id.charAt(7);
//		
//		if ( sung == '1' || sung == '3' || sung == '9') {
//			System.out.println("남자입니다");
//		}else if(sung == '2' || sung == '4' || sung == '0'){
//			System.out.println("여자입니다");
//		}
		char chul = id.charAt(8);
		
		switch (chul) {
		case '0':
			System.out.println("서울");
			break;
		case '1':
			System.out.println("인천, 부산");
			break;
		case '2':
			System.out.println("경기");
			break;
		default:
			break;
		}
	}
}
