import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueTest {

	public static void main(String[] args) {

		Stack<String> s = new Stack<String>();
		s.push("��");
		s.push("��");
		s.push("��");
		
		while( !s.isEmpty() ){							//s,size()>0	���� ���� �����͸� �� ��
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