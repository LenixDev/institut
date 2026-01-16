package espace;

public class Point {
	String fname = "John";
	String lname = "Doe";
	int age = 24;

	public static void main(String[] args) {
		Point myObject = new Point();
		System.out.println("Name: " + myObject.fname + " " + myObject.lname);
		System.out.print("Age: " + myObject.age);
	}
}