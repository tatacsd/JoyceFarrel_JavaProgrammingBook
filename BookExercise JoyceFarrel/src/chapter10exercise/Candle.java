package chapter10exercise;
/*
 * 2. Mick’s Wicks makes candles in various sizes. Create a class for the business
named Candle that contains data fields for color, height, and price. Create
get methods for all three fields.

Create set methods for color and height, but not for price. 

Instead, when height is set, determine the price as $2 per inch.
Create a child class named ScentedCandle that contains an additional data
field named scent and methods to get and set it. In the child class, override
the parent’s setHeight() method to set the price of a ScentedCandle object at
$3 per inch. Write an application that instantiates an object of each type and
displays the details. Save the files as Candle.java, ScentedCandle.java, and
DemoCandles.java.
 */
public class Candle {
	// Data fields
	private String color;
	protected double height;
	protected double price;
	
	
	// Setters and getters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
		this.price = height * 2;
		
	}
	public double getPrice() {
		return price;
	}
	
	// Methods
	public void display() {
		System.out.println("The candle: \n Color: " + this.getColor() +
				"\n Height: " + this.getHeight() +
				"\n Price: " + this.getPrice() );
	}
	

}
