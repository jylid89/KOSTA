package ex;

import java.util.Scanner;

public class LangSel {

	public static void main(String[] args) {

		String re = "Y";

		while( re.equals("Y") | re.equals("y") ){

			Lot i = null;

			System.out.println("�� �����ϼ���. (1. �ѱ��� 2. ���� 3. �Ϻ���)");
			Scanner input = new Scanner(System.in);

			int sel = input.nextInt();

			switch(sel){
			case 1 : i = new KorSel(); break;
			case 2 : i = new EngSel("Hello"); break;
			case 3 : i = new JpnSel("����˪���"); break;
			}

			i.print();

			System.out.println("�ٽ� �Ͻðڽ��ϱ�(Y/N)");
			re = input.next();
			
		}
	}
}