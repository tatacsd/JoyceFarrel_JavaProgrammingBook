package chapter10exercise;
/*
 * Create a TeeShirt class for Toby’s Tee Shirt Company. Fields include an order
number, size, color, and price. Create set methods for the order number, size,
and color and get methods for all four fields. 

The price is determined by the size: $22.99 for XXL or XXXL, and $19.99 for all other sizes. 

Create a subclass named CustomTee that descends from TeeShirt and includes a field to hold the
slogan requested for the shirt, and include get and set methods this field. Write
an application that creates two objects of each class, and demonstrate that all the
methods work correctly. Save the files as TeeShirt.java, CustomTee.java, and
DemoTees.java
 */

public class TeeShirt {
	// Data field
	private int number;
	private String size;
	private String color;
	private double price;
	
	// Setters and Getters
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size.toUpperCase();
		
		if(size.equalsIgnoreCase("XXL") || size.equalsIgnoreCase("XXL")) {
			this.price = 22.99;
		} else {
			this.price = 19.99;
		}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	// Methods
	public void display() {
		System.out.println("Tee number: " + this.getNumber() + 
				" size: " + this.getSize() +
				" color: " + this.getColor() + 
				" price: " + this.getPrice() );
	}
	
	
	
	

}
