package operator;

public class ShiftTest {
	public static void main(String[] args) {
			//  398 = 3 * 10�� 2�� + 9 * 10�� 1�� + 8 * 10�� 0
		
		int a = -4;					 // 00000000 00000000 00000000 00000100 -�ϰ�� ����
		System.out.println( a << 1); // 00000000 00000000 00000000 00010000
		System.out.println( a >> 1); // 00000000 00000000 00000000 00000010
		System.out.println( a >>> 1);
	}

}
