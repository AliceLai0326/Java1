package tw.com.JAVA;

import java.io.File;

public class Brad43 {
	public static void main(String[] args) {
		File f1 = new File(".");
		System.out.println(f1.getAbsolutePath());
		File dir1 =new File("./dir1/file.txt");
		System.out.println(dir1.exists());
	}
}
