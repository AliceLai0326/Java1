package tw.com.JAVA;

public class Brad08 {

	public static void main(String[] args) {
		double temp = Math.random();
		//System.out.println(temp);
		//int score = (int)(temp * 49) +1; //49個數字從0開始，向右位移1
		int score = (int)(temp * 101); //101個數字從0開始
		System.out.println(score);
		
		if (score >= 90) {
			System.out.println("A");
		}else {
			if (score >= 80) {
				System.out.println("B");
			}else {
				if (score >= 70) {
					System.out.println("C");
				}else {
					if (score >= 60) {
						System.out.println("D");
					}else {
						System.out.println("E");
					}
				}
			}

		}

	}

}
