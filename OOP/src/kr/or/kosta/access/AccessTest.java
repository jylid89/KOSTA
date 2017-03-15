package kr.or.kosta.access;

import kr.or.kosta.Access;

public class AccessTest extends Access{

	public static void main(String[] args) {
		
//		Access a = new Access();
		AccessTest a = new AccessTest();
		//a.a = "프라이빗접근";
		a.b = "퍼블릭접근";
		//a.c = "디폴트접근";
		a.d = "프로텍티드접근";
		
		a.output();
	}
}