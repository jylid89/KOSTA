package operator;

import java.util.Scanner;

public class ClassTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���� ���� ���� ������ ������� �Է��ϼ���");
		
		int kor = input.nextInt();
		int eng = input.nextInt();
		int mat = input.nextInt();
		
		int total = kor+eng+mat;
		double avg = (double)total/3;
		
		System.out.println("���: " + avg);
		System.out.println("����: " + total);
		
		switch ((int) kor / 10 ) {
			case 10:
			case 9: System.out.println("���� ��");			
				break;
			case 8: System.out.println("���� ��");			
				break;
			case 7: System.out.println("���� ��");			
				break;
			case 6: System.out.println("���� ��");			
				break;
			default: System.out.println("���� ��");
				break;
		}
		switch ((int) eng / 10 ) {
			case 10:
			case 9: System.out.println("���� ��");			
				break;
			case 8: System.out.println("���� ��");			
				break;
			case 7: System.out.println("���� ��");			
				break;
			case 6: System.out.println("���� ��");			
				break;
			default: System.out.println("���� ��");
				break;
		} //
		switch ((int) mat / 10 ) {
			case 10:
			case 9: System.out.println("���� ��");			
				break;
			case 8: System.out.println("���� ��");			
				break;
			case 7: System.out.println("���� ��");			
				break;
			case 6: System.out.println("���� ��");			
				break;
			default: System.out.println("���� ��");
				break;
		} //end of switch
		switch ((int) avg / 10 ) {
			case 10:
			case 9: System.out.println("��� ��");			
				break;
			case 8: System.out.println("��� ��");			
				break;
			case 7: System.out.println("��� ��");			
				break;
			case 6: System.out.println("��� ��");			
				break;
			default: System.out.println("��� ��");
				break;
		} //switch
//		if (kor>=90) {
//			System.out.println("�������� �� �Դϴ�");
//		}else if(kor >= 80){
//			System.out.println("�������� �� �Դϴ�");
//		}else if (kor >= 70) {
//			System.out.println("�������� �� �Դϴ�");
//		}else if (kor >= 60) {
//			System.out.println("�������� �� �Դϴ�");
//		}else if (kor < 60) {
//			System.out.println("�������� �� �Դϴ�");
//		}
//		if (eng>=90) {
//			System.out.println("�������� �� �Դϴ�");
//		}else if(eng >= 80){
//			System.out.println("�������� �� �Դϴ�");
//		}else if (eng >= 70) {
//			System.out.println("�������� �� �Դϴ�");
//		}else if (eng >= 60) {
//			System.out.println("�������� �� �Դϴ�");
//		}else if (eng < 60) {
//			System.out.println("�������� �� �Դϴ�");
//		}if (mat>=90) {
//			System.out.println("���е���� �� �Դϴ�");
//		}else if(mat >= 80){
//			System.out.println("���е���� �� �Դϴ�");
//		}else if (mat >= 70) {
//			System.out.println("���е���� �� �Դϴ�");
//		}else if (mat >= 60) {
//			System.out.println("���е���� �� �Դϴ�");
//		}else if (mat < 60) {
//			System.out.println("���е���� �� �Դϴ�");
//		}
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("�� ���� ���ڸ� �Է��Ͻÿ�");
//		
//		int a = input.nextInt();
//		int b = input.nextInt();
//		int c = input.nextInt();
//		
//		if ( a <= b && b <= c ) {
//			System.out.println(b);
//		}else if ( a >= b && b >= c ) {
//			System.out.println(b);
//		}else if ( b<=a && a <= c ) {
//			System.out.println(a);
//		}else if (b>=a && a>=c) {
//			System.out.println(a);
//		}else if (a<=c && c<=b) {
//			System.out.println(c);
//		}else if (a>=c && c>=b) {
//			System.out.println(c);
//		}
	} //end of main
} //end of class
