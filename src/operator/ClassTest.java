package operator;

import java.util.Scanner;

public class ClassTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("국어 영어 수학 점수를 순서대로 입력하세요");
		
		int kor = input.nextInt();
		int eng = input.nextInt();
		int mat = input.nextInt();
		
		int total = kor+eng+mat;
		double avg = (double)total/3;
		
		System.out.println("평균: " + avg);
		System.out.println("총점: " + total);
		
		switch ((int) kor / 10 ) {
			case 10:
			case 9: System.out.println("국어 수");			
				break;
			case 8: System.out.println("국어 우");			
				break;
			case 7: System.out.println("국어 미");			
				break;
			case 6: System.out.println("국어 양");			
				break;
			default: System.out.println("국어 가");
				break;
		}
		switch ((int) eng / 10 ) {
			case 10:
			case 9: System.out.println("영어 수");			
				break;
			case 8: System.out.println("영어 우");			
				break;
			case 7: System.out.println("영어 미");			
				break;
			case 6: System.out.println("영어 양");			
				break;
			default: System.out.println("영어 가");
				break;
		} //
		switch ((int) mat / 10 ) {
			case 10:
			case 9: System.out.println("수학 수");			
				break;
			case 8: System.out.println("수학 우");			
				break;
			case 7: System.out.println("수학 미");			
				break;
			case 6: System.out.println("수학 양");			
				break;
			default: System.out.println("수학 가");
				break;
		} //end of switch
		switch ((int) avg / 10 ) {
			case 10:
			case 9: System.out.println("평균 수");			
				break;
			case 8: System.out.println("평균 우");			
				break;
			case 7: System.out.println("평균 미");			
				break;
			case 6: System.out.println("평균 양");			
				break;
			default: System.out.println("평균 가");
				break;
		} //switch
//		if (kor>=90) {
//			System.out.println("국어등급은 수 입니다");
//		}else if(kor >= 80){
//			System.out.println("국어등급은 우 입니다");
//		}else if (kor >= 70) {
//			System.out.println("국어등급은 미 입니다");
//		}else if (kor >= 60) {
//			System.out.println("국어등급은 양 입니다");
//		}else if (kor < 60) {
//			System.out.println("국어등급은 가 입니다");
//		}
//		if (eng>=90) {
//			System.out.println("영어등급은 수 입니다");
//		}else if(eng >= 80){
//			System.out.println("영어등급은 우 입니다");
//		}else if (eng >= 70) {
//			System.out.println("영어등급은 미 입니다");
//		}else if (eng >= 60) {
//			System.out.println("영어등급은 양 입니다");
//		}else if (eng < 60) {
//			System.out.println("영어등급은 가 입니다");
//		}if (mat>=90) {
//			System.out.println("수학등급은 수 입니다");
//		}else if(mat >= 80){
//			System.out.println("수학등급은 우 입니다");
//		}else if (mat >= 70) {
//			System.out.println("수학등급은 미 입니다");
//		}else if (mat >= 60) {
//			System.out.println("수학등급은 양 입니다");
//		}else if (mat < 60) {
//			System.out.println("수학등급은 가 입니다");
//		}
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("세 개의 숫자를 입력하시오");
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
