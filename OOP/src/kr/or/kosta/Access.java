package kr.or.kosta;
/* 접근 지정자 */
public class Access {
	private 	String a = "프라이빗";
	public 		String b = "퍼블릭";
				String c = "디폴트";
	protected 	String d = "프로텍티드";
	
	public void output(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}