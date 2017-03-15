package operator;

public class ArithTest {
	public static void main(String[] args) {

		int kor=89, eng=79, math=53;
		int total = kor + eng + math;
		double avg = (double)total / 3; //int와 int 계산시 int형으로 결과 나옴
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);

	}
}