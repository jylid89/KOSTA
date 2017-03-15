package operator;

public class IncDesTest {

	public static void main(String[] args) {
		int a = 3, b = 7;
		a++; b--;
		System.out.println("a=" + a + " / b=" + b); //a=4 b=6
		
		++a; --b;
		System.out.println("a=" + a +" / b=" + b); //a=5 b=5 

		System.out.println("a=" + ++a +" / b="+ --b); // a=6 b=4
		System.out.println("a=" + a++ + " / b=" + b--); // a=6 b=4
		
		System.out.println("a=" + a + " / b=" + b); // 
	}
}