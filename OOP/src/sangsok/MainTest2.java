package sangsok;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		
		Item i = null;
		
		System.out.println("��ǰ������ ����(1.å 2.DVD 3.CD"));
		Scanner input = new Scanner(System.in);
		
		int sel = input.nextInt();
		
		switch(sel){
		case 1 : i = new Book("0001", "�ڹ�", "�达", "�ڽ�Ÿ"); break;
		case 2 : i = new Dvd("0002", "��ȭ", "���", "����"); break;
		case 3 : i = new Cd("0003", "����", "����"); break;		
		}
		
		i.print();				//#######������ ���� = �������̵�
	}

}