package operator;

import java.util.Scanner;

public class ChulTest {

	public static void main(String[] args) {
		
		
		
//		char sung = id.charAt(7);
//		
//		if ( sung == '1' || sung == '3' || sung == '9') {
//			System.out.println("�����Դϴ�");
//		}else if(sung == '2' || sung == '4' || sung == '0'){
//			System.out.println("�����Դϴ�");
//		}
		char chul = id.charAt(8);
		
		switch (chul) {
		case '0':
			System.out.println("����");
			break;
		case '1':
			System.out.println("��õ, �λ�");
			break;
		case '2':
			System.out.println("���");
			break;
		default:
			break;
		}
	}
}
