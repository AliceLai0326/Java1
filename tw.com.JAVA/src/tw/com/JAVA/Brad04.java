package tw.com.JAVA;

import java.util.Scanner;

public class Brad04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("X = ");
		int x = scanner.nextInt();
		System.out.print("U = ");
		int u = scanner.nextInt();
		
		int var1 = x + u;
		int var2 = x - u;
		int var3 = x * u;
		int var4 = x / u;
		int var5 = x % u;
		
		System.out.printf("%d + %d = %d\n", x, u, var1);
		System.out.printf("%d - %d = %d\n", x, u, var2);
		System.out.printf("%d * %d = %d\n", x, u, var3);
		System.out.printf("%d / %d = %d ... %d\n", x, u, var4, var5);
	}
	
	

}
