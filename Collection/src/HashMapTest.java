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
				System.out.println("아이디 ->");
				String id = input.nextLine();
				System.out.println("비밀번호 ->");
				String pass = input.nextLine();
				
				if ( map.containsKey(id) ) {											//입력받은 아이디가 맵의 key에 있는지
					if ( (map.get(id)).equals(pass) ) {											//해당하는 아이디와 동일 그 key의 value값이 입력받은 패스워드와 같으면
						System.out.println("로그인 성공");
						break;
					} else {										//
						System.out.println("비밀번호가 일치하지 않습니다");
						continue;
					}					
				}else{												//
					System.out.println("존재하지 않는 아이디입니다");
					continue;
			}
		}
	}
}