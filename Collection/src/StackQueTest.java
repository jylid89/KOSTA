import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueTest {

	public static void main(String[] args) {

		Stack<String> s = new Stack<String>();
		s.push("가");
		s.push("나");
		s.push("다");
		
		while( !s.isEmpty() ){							//s,size()>0	먼저 들어온 데이터를 후 출
			System.out.println(s.pop());
		}
		Queue<String> q = new LinkedList<String>();
			q.offer("A");
			q.offer("B");
			q.offer("C");
			while ( !q.isEmpty() ) {
				System.out.println(q.poll());
		}
	}
}