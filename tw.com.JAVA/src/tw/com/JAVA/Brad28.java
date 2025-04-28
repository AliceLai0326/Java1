package tw.com.JAVA;

public class Brad28 {
	public static void main(String[] args) {
		Brad281 obj1 = new Brad281();
		Brad281 obj2 = new Brad282();
		Brad281 obj3 = new Brad283();
		obj1.m1();
		obj2.m1();
		Brad282 obj4 = (Brad282)obj2;
		System.out.println(obj2 == obj4);
		obj4.m2();
		System.out.println(obj1 instanceof Brad281);
	}
}
class Brad281{
	void m1() {
		System.out.println("Brad281:m1()");
	}
}
class Brad282 extends Brad281 {
	void m1() {
		System.out.println("Brad282:m1()");
	}
	void m2() {
		System.out.println("Brad282:m2()");
	}
}
class Brad283 extends Brad281 {
	void m1() {
		System.out.println("Brad283:m1()");
	}
	void m3() {
		System.out.println("Brad283:m3()");
	}
}
