package set;
import java.util.*;
public class SetTest {

	public static void main(String[] args) {

		Set<String> data = new HashSet<String>();
			data.add("±èÅÂÈñ");
			data.add("¼ÛÇı±³");
			data.add("ÀüÁöÇö");
			data.add("¾ÆÀÌÀ¯");
			data.add("±èÅÂÈñ");
		
			System.out.println( data );
			LinkedList<String> list= new LinkedList<String>( data );
			Collections.sort( list );
			System.out.println( list );
		}
	}