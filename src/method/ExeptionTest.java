package method;

public class ExeptionTest {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		try{
		method();
		}catch(Exception ex){
			System.out.println("���ܹ߻�:" + ex.getMessage());
		}
		System.out.println("���α׷� ����");
	}
	
	static void method() throws Exception{
		System.out.println("��Ʈ��ũ �۾���");
		throw new UserException();
	}
}