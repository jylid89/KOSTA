package util;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�л����� �Է��ϼ���");
		
		int stu = input.nextInt();
		int kor[] = new int [stu];
		int total = 0;
		double avg;
		
		for (int i = 0; i < stu; i++) {
			System.out.println(i +"�� �л��� ���������� �Է��ϼ��� ");
	
			kor[i] = input.nextInt();
		}
			
			for (int i = 0; i < stu; i++) {
				
				total += kor[i];
			}
			avg = (double)total / stu;
			System.out.println("�� �л����� ������" + total);
			System.out.println("�� �л����� �����" + avg);
		}
	}