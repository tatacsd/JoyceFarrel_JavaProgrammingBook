package chapter08Exercise;

/*
				 * 6. a. Create a class named Salesperson. Data fields for Salesperson include
				an integer ID number and a double annual sales amount. Methods
				include a constructor that requires values for both data fields, as well
				as get and set methods for each of the data fields. Write an application
				named DemoSalesperson that declares an array of 10 Salesperson
				objects. Set each ID number to 9999 and each sales value to zero. Display
				the 10 Salesperson objects. Save the files as Salesperson.java and
				DemoSalesperson.java
 */

public class SalesPerson {
	// Data field
	private int numberID;
	private double annualSales;
	
	// Constructor
	public SalesPerson(int numberID, double annualSales) {
		this.numberID = numberID;
		this.annualSales = annualSales;
	}

		
	// Getters and Setters
	public int getNumberID() {
		return numberID;
	}

	public void setNumberID(int numberID) {
		this.numberID = numberID;
	}

	public double getAnnualSales() {
		return annualSales;
	}

	public void setAnnualSales(double annualSales) {
		this.annualSales = annualSales;
	}
	

}
