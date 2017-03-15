package method;

//예외클래스
public class UserException extends Exception {
		
	public String getMessage(){
		return "네트워크 예외가 심하게 발생";
	}
}