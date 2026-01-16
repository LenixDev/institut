package espace;

public class Vehicle {

	public void fullThrouttle() {
		System.out.println("The car is going as fast as it can!");
	}
	
	public void speed(int maxSpeed) {
		System.out.print("Max speed is: " + maxSpeed);
	}
	
	public static void main(String[] args) {
		Vehicle myCar = new Vehicle();
		myCar.fullThrouttle();
		myCar.speed(200);
	}

}
