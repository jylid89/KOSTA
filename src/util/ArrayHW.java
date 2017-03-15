package util;

public class ArrayHW {
	public static void main(String[] args) {
		
		int [][] lotto = new int [5][6];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				lotto[i][j] = (int)(Math.random()*45);
				for (int j2 = 0; j2 < j; j2++) {
					if (lotto[i][j] == lotto[i][j2]) {
						j--;
					}
				}
			}
		}
		int max;
		
		for(int k=0; k < 5; k++)
			for(int j = 0; j < 5; j++) {
				for (int i = 0; i < 5-j; i++) {
					if (lotto[k][i] < lotto[k][i+1]) {
			} else {
				int temp = lotto[k][i+1];
				lotto[k][i+1] = lotto[k][i];
				lotto[k][i] =  temp;
			}
		}
	}
		for (int i = 0; i < 5; i++){
				
			int sum = 0;
				
		for (int j = 0; j < 6; j++) {
			System.out.print( lotto[i][j] + " ");
			sum += lotto[i][j];
		}
		if ( sum >= 106 && sum <= 170 ) {
			System.out.println(" 좋은 숫자입니다");
		}else{
			System.out.println();
			}
		}
	}
}