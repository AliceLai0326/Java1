package tw.com.JAVA;

public class Brad40 {
	public static void main(String[] args) {
		m1();
		System.out.println("Finish");

	}
	static void m1() {
		int a = 10, b = 3;
		try {
			System.out.println(a / b);
			return;
		}catch (Exception e) {
			System.out.println("XX");
		}finally {
			System.out.println("Finally");
		}
		System.out.println("End");
	}
}
