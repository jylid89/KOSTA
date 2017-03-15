package array;

public class MainTest {
	public static void main(String[] args) {
	try{
		int su = 4 / 0;
		for (int i = 0; i <= args.length; i++) {
			System.out.println( args[i] );
		}
		System.out.println("점심은?");
		
		return ;
		
	}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("배열예외발생함:" + ex.toString());
	}catch(Exception ex){
			System.out.println("기타예외 : " + ex.getMessage());
	}finally{
			System.out.println("무조건 수행");
		}
			System.out.println("프로그램 정상 종료");
	}
}