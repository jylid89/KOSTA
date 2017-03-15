package sangsok;

public class Dvd extends Item{
	private String director;
	private String actor;
	
	public Dvd(){
		
	}
	
	public Dvd(String num, String title, String director, String actor){
		super(num, title);
		this.director = director;
		this.actor = actor;
		
	}
	public void print(){
		System.out.println("[" + num + "]" + title + "/" + director + "/" + actor);
	}
}