package equal;

public class StringEqualTest {

	public static void main(String[] args) {
		String s = new String("�ұ�");
		String s2 = new String("�ұ�");
		
		if ( s == s2 ) {
			System.out.println("�ּ� ����");
		}else System.out.println("�ּ� �ٸ���");
		if ( s.equals(s2) ) {
			System.out.println("���� ����");
		}else System.out.println("���� �ٸ���");
		
		StringBuffer sb = new StringBuffer("���ı���");			//StringBufferŬ������
		StringBuffer sb2 = new StringBuffer("���ı���");
		if (s.equals(s2)) {
			System.out.println("---���배��");
		}else System.out.println("---���� �ٸ���");
	}
}