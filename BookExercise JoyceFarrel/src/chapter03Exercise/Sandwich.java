package chapter03Exercise;
/*
			 * .
			11. a. Create a class named Sandwich. Data fields include a String for the main
			ingredient (such as tuna), a String for bread type (such as wheat), and a
			double for price (such as 4.99). Include methods to get and set values for
			each of these fields. Save the class as Sandwich.java.
 */

public class Sandwich {
	// Data fields
	private String mainIngredient = "tuna";
	private String breadType = "wheat";
	double price = 4.99;
	
	// Default constructor
	public Sandwich() {
	}
	
	// Get main ingredient
	public String getMainIngredient() {
		return mainIngredient;
	}
	
	// Get bread Type
	public String getBreadType() {
		return breadType;
	}
	
	// Get price
	public double getPrice() {
		return price;
	}
	
	// Set main ingredient
	public void setMainIngredient(String mainIngredient) {
		this.mainIngredient = mainIngredient;
	}
	
	// Set bread Type
	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}
	
	// Set price
	public void setPrice(double price) {
		this.price = price;
	}

}
