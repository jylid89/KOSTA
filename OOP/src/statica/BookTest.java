package statica;
class book {
	private static int count;					//heap �ٸ� �� ���� ���� ---- �޸� ������ ����
	public book(){
		count++;
	
	}
	public static int getCoung(){				//��ü�������� �ʰ� Ŭ���������� �����ϰ� �;
		return count;
	}
}

public class BookTest {

	public static void main(String[] args) {
	
//		book b1 = new book();								
//		System.out.println(b1.count + " ��");
//		book b2 = new book();								
//		System.out.println(b2.count + " ��");
		book b3 = new book();
		System.out.println(book.getCoung() + " ��");
		System.out.println(b3.a);
		
	}
}