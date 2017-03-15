package casting;

class Appa{}
class Umma{}
class Ddal extends Appa{}

public class CastingTest {
	public static void main(String[] args) {

//		Ddal d = new Ddal();
//		Appa a2 = d;
//		Ddal d2 = (Ddal)a2;			//상속관계에 있을 경우에만 캐스팅 가능
	
		Ddal d = new Ddal();
		if( d instanceof Ddal){							//d라는 객체가 Ddal의 객체가 맞나?(instanceof)
			System.out.println("딸객체임");
		}
		if ( d instanceof Object ){
			System.out.println("Object 객체");
		}
	}
}