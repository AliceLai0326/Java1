package tw.com.JAVA;

public class Brad21 {
	public static void main(String[] args) {
		Brad213 obj = new Brad213((byte)1);
	}
}
class Brad211 {
	Brad211(String a){
		//super();
	}
}
class Brad212 extends Brad211{
	Brad212(int a){
		super("");
		System.out.println("Brad212");
	}
}
class Brad213 extends Brad212{
	Brad213(){
		super(1);
		System.out.println("A");
	}
	Brad213(int a){
		super(1);
		System.out.println("B");
	}
//	Brad213(byte a){
//		super(1);
//		System.out.println("C");
//	}
	Brad213(double a){
		super(1);
		System.out.println("D");
	}
}