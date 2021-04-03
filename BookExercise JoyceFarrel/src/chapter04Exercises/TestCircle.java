package chapter04Exercises;
/*
 * b. Create a class named TestCircle whose main() method declares several
 * Circle objects. Using the setRadius() method, assign one Circle a
 * small radius value, and assign another a larger radius value. Do not assign
 * a value to the radius of the third circle; instead, retain the value assigned
 * at construction. Display all the values for all the Circle objects. 
 * Save the application as TestCircle.java.
 */

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		
		c1.setRadius(5);
		c2.setRadius(25);
		
		
		// Display all
		System.out.println("Circle One:\n" + c1);
		System.out.println("Circle Two:\n" + c2);
		System.out.println("Circle Three:\n" + c3);
	}
}
