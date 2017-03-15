package execise;

class Parent{
	final String field = "부모님꺼";							//fianl = 수정불가, overrinding 불가
	public void jib(){
		System.out.println("부모님꺼임");
	}
}
class Childs extends Parent{
	Childs(){
//		field = "내꺼";										//부모클래스 field앞에 final있기 때문에 수정불가
	}
	public void jib(){
		System.out.println("내집으로 만듬");
	}
}
public class FinalTest {

	public static void main(String[] args) {
		Parent p = new Childs();
		System.out.println(p.field);
		p.jib();
	}
}