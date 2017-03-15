package util;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		
		int stu = input.nextInt();
		int kor[] = new int [stu];
		int total = 0;
		double avg;
		
		for (int i = 0; i < stu; i++) {
			System.out.println(i +"번 학생의 국어점수를 입력하세요 ");
	
			kor[i] = input.nextInt();
		}
			
			for (int i = 0; i < stu; i++) {
				
				total += kor[i];
			}
			avg = (double)total / stu;
			System.out.println("위 학생들의 총점은" + total);
			System.out.println("위 학생들의 평균은" + avg);
		}
	}