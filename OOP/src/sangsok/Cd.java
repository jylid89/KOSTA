package sangsok;

public class Cd extends Item {
	private String singer;

	public Cd(){
		
	}
	
	public Cd(String num, String title, String singer){
		super(num, title);
		this.singer = singer;
	}
	
	public void print(){ 											//overriding
		System.out.println("[" + num + "]" + title + "/" + singer);	
		}
}