package util;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {

		Scanner sen = new Scanner(System.in);
			System.out.println("ÀÔ·ÂÇØ");

		String str = sen.nextLine();
		
		StringTokenizer st = new StringTokenizer(str);
		
			int num = 0;
			
		while( st.hasMoreTokens() ){
			String temp = st.nextToken();
		if (temp != null) {
			num++;
				}
			}
		System.out.println(num);
		}
	}



//String str = "¿À´ÃdÁ¡½Éd¹¹µå¼Ìd¾îd¿ä";
//StringTokenizer st = new StringTokenizer(str, "d");
//while( st.hasMoreTokens() ){
//	String temp = st.nextToken();
//	System.out.println(temp);