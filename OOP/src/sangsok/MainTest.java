package sangsok;

public class MainTest {

	public static void main(String[] args) {
		
//		Item i = new ("0000", "�ڹ�");
//		i.print();
//		
//		Book b2 = new Book();
//		b2.output();
//		b2.print();
		
		Item b = new Book("0002", "�ڹ�", "�达", "�ڽ�Ÿ"); 	//�θ� �ִµ� ���� (overriding method)
		b.print();											//������ �������̵� �� �ڽ��� ����� ������
		
		Dvd d = new Dvd("0003","ddd", "ddd", "ddd");
		d.print();
		
		Cd c = new Cd();
		c.print();
		
	}
}