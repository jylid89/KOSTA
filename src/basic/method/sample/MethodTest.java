package basic.method.sample;

public class MethodTest {
	public static void main(String[] args) {
		
		int a = 10 , b = 20;
		int sum = addInt(a, b);  //인자를 보내겠다 / call by value
		System.out.println("a=" +a +", b" + b + " " + sum);
		StringBuffer sb1 = new StringBuffer ("인혁씨 ");
		StringBuffer sb2 = new StringBuffer ("점심 뭐드실거?");
			//StringBuilder 거의 유사하지만 직렬화 X
		
		addStr( sb1, sb2); // call by reference
		System.out.println("sb1= " + sb1 + ", sb2= " + sb2 );
	
		String s = new String("태범씨 반가");
		String t = new String("점심드셨어요");
		
		add(s, t); //call by reference (예외 or 특성)
					
		System.out.println("s= "+s + ", t=" + t);
	}	
	
	static void add( String s, String t ){
		s += t;  //String에서는 가능
		System.out.println("S= "+s + ", T=" + t);
		
	}
	
	static void addStr( StringBuffer sb1, StringBuffer sb2 ){
		sb1.append(sb2); //sb1+=sb2
		System.out.println("SB1= " + sb1 + ", SB2= " + sb2 );
	}
	
	// 두 정수값을 받아서 더하는 함수
	static int addInt(int a, int b){
		
		a += b;
		System.out.println("A= " +a + ", B=" + b);
		
		return a; // 15라인까지 수행한 것을 
	}
}