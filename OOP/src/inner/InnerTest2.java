package inner;

class Out{
	class In{
		void call(){
			System.out.println("불러주세요");
		}
	}
}
public class InnerTest2 {

	public static void main(String[] args) {
//		Out Ou = new Out();
//		Out.In inner = Ou.new In();
//		inner.call();
		
//		Out.In i = new Out().new In();
//		i.call();
		
//		new Out().new In().call();
		
//		Out Ou = new Out();
//		Out.In inner = Ou.new In();
//		inner.call();
	
//		Out.In inner = new Out().new In();
//		inner.call();
	
		new Out().new In().call();
	}
}