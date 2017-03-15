package equal;

public class StringEqualTest {

	public static void main(String[] args) {
		String s = new String("불금");
		String s2 = new String("불금");
		
		if ( s == s2 ) {
			System.out.println("주소 같다");
		}else System.out.println("주소 다르다");
		if ( s.equals(s2) ) {
			System.out.println("내용 같다");
		}else System.out.println("내용 다르다");
		
		StringBuffer sb = new StringBuffer("과식금지");			//StringBuffer클래스에
		StringBuffer sb2 = new StringBuffer("과식금지");
		if (s.equals(s2)) {
			System.out.println("---내용같다");
		}else System.out.println("---내용 다르다");
	}
}