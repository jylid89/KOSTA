package control;

public class BreakContinue {
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 4; j++) {
				if ( j==2 )
//					break;
					continue;
					System.out.println("<" + i + "," + j + ">");
				}
				System.out.println("µ•¿Ã≈∏");
			}
		}
	}