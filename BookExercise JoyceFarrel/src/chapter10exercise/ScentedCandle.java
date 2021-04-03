package chapter10exercise;

/*
 * Create a child class named ScentedCandle that contains an additional data
field named scent and methods to get and set it. 
In the child class, override
the parent’s setHeight() method to set the price of a ScentedCandle object at
$3 per inch. Write an application that instantiates an object of each type and
displays the details. Save the files as Candle.java, ScentedCandle.java, and
DemoCandles.java.
 */
public class ScentedCandle extends Candle {
	private String scent;

	public String getScent() {
		return scent;
	}

	public void setScent(String scent) {
		this.scent = scent;
	}
	@Override
	public void setHeight(double height) {
		this.height = height;
		this.price = height * 3;
		
	}
	
	// Methods
	@Override
	public void display() {
		System.out.println("The candle: \n Color: " + this.getColor() +
				"\n Scent: " + this.getScent() + 
				"\n Height: " + this.getHeight() +
				"\n Price: " + this.getPrice() );
	}

}
