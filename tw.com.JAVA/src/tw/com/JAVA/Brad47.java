package tw.com.JAVA;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad47 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileOutputStream fout = new FileOutputStream("dir2/cafe1.jpg");
			FileInputStream fin = new FileInputStream("dir1/coffee2.jpg");
			int c; 
			while ( (c = fin.read()) != -1) {
				fout.write(c);
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("OK");
			System.out.println(System.currentTimeMillis() - start);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}