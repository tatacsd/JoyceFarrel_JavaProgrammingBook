package chapter10;

public class TestCustomer {
	public static void main(String[] args) {
		// Ordinary customer
		Customer customerOne=  new Customer(124,123.45);
		
		
		// Preferred customer
		PreferredCustomer customerPOne =  new PreferredCustomer(125, 3456.78, 0.15);
		
		customerOne.display();
		customerPOne.display();
		
	}

}
