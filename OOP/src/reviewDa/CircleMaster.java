package reviewDa;

import java.util.Scanner;
//import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class CircleMaster {

	Scanner NumInput = new Scanner(System.in);

	protected String InsertWidAndLength;
	protected int [] WidxLength = new int[2];

	public CircleMaster(){
		this.InsertWidAndLength = NumInput.nextLine();
		
		StringTokenizer seperate = new StringTokenizer(InsertWidAndLength);

	for (int i = 0; seperate.hasMoreTokens(); i++) {
		WidxLength[i] = Integer.parseInt(seperate.nextToken());
		}
	}
	public void print(){
		System.out.println("숫자를 잘못 입력하셨습니다");
	}
}
