package operator;

public class ShortCircuitLogic {

	public static void main(String[] args) {

		int a = 3;
		if ( a > 3 && ++a > 3) {
			System.out.println("���Ǹ���");
		}
			System.out.println("A= " + a);
			
			if ( a > 1 || ++a > 3) {
				System.out.println("���Ǹ���2");
			}
			System.out.println("A= " + a);
	}
}