package review;

public class DB {

	static DB db = null;
	
	public static DB getInstance(){
		
		if ( db == null ) {	
			db = new DB();
		}
			return db;
	}
	
	private DB(){
		System.out.println("���� ��� ����");
	}	
}