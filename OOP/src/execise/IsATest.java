package execise;

import java.awt.Button;
import java.awt.Frame;

public class IsATest extends Frame{

	IsATest(){
		super("나의 화면");
		Button b = new Button("OK~~~~");
		add(b);
		setSize(500, 480);
		setVisible(true);
	}
	public static void main(String[] args) {

		IsATest test = new IsATest();
	}
}