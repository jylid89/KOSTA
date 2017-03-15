package thread;

public class ProcessTest {

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("C:\\Program Files\\Internet Explorer\\iexplore.exe");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}