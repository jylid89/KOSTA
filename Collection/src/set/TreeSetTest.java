package set;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();							//처음부터 정렬이 된다
			set.add("elephant");
			set.add("fox");
			set.add("dog");
			set.add("cat");
			set.add("horse");
			set.add("bee");
			set.add("zibra");
			set.add("tiger");
			set.add("snack");
		
		System.out.println(set);
		System.out.println(set.subSet("d", "s"));
		System.out.println( set.headSet("e"));
		System.out.println(set.tailSet("e"));
		
	}
}