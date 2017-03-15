package basic.ex;

public class synchTest {

	public static void main(String[] args) {
		Count cnt = new Count();
		ThreadCount tc = new ThreadCount(cnt);
		tc.start();
		
		ThreadCount tc2 = new ThreadCount(cnt);
		tc2.start();
				
		try {
			tc.join();														//join -> thread가 끝날 때까지 기다려줌
			tc2.join();
		} catch (Exception e) {}
		System.out.println("i의 값은" +  cnt.i);		
	}
}

class Count{
	int i;
	/*synchronized*/ void increment()										//다중 접근을 막을 수 있음(동기화)
		{ synchronized(this){ i++;											//클래스 자체에 걸면 속도가 느려질 수 있기 때문에 필요한 부분에만 따로 적용할 수 있음 !!!반드시 객체를 걸어줘야함!!!
		}								
	}
}
	class ThreadCount extends Thread{
		Count cnt;
		ThreadCount(Count cnt){
			this.cnt = cnt;
		}
		public void run(){
			for (int i = 0; i < 100000000; i++) {
				cnt.increment();
		}
	}
}