package execise;

public class DaTest {

	public static void main(String[] args) {
		Object [] obj = method();
		for (int i = 0; i < obj.length; i++) {
			System.out.println( obj[i].toString());
		}		
	}
	static Object [] method(){
		char c = 'วั';
		int i = 100;
		double d = 36.5;
		Object [] data = new Object[3];
		data[0] = new Character(c);
		data[1] = new Integer(i);
		data[2] = new Double(d);
		
		return data;
	}
}