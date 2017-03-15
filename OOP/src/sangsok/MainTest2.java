package sangsok;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		
		Item i = null;
		
		System.out.println("상품종류를 선택(1.책 2.DVD 3.CD"));
		Scanner input = new Scanner(System.in);
		
		int sel = input.nextInt();
		
		switch(sel){
		case 1 : i = new Book("0001", "자바", "김씨", "코스타"); break;
		case 2 : i = new Dvd("0002", "영화", "배우", "감독"); break;
		case 3 : i = new Cd("0003", "음악", "가수"); break;		
		}
		
		i.print();				//#######다형성 개념 = 오버라이딩
	}

}