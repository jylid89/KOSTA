package thread;

public class RunnableTest {

	public static void main(String[] args) {
		new Thread(new MakeCar2("��Ʋ �����")).start();													//(3) start() �̿��ؼ� run() ȣ��
//		MakeCar2 mc2 = new MakeCar2("��������");
		new Thread(new MakeCar2("��������")).start();		
	}
}

class MakeCar2 implements Runnable{										//(1)Runnable ����
	String work;
	MakeCar2(String work){ this.work = work;}
		public void run(){												//(2) run() overriding
			for (int i = 0; i < 5; i++) {
				System.out.println( work + "�۾���" );
				try { Thread.sleep(500); } catch(Exception ex){}
		}				
	}
}