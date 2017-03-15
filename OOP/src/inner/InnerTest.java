package inner;

/* Inner class : 클래스 안의 클래스 */
class Outer{
	static class Inner{													//클래스 안의 클래스는 멤버 그렇기 때문에 static이 가능
		static void najabara(){
			System.out.println("잡아보슈");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
//		Outer out = new Outer();
//		Outer.Inner in = out.new Inner();
//		Outer.Inner in = new Outer.Inner();
//		in.najabara();
		Outer.Inner.najabara();
	}
}