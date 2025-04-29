package tw.com.JAVA;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad44 {
	public static void main(String[] args) {
				String mesg = "Hello, Brad\nTest1\n1234567\n7654321\nabcdefg";
				try {
					FileOutputStream fout =
					new FileOutputStream("./dir1/file.txt");
					fout.write(mesg.getBytes());
					fout.close();
					System.out.println("OK");
				} catch (FileNotFoundException e2) {
					System.out.println(e2);
				} catch (IOException e1) {
					System.out.println(e1);
				}

	}
}
