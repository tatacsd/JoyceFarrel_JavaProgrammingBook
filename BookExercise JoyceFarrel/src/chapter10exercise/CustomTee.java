package chapter10exercise;

/*
 * Create a subclass named CustomTee that descends from TeeShirt and includes a field to hold the
slogan requested for the shirt, and include get and set methods this field. 
Write an application that creates two objects of each class, and demonstrate that all the
methods work correctly. Save the files as TeeShirt.java, CustomTee.java, and
DemoTees.java
 */
public class CustomTee extends TeeShirt {
	// Data field
	private String slogan;

	// Setters and getters
	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	
	// Methods
	@Override
	public void display() {
	System.out.println("Tee number: " + this.getNumber() +
			" slogan: " + this.getSlogan() +
			" size: " + this.getSize() +
			" color: " + this.getColor() + 
			" price: " + this.getPrice() );
	}
	

}
