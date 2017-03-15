package thread;

public class RunnableTest {

	public static void main(String[] args) {
		new Thread(new MakeCar2("차틀 만들기")).start();													//(3) start() 이용해서 run() 호출
//		MakeCar2 mc2 = new MakeCar2("엔진부착");
		new Thread(new MakeCar2("엔진부착")).start();		
	}
}

class MakeCar2 implements Runnable{										//(1)Runnable 구현
	String work;
	MakeCar2(String work){ this.work = work;}
		public void run(){												//(2) run() overriding
			for (int i = 0; i < 5; i++) {
				System.out.println( work + "작업중" );
				try { Thread.sleep(500); } catch(Exception ex){}
		}				
	}
}