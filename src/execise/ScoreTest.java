package execise;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ScoreTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("�л� ���� �Է��ϼ���");
		int student = input.nextInt();
		int [][] score = new int [student][3];
		
		String add [] = new String[student];
		
		for(int j = 0; j < student; j++){
			System.out.println(j +"��° �л� ����/����/���� �Է��ϼ���(���� 90/80/70): ");			
			 add[j] = input.next();
		}
				
		for(int j = 0; j < student; j++){
			StringTokenizer st = new StringTokenizer(add[j], "/");
		for(int i = 0; st.hasMoreTokens(); i++){
			score[j][i] = Integer.parseInt(st.nextToken());  //String->int
		}
	}
		//������ ����� ���ؼ� ���
			int [] add3 = new int[student];
			int [] add4 = new int[3];
			
		for(int j = 0; j < student; j++){
		for(int i = 0; i < 3; i++){
			add3[j] += score[j][i]; 		
			}
		System.out.println(+ j +"��° �л��� �����" + add3[j]/3 + "������ " + add3[j] + "�Դϴ�." );
		}
		
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < student ; j++) {
				add4[i] += score[j][i];
			}
		}
		System.out.println("���� ���� ������ " + add4[0] + "����� " + add4[0] / student + " �Դϴ�. " );
		System.out.println("���� ���� ������ " + add4[1] + "����� " + add4[1] / student + " �Դϴ�. " );
		System.out.println("���� ���� ������ " + add4[2] + "����� " + add4[2] / student + " �Դϴ�. " );
	}
}