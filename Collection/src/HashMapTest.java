import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
			map.put("javassem", "1111");
			map.put("kimssem", "1111");
			map.put("javababo", "1234");
			map.put("javababo", "3333");					//
			
		Scanner input = new Scanner(System.in);
			while (true) {
				System.out.println("���̵� ->");
				String id = input.nextLine();
				System.out.println("��й�ȣ ->");
				String pass = input.nextLine();
				
				if ( map.containsKey(id) ) {											//�Է¹��� ���̵� ���� key�� �ִ���
					if ( (map.get(id)).equals(pass) ) {											//�ش��ϴ� ���̵�� ���� �� key�� value���� �Է¹��� �н������ ������
						System.out.println("�α��� ����");
						break;
					} else {										//
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
						continue;
					}					
				}else{												//
					System.out.println("�������� �ʴ� ���̵��Դϴ�");
					continue;
			}
		}
	}
}