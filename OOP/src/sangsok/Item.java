package sangsok;

abstract public class Item {
	protected String num;				//자식클래스에 권한을 주고싶을 때 protected
	protected String title;
	
	public Item(){
		
	}
	
	public Item(String num, String title){
		this.num = num;
		this.title = title;
		
	}
	//########	overloading - 클새스 안에서 인자만 다른 경우
	//########	overriding - 상속관계에서 메소드 이름, 인자가 같을 때
	//public void print(){}
	abstract public void print();				//abstract = 완성되지 않은 함수
//		System.out.println("["+num + "]" + title);
}