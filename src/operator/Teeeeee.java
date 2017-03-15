package operator;

import java.util.Scanner;

public class Teeeeee {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int m = ( a <= b & a <= c )?(( b<=c )?b:c):(( a>=c )?c:a);
		System.out.println("두번째로 큰 수는?" + m);

	}

}
