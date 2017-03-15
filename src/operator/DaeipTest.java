package operator;
public class DaeipTest {

	public static void main(String[] args) {
		int a = 10, b = 7;
		a += b; // a = a+b;
		System.out.println("결과: " + a);  // 17
		a -= b; // a = a-b;
		System.out.println("결과: " + a);  // 10
		a *= b; // a = a*b;
		System.out.println("결과: " + a);  // 70
		a /= b; // a = a/b;
		System.out.println("결과: " + a);  // 10
		a %= b; // a = a%b;
		System.out.println("결과: " + a);  // 3
		
	}
}
