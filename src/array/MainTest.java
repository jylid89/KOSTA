package array;

public class MainTest {
	public static void main(String[] args) {
	try{
		int su = 4 / 0;
		for (int i = 0; i <= args.length; i++) {
			System.out.println( args[i] );
		}
		System.out.println("������?");
		
		return ;
		
	}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("�迭���ܹ߻���:" + ex.toString());
	}catch(Exception ex){
			System.out.println("��Ÿ���� : " + ex.getMessage());
	}finally{
			System.out.println("������ ����");
		}
			System.out.println("���α׷� ���� ����");
	}
}