package execise;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BaseballGame {

	public static void main(String[] args) {

	Scanner  UserInsert  =	new Scanner(System.in);
	
	String 	 UserNumber  =  new String();					//����ڰ� �Է��ϴ� ���� ����
	
	int []	 comNumber	 =	new int [3];					//���� ����
	int [] 	 UserNum 	 =	new int [3];					//����ڰ� �Է��� ����
	
	//���� ���� �̱�
	
	for( int i = 0 ; i < comNumber.length ; i++ ){			
		comNumber[i] = (int)(Math.random() * 10);			//0~10���� ���� ���� ����
	for (int j = 0; j < i; j++) {
		if (comNumber[i] == comNumber[j]) {					//�ߺ����� ����
			i--;
		} 													//end of if
	} 														//end of j for
} 															//end of i for
	
	//����� �Է� �ޱ�
	
	for (int i = 0; i < 10; i++) {
		System.out.println("���ڸ� ���ڿ� ��ġ���� ���纸����");
		
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