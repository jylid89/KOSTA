package ex;

import java.util.Scanner;

public class LangSel {

	public static void main(String[] args) {

		String re = "Y";

		while( re.equals("Y") | re.equals("y") ){

			Lot i = null;

			System.out.println("언어를 선택하세요. (1. 한국어 2. 영어 3. 일본어)");
			Scanner input = new Scanner(System.in);

			int sel = input.nextInt();

			switch(sel){
			case 1 : i = new KorSel(); break;
			case 2 : i = new EngSel("Hello"); break;
			case 3 : i = new JpnSel("こんにちは"); break;
			}

			i.print();

			System.out.println("다시 하시겠습니까(Y/N)");
			re = input.next();
			
		}
	}
}