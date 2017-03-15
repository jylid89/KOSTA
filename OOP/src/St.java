public class St {

abstract static class  Parent{
     abstract public void method();
}
public static class Child extends Parent {
	public void method() {
		System.out.println("aaa");
	}

public static void main( String [] args ) {
    Parent  p = new Child( );
    p.method();
    Child   c = new Child();
    c.method();
}
}
}