package sangsok;

abstract public class Item {
	protected String num;				//�ڽ�Ŭ������ ������ �ְ���� �� protected
	protected String title;
	
	public Item(){
		
	}
	
	public Item(String num, String title){
		this.num = num;
		this.title = title;
		
	}
	//########	overloading - Ŭ���� �ȿ��� ���ڸ� �ٸ� ���
	//########	overriding - ��Ӱ��迡�� �޼ҵ� �̸�, ���ڰ� ���� ��
	//public void print(){}
	abstract public void print();				//abstract = �ϼ����� ���� �Լ�
//		System.out.println("["+num + "]" + title);
}