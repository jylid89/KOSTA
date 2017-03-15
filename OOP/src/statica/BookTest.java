package statica;
class book {
	private static int count;					//heap 다른 한 영역 생김 ---- 메모리 공유를 위해
	public book(){
		count++;
	
	}
	public static int getCoung(){				//객체생성하지 않고 클래스명으로 접근하고 싶어서
		return count;
	}
}

public class BookTest {

	public static void main(String[] args) {
	
//		book b1 = new book();								
//		System.out.println(b1.count + " 권");
//		book b2 = new book();								
//		System.out.println(b2.count + " 권");
		book b3 = new book();
		System.out.println(book.getCoung() + " 권");
		System.out.println(b3.a);
		
	}
}