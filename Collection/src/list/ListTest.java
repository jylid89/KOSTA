package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {

		ArrayList data = new ArrayList();	//������ �迭
			data.add("������");
			data.add("������");
			data.add("������");
			data.add("������");
			data.add("������");
								
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
		System.out.println( data );

		data.remove(0);
		System.out.println( data );

		data.set(2, "����");
		System.out.println( data );
		
		Collections.sort( data );
		System.out.println( data );
	}
}
//		String [] data = new String [3];			
//			data[0] = "������";
//			data[1] = "������";
//			data[2] = "������";
//			data[3] = "������";
//			
//			for (int i = 0; i < data.length; i++) {
//				System.out.println(data[i]);
//		}