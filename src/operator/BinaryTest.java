package operator;

public class BinaryTest {

	public static void main(String[] args) {
		int a = 10;  // 00000000 00000000 00000000 00001010
		int b = 7;	 // 00000000 00000000 00000000 00000111
		System.out.println("AND : " + (a&b) ); // 00000010
		System.out.println("OR : " + (a|b) ); // 00001111
		System.out.println("XOR : " + (a^b) );
		// 00000000 00000000 00000000 00001101 토글키 생성시 쓰임
	}
}