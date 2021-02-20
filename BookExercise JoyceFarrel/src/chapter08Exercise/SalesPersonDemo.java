package chapter08Exercise;
/*
		 * 6. a. Create a class named Salesperson. Data fields for Salesperson include
		an integer ID number and a double annual sales amount. Methods
		include a constructor that requires values for both data fields, as well
		as get and set methods for each of the data fields. 
		
		
		Write an application named DemoSalesperson that declares an array of 10 Salesperson
		objects. Set each ID number to 9999 and each sales value to zero. Display
		the 10 Salesperson objects. Save the files as Salesperson.java and
		DemoSalesperson.java
*/

public class SalesPersonDemo {
	public static void main(String[] args) {
		// Declare array of 10 spaces
		final int NUM_SALES = 10;
		SalesPerson[] salesPersonArr = new SalesPerson[NUM_SALES];
		for(int i = 0; i < NUM_SALES; i++) {
			salesPersonArr[i] = new SalesPerson(9999, 0);
		}
		
		
		// Display all sales person
		for(SalesPerson elemento : salesPersonArr)
			System.out.println("Number ID: " + elemento.getNumberID() + " and annual sales amount: " + elemento.getAnnualSales());
		
		
	}

}
