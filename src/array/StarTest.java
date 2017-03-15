package array;

public class StarTest {
	public static void main(String[] args) {
		
		char [][] s = new char[26][];
		 
		for (int i = 0; i < s.length; i++) {
					
			s[i] = new char [i+1]; //메모리를 동적으로 할당하기위해
			
		for (int j = 0; j < s[i].length; j++) {
			for(char k = 'A' ; k <= 'A' + j ; k++)
				s[i][j] = k;
			}
		}
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.print( s[i][j] );
			}
			System.out.println();
		}
	}
}