package operator;

public class LunarYear {

	public static void main(String[] args) {

		// ������ 4�⸶�� �̰� 100�⸶�ٴ� �ƴϰ� 400�⸶�� �����Դϴ�
		int year = 2801;
		if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("�����Դϴ�");
		}else {
			System.out.println("����Դϴ�");
		}

	}

}
