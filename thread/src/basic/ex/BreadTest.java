package basic.ex;

class Bread{
	String bread;
	boolean isCheck = false;
	
	void setBread(String bread){
		this.bread = bread;
		isCheck = true;
		synchronized (this) {
			notifyAll();												//run에서 blocked로 옮겨져 있던 작업을 불러올때
		}
	}
	String getBread(){
		if (isCheck == false) {
			try {
				synchronized(this){
					wait();												//run -> block(sleep은 자동으로 내려오지만 wait는 올려놓기만 함)
				}
			} catch (Exception e) {
		  }
		}
		return bread;
	}
}

class Baker extends Thread{
	Bread bbang;
	Baker (Bread bbang){
		this.bbang = bbang;
	}
	public void run(){
		bbang.setBread("맛있는 빵");
	}
}

class Customer extends Thread{
	Bread bbang;
	Customer(Bread bbang){
		this.bbang = bbang;
	}
	public void run(){
		System.out.println("빵을 사러 옴: " + bbang.getBread());
	}
}

public class BreadTest {
	public static void main(String[] args) {
		Bread bread = new Bread();
		Baker baker = new Baker(bread);
		Customer customer = new Customer(bread);
		
		customer.start();
		baker.start();
	}
}