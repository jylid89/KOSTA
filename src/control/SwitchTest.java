package control;

public class SwitchTest {
	public static void main(String[] args) {
		int i = 1, j = 0;
		switch (i) {
			case 2 : j+=6;
			break;
			case 4 : j+=1;
			break;
			default: j+=2;
			break;
			case 0 : j+=4;
			break;
		}
		System.out.println("j=====" + j); 	 // 
	}
}