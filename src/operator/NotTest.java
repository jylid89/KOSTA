package operator;

public class NotTest {

	public static void main(String[] args) {
		System.out.println( !(3 > 5) );
		int a = 2; 	// -------- -------- -------- ------1-
					// 11111111 11111111 11111111 11111101
		System.out.println("a="+ ~a );

	}

}
