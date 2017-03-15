package execise;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BaseballGame {

	public static void main(String[] args) {

	Scanner  UserInsert  =	new Scanner(System.in);
	
	String 	 UserNumber  =  new String();					//사용자가 입력하는 숫자 저장
	
	int []	 comNumber	 =	new int [3];					//랜덤 숫자
	int [] 	 UserNum 	 =	new int [3];					//사용자가 입력한 숫자
	
	//랜덤 숫자 뽑기
	
	for( int i = 0 ; i < comNumber.length ; i++ ){			
		comNumber[i] = (int)(Math.random() * 10);			//0~10까지 숫자 랜덤 추출
	for (int j = 0; j < i; j++) {
		if (comNumber[i] == comNumber[j]) {					//중복숫자 제거
			i--;
		} 													//end of if
	} 														//end of j for
} 															//end of i for
	
	//사용자 입력 받기
	
	for (int i = 0; i < 10; i++) {
		System.out.println("세자리 숫자와 위치까지 맞춰보세요");
		
		UserNumber = UserInsert.next();
		
		StringTokenizer changeNumber = new StringTokenizer(UserNumber);
	
		for (int j = 0; j < UserNum.length; j++) {
			
		}
	}
	
	//
	
	for (int i = 0; i < 3; i++) {	
//		System.out.print(comNumber[i]);
//		System.out.print(" ");
		}//end of i for print
	} 														//end of main
} 															//end of class