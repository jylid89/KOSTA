package operator;

public class ShiftTest {
	public static void main(String[] args) {
			//  398 = 3 * 10의 2승 + 9 * 10의 1승 + 8 * 10의 0
		
		int a = -4;					 // 00000000 00000000 00000000 00000100 -일경우 보수
		System.out.println( a << 1); // 00000000 00000000 00000000 00010000
		System.out.println( a >> 1); // 00000000 00000000 00000000 00000010
		System.out.println( a >>> 1);
	}

}
