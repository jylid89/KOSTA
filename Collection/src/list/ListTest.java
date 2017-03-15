package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {

		ArrayList data = new ArrayList();	//µ¿ÀûÀÎ ¹è¿­
			data.add("±èÅÂÈñ");
			data.add("¼ÛÇı±³");
			data.add("ÀüÁöÇö");
			data.add("¾ÆÀÌÀ¯");
			data.add("±èÅÂÈñ");
								
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
		System.out.println( data );

		data.remove(0);
		System.out.println( data );

		data.set(2, "°øÀ¯");
		System.out.println( data );
		
		Collections.sort( data );
		System.out.println( data );
	}
}
//		String [] data = new String [3];			
//			data[0] = "±èÅÂÈñ";
//			data[1] = "¼ÛÇı±³";
//			data[2] = "ÀüÁöÇö";
//			data[3] = "¾ÆÀÌÀ¯";
//			
//			for (int i = 0; i < data.length; i++) {
//				System.out.println(data[i]);
//		}