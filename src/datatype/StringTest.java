package datatype;

public class StringTest {

	public static void main(String[] args) {
		// String은 클래스  - 참조형이기 때문에 new 객체 생성해야만 함
//		String a = new String("Hello");
//		String b = new String("Hello");
		String a = "Hello";
		String b = "Hello";
		
		if( a.equals(b) ) {
			System.out.println("같다"); 
			}else{
			System.out.println("다르다");
			
		}
	}
}