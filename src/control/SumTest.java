package control;

public class SumTest {
	public static void main(String[] args) {
		
		int sum = 0;
		int sum2 = 0;
//		int i=1;
//		
//		while (i <= 10) {
//			sum += i;
//			i++;
//		
//		do{
//			sum += i;
//			i++;
//		}while(i<11);
//		System.out.println("°á°ú: " + sum);
		
//		for(int i = 1 ; i <= 100; i++ ){
//			if (i%2 == 0) {
//				sum += i;
//			}else {
//				sum2 += i;
//			}
//		}
		for (int i = 1; i < 100; i+=2) {
			sum += i;
			sum2 += (i+1);
		}
		System.out.println("Â¦¼öÀÇ ÇÕ: " + sum);
		System.out.println("È¦¼öÀÇ ÇÕ :" + sum2);
	}
}