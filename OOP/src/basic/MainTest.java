package basic;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MainTest {

	public static void main(String[] args) {
		
//		Student s = new Student();			//Student = 클래스명 s = 객체명
											//Student s = null;변수선언 + s = new Student();객체생성
		Scanner userNum = new Scanner(System.in);			//입력받기 위해
		int resultEng = 0;
		int resultMath = 0;
		int resultKor = 0;

		//학생 수 입력받기
		
		System.out.println("학생 수를 입력하세요");

			int studentCount = userNum.nextInt();			//사용자의 입력을 받아 studentCount에 정수값을 저장0
			userNum.nextLine();								//nextInt는 띄어쓰기를 인식하지 않기 때문에 
			String result[] = new String[studentCount];		//입력받은 학생수만큼의 열을 생성하고 result
			
		for (int i = 0; i < studentCount; i++) {
			System.out.println(i +"번째 학생의 성적을 입력 : ");
			result[i]= userNum.nextLine();
		
		}
		
		//
		
		String separateNum[][] = new String [studentCount][5];		

		for(int j = 0; j < studentCount; j++){
			StringTokenizer separate = new StringTokenizer(result[j]);
		for (int i = 0; separate.hasMoreTokens(); i++) {
			separateNum[j][i] = separate.nextToken();
		}
	}
		
		for(int i = 0; i < studentCount; i++){
			Student d = new Student(separateNum[i][0], separateNum[i][1], Integer.parseInt(separateNum[i][2]) , Integer.parseInt(separateNum[i][3]), Integer.parseInt(separateNum[i][4]));
			d.makeTotal();
			d.makeAvg();
			d.output();			
		}
		for (int i = 0; i < studentCount; i++) {
			resultKor += Integer.parseInt(separateNum[i][2]);
			resultEng += Integer.parseInt(separateNum[i][3]);
			resultMath += Integer.parseInt(separateNum[i][4]);
		}
		System.out.println("국어점수 총점: " + resultKor + "평균은: " + (double)resultKor / studentCount);
		System.out.println("영어점수 총점: " + resultEng + "평균은: " + (double)resultEng / studentCount);
		System.out.println("수학점수 총점: " + resultMath + "평균은: " + (double)resultMath / studentCount);
	}
}