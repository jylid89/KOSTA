package thread;

public class ThreadTest {

	public static void main(String[] args) {
		MakeCar1 mc1 = new MakeCar1("��Ʋ�����");
		mc1.start();											//( 3 )start() �̿��ؼ� Thread�� run() ȣ��
		MakeCar1 mc2 = new MakeCar1("��������");
		mc2.start();
	}
}

class MakeCar1 extends Thread{									//( 1 ) thread Ŭ���� ���
	String work;
	MakeCar1(String _work) {
		work = _work;
	}
	public void run(){											//( 2 ) run() �������̵�
		for (int i = 0; i < 5; i++) {
			System.out.println(work + "�۾���");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//end of try-catch
		}//end of for - i
	}//end of run
}//end of Class