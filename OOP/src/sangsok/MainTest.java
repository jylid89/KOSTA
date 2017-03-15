package sangsok;

public class MainTest {

	public static void main(String[] args) {
		
//		Item i = new ("0000", "자바");
//		i.print();
//		
//		Book b2 = new Book();
//		b2.output();
//		b2.print();
		
		Item b = new Book("0002", "자바", "김씨", "코스타"); 	//부모가 있는데 변경 (overriding method)
		b.print();											//무조건 오버라이딩 된 자식의 결과가 내려옴
		
		Dvd d = new Dvd("0003","ddd", "ddd", "ddd");
		d.print();
		
		Cd c = new Cd();
		c.print();
		
	}
}