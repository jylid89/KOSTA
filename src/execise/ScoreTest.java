package execise;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ScoreTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("학생 수를 입력하세요");
		int student = input.nextInt();
		int [][] score = new int [student][3];
		
		String add [] = new String[student];
		
		for(int j = 0; j < student; j++){
			System.out.println(j +"번째 학생 국어/영어/수학 입력하세요(예시 90/80/70): ");			
			 add[j] = input.next();
		}
				
		for(int j = 0; j < student; j++){
			StringTokenizer st = new StringTokenizer(add[j], "/");
		for(int i = 0; st.hasMoreTokens(); i++){
			score[j][i] = Integer.parseInt(st.nextToken());  //String->int
		}
	}
		//총점과 평균을 구해서 출력
			int [] add3 = new int[student];
			int [] add4 = new int[3];
			
		for(int j = 0; j < student; j++){
		for(int i = 0; i < 3; i++){
			add3[j] += score[j][i]; 		
			}
		System.out.println(+ j +"번째 학생의 평균은" + add3[j]/3 + "총점은 " + add3[j] + "입니다." );
		}
		
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < student ; j++) {
				add4[i] += score[j][i];
			}
		}
		System.out.println("국어 과목 총점은 " + add4[0] + "평균은 " + add4[0] / student + " 입니다. " );
		System.out.println("영어 과목 총점은 " + add4[1] + "평균은 " + add4[1] / student + " 입니다. " );
		System.out.println("수학 과목 총점은 " + add4[2] + "평균은 " + add4[2] / student + " 입니다. " );
	}
}