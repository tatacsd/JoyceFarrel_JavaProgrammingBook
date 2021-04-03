package chapter10;

public class Customer {
	// Data field
	private int idNumber;
	private double balancedWowed;
	
	// Constructor
	public Customer (int id, double bal) {
		idNumber = id;
		balancedWowed = bal;
	}
	
	// Methods
	public void display() {
		System.out.println("Custormer #" + idNumber + " Balance $" + balancedWowed);
	}

}
