package review;

public class UserA {

	public UserA(){
		DB db = DB.getInstance();
		
	}
	
	public void use(){
		System.out.println("디비 사용중");
	}
}