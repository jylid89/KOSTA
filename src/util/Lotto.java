package util;

public class Lotto {
	public static void main(String[] args) {
		
		int [][] lotto = new int[5][6];
		//번호지정
		
		for( int i = 0; i < 5; i++){
			for (int j = 0; j < 6; j++) {
				lotto[i][j] = (int)(Math.random() * 45) + 1;

			}
		}		// 출력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print( lotto[i][j] + " ");	
			}System.out.println();
		}
	}
}