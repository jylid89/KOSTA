package control;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ab;
			for (int j = 0; j < 999; j++) {
		System.out.println("����� �������� �Է��ϼ���");
		
		int gu = input.nextInt();
		
		for (int i = 1; i < 10 ; i++) {
			System.out.println(+ gu + "*" + i + " = "+ gu * i);
		}
			System.out.println("�ٽ��Ͻðڽ��ϱ�? (Y/N)");
		
			ab = input.next();
		if (ab.equals("Y")) {
			continuet;
		}else break;
		}
	}
}
