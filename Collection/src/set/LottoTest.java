package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class LottoTest {

	public static void main(String[] args) {

		HashSet<Integer> lotto = new HashSet<Integer>();		//<>제네릭스
		for (int i = 0; lotto.size() < 6; i++) {
			lotto.add( (int)(Math.random() * 45 ) +1 );
		}
		
		LinkedList<Integer> lottoList = new LinkedList<Integer>(lotto);
		Collections.sort( lottoList );
		System.out.println( lottoList );		
	}
}