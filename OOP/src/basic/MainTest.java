package basic;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MainTest {

	public static void main(String[] args) {
		
//		Student s = new Student();			//Student = Ŭ������ s = ��ü��
											//Student s = null;�������� + s = new Student();��ü����
		Scanner userNum = new Scanner(System.in);			//�Է¹ޱ� ����
		int resultEng = 0;
		int resultMath = 0;
		int resultKor = 0;

		//�л� �� �Է¹ޱ�
		
		System.out.println("�л� ���� �Է��ϼ���");

			int studentCount = userNum.nextInt();			//������� �Է��� �޾� studentCount�� �������� ����0
			userNum.nextLine();								//nextInt�� ���⸦ �ν����� �ʱ� ������ 
			String result[] = new String[studentCount];		//�Է¹��� �л�����ŭ�� ���� �����ϰ� result
			
		for (int i = 0; i < studentCount; i++) {
			System.out.println(i +"��° �л��� ������ �Է� : ");
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
		System.out.println("�������� ����: " + resultKor + "�����: " + (double)resultKor / studentCount);
		System.out.println("�������� ����: " + resultEng + "�����: " + (double)resultEng / studentCount);
		System.out.println("�������� ����: " + resultMath + "�����: " + (double)resultMath / studentCount);
	}
}