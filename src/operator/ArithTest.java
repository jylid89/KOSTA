package operator;

public class ArithTest {
	public static void main(String[] args) {

		int kor=89, eng=79, math=53;
		int total = kor + eng + math;
		double avg = (double)total / 3; //int�� int ���� int������ ��� ����
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);

	}
}