package execise;

class Parent{
	final String field = "�θ�Բ�";							//fianl = �����Ұ�, overrinding �Ұ�
	public void jib(){
		System.out.println("�θ�Բ���");
	}
}
class Childs extends Parent{
	Childs(){
//		field = "����";										//�θ�Ŭ���� field�տ� final�ֱ� ������ �����Ұ�
	}
	public void jib(){
		System.out.println("�������� ����");
	}
}
public class FinalTest {

	public static void main(String[] args) {
		Parent p = new Childs();
		System.out.println(p.field);
		p.jib();
	}
}