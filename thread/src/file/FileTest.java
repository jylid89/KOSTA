package file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {

		File f = new File("c:\\imsi");
		File list[] = f.listFiles();
		for (int i = 0; i < list.length; i++) {
			File temp = list[i];
			if (temp.isDirectory()) {
				System.out.println("[" + temp.getName() + "]");
			}else if(temp.isFile()){
				System.out.println(temp.getName() + "\t" + temp.length()+ " byte");
			}
		}
		
		File f2 = new File("c:\\imsi\\x.txt");
		try {
			f2.createNewFile();
		} catch (IOException e) {
		}
		File f3 = new File("c:\\imsi\\x.txt");
		f3.delete();
	}
}