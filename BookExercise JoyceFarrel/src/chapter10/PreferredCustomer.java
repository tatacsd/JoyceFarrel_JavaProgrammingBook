package chapter10;

public class PreferredCustomer extends Customer {
	double discountRate;
	
	// Constructor
	public PreferredCustomer(int id, double bal, double rate) {
		super(id, bal);
		discountRate = rate;
	}
	
	// Method
	@Override
	public void display() {
		super.display(); // calls the superclass display method
		System.out.println("\tDiscount Rate is " + discountRate);
	}

}
