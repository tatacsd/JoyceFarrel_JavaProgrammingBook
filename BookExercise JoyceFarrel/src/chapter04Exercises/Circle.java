package chapter04Exercises;
/*
 * 6. a. Create a class named Circle with fields named radius, diameter, and area.
 * Include a constructor that sets the radius to 1 and calculates the other two
 * values. Also include methods named setRadius() and getRadius(). 
 * 
 * 
 * The setRadius() method not only sets the radius, but it also calculates the other
 * two values. (The diameter of a circle is twice the radius, and the area of a circle 
 * is pi multiplied by the square of the radius. Use the Math class PI constant
 * for this calculation.) Save the class as Circle.java
 */

public class Circle {
	// Data fields
	private double radius;
	private double diameter;
	private double area;
	
	public Circle() {
		setRadius(1);
	}

	
	// setters and getters
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
		
		// calculates the other two values.
		this.diameter = 2 * this.radius;
		this.area = Math.PI * Math.pow(radius, 2);
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}


	@Override
	public String toString() {
		return "radius: " + radius + ", diameter:" + diameter + ", area:" + area;
	}
	
	
	
	

}
