package method;

public class ExeptionTest {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try{
		method();
		}catch(Exception ex){
			System.out.println("예외발생:" + ex.getMessage());
		}
		System.out.println("프로그램 종료");
	}
	
	static void method() throws Exception{
		System.out.println("네트워크 작업중");
		throw new UserException();
	}
}