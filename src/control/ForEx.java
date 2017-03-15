package control;

public class ForEx {
	public static void main(String[] args) {
		
//		for ( int num = 0 ; num <=25 ; num++ ){
//		for ( char a = 'Z'; a >= 'Z'- num ; a-- ) {
//			System.out.print(a);
//		}
//		System.out.println("");
//		}
		
		
		for (int i = 0; i <= 25; i++) {
			for ( char a = (char)('A' + i); a <= 'Z' ; a++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
}