package sangsok;

public class Book extends Item{
	private String writer;
	private String publisher;
	
	public Book(){
//		super();
//		this("0000", "제목없음", "미상", "모름");
	}
	
	public Book(String num, String title, String writer, String publisher){
		super(num, title);
		this.writer = writer;
		this.publisher = publisher;
		
	}
	
	public void print(){
		System.out.println("[" + num + "]" + title + "/" + writer + "/" + publisher);
	}
}