package inner;

class Out{
	class In{
		void call(){
			System.out.println("�ҷ��ּ���");
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