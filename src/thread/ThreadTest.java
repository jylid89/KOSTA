package thread;

public class ThreadTest {

	public static void main(String[] args) {
		MakeCar1 mc1 = new MakeCar1("차틀만들기");
		mc1.start();											//( 3 )start() 이용해서 Thread의 run() 호출
		MakeCar1 mc2 = new MakeCar1("엔진부착");
		mc2.start();
	}
}

class MakeCar1 extends Thread{									//( 1 ) thread 클래스 상속
	String work;
	MakeCar1(String _work) {
		work = _work;
	}
	public void run(){											//( 2 ) run() 오버라이딩
		for (int i = 0; i < 5; i++) {
			System.out.println(work + "작업중");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//end of try-catch
		}//end of for - i
	}//end of run
}//end of Class