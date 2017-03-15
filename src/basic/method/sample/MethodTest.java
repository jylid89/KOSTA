package basic.method.sample;

public class MethodTest {
	public static void main(String[] args) {
		
		int a = 10 , b = 20;
		int sum = addInt(a, b);  //���ڸ� �����ڴ� / call by value
		System.out.println("a=" +a +", b" + b + " " + sum);
		StringBuffer sb1 = new StringBuffer ("������ ");
		StringBuffer sb2 = new StringBuffer ("���� ����ǰ�?");
			//StringBuilder ���� ���������� ����ȭ X
		
		addStr( sb1, sb2); // call by reference
		System.out.println("sb1= " + sb1 + ", sb2= " + sb2 );
	
		String s = new String("�¹��� �ݰ�");
		String t = new String("���ɵ�̾��");
		
		add(s, t); //call by reference (���� or Ư��)
					
		System.out.println("s= "+s + ", t=" + t);
	}	
	
	static void add( String s, String t ){
		s += t;  //String������ ����
		System.out.println("S= "+s + ", T=" + t);
		
	}
	
	static void addStr( StringBuffer sb1, StringBuffer sb2 ){
		sb1.append(sb2); //sb1+=sb2
		System.out.println("SB1= " + sb1 + ", SB2= " + sb2 );
	}
	
	// �� �������� �޾Ƽ� ���ϴ� �Լ�
	static int addInt(int a, int b){
		
		a += b;
		System.out.println("A= " +a + ", B=" + b);
		
		return a; // 15���α��� ������ ���� 
	}
}