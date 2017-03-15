package execise;

import java.awt.Button;
import java.awt.Frame;

public class HasATest {

	HasATest(){
		Frame f = new Frame("나의 첫 화면");
		Button b = new Button("확인");
		f.add(b);
		f.setSize(400, 300);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		HasATest test = new HasATest();
	}
}