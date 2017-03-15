package basic.ex;

public class ThreadStopTest {

	public static void main(String[] args) {
		ThreadStop ts = new ThreadStop();
		ts.start();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		ts.isFlag = true;
		System.out.println("프로그램 종료");
	}//end of main
}//end of TreadStopTest class

class ThreadStop extends Thread {
	boolean isFlag;
		
	public void run(){
		while( !isFlag ){															//thread는 반복문
			System.out.println( getName() + "작업을 진행합니다" );							
			try{
				Thread.sleep(500);
			}catch(InterruptedException ex){				
			}catch(ThreadDeath ex)	{
				System.out.println("예외에 의해 멈춤");
			}																		//end of catch
		}																			//end of while
	}																				//end of run
}																					//end of Threadstop