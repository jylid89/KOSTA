
public class StT {

	public static void main(String[] args) {
		  int x = Integer.parseInt( args[0] );
          int y = Integer.parseInt( args[1] );
   int a, b, c, d;
          if ( x < y ) {   a = 11;  b = 22 ;  }
          else {  b = 11;  a = 22 ;  }
          if ( x < y ) {  c = 33; }
          try {
                     d = 44;
          } catch ( Exception ex ) { }
          System.out.println ( a )  - - - - - (1)
          System.out.println ( b )  - - - - - (2)
          System.out.println ( c )  - - - - - (3)
          System.out.println ( d )  - - - - - (4)
	}

}
