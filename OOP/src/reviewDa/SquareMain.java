package reviewDa;

import java.util.Scanner;

public class SquareMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int NumInput = 0;

		CircleMaster calculator = null;
		do{		
			System.out.println("���ϴ� ������ �����ϼ��� (1.�簢��  2.�ﰢ��  3.��)");
				NumInput = input.nextInt();
				input.nextLine();

			switch (NumInput) {
			case 1:
				System.out.println("�簢���� ���̿� ���̸� �Է��ϼ���");
				calculator = new Quardrangle();
				break;
			case 2:
				System.out.println("�ﰢ���� ���̿� ���̸� �Է��ϼ��� ");
				calculator = new Triangle();
				break;
			case 3:
				System.out.println("���� ������ ���̸� �Է��ϼ���");
				calculator = new Circle();
				break;
			default: 
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				break;
			}		
		}while(NumInput != 1 && NumInput != 2 && NumInput != 3);
		calculator.print();
	}
}