package operator;

public class LunarYear {

	public static void main(String[] args) {

		// 윤년은 4년마다 이고 100년마다는 아니고 400년마다 윤년입니다
		int year = 2801;
		if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다");
		}else {
			System.out.println("평년입니다");
		}

	}

}
