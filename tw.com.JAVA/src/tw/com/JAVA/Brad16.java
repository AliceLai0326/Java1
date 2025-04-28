package tw.com.JAVA;

import tw.brad.apis.Bike;

public class Brad16 {

	public static void main(String[] args) {
		Bike bike;
		bike = new Bike();
		bike.upSpeed();bike.upSpeed();bike.upSpeed();
		bike.upSpeed();bike.upSpeed();bike.upSpeed();
		System.out.println(bike.getSpeed());
		bike.downSpeed();bike.downSpeed();
		System.out.println(bike.getSpeed());
		System.out.println("------");
		bike.upSpeed();bike.upSpeed();bike.upSpeed();
		bike.upSpeed();bike.upSpeed();bike.upSpeed();
		bike.upSpeed();bike.upSpeed();
		System.out.println(bike.getSpeed());
	}

}
