package casting;

class Appa{}
class Umma{}
class Ddal extends Appa{}

public class CastingTest {
	public static void main(String[] args) {

//		Ddal d = new Ddal();
//		Appa a2 = d;
//		Ddal d2 = (Ddal)a2;			//��Ӱ��迡 ���� ��쿡�� ĳ���� ����
	
		Ddal d = new Ddal();
		if( d instanceof Ddal){							//d��� ��ü�� Ddal�� ��ü�� �³�?(instanceof)
			System.out.println("����ü��");
		}
		if ( d instanceof Object ){
			System.out.println("Object ��ü");
		}
	}
}