package inner;

/* Inner class : Ŭ���� ���� Ŭ���� */
class Outer{
	static class Inner{													//Ŭ���� ���� Ŭ������ ��� �׷��� ������ static�� ����
		static void najabara(){
			System.out.println("��ƺ���");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
//		Outer out = new Outer();
//		Outer.Inner in = out.new Inner();
//		Outer.Inner in = new Outer.Inner();
//		in.najabara();
		Outer.Inner.najabara();
	}
}