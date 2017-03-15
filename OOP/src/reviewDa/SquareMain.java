package reviewDa;

import java.util.Scanner;

public class SquareMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int NumInput = 0;

		CircleMaster calculator = null;
		do{		
			System.out.println("원하는 도형을 선택하세요 (1.사각형  2.삼각형  3.원)");
				NumInput = input.nextInt();
				input.nextLine();

			switch (NumInput) {
			case 1:
				System.out.println("사각형의 높이와 길이를 입력하세요");
				calculator = new Quardrangle();
				break;
			case 2:
				System.out.println("삼각형의 높이와 길이를 입력하세요 ");
				calculator = new Triangle();
				break;
			case 3:
				System.out.println("원의 반지름 길이를 입력하세요");
				calculator = new Circle();
				break;
			default: 
				System.out.println("잘못입력하셨습니다");
				break;
			}		
		}while(NumInput != 1 && NumInput != 2 && NumInput != 3);
		calculator.print();
	}
}