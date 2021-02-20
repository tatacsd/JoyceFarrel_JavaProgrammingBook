package chapter08Exercise;
/*
		 * 6.  b. Modify the DemoSalesperson application so each Salesperson has
				a successive ID number from 111 through 120 and a sales value that
				ranges from $25,000 to $70,000, increasing by $5,000 for each successive
				Salesperson. Save the file as DemoSalesperson2.java
*/

public class SalesPersonDemo2 {
	public static void main(String[] args) {
		// Declare variables
		final int NUM_SALES = 10;
		final int START_NUM = 111;
		final double RANGE = 5_000;
		double salesAmount = 25_000;
		
		// Declare array of 10 spaces
		SalesPerson[] salesPersonArr = new SalesPerson[NUM_SALES];
		
		// Create 10 objects
		for(int i = 0; i < NUM_SALES; i++) {
			salesPersonArr[i] = new SalesPerson(START_NUM + i, salesAmount);
			salesAmount += RANGE;
		}
		
		
		// Display all sales person
		for(SalesPerson elemento : salesPersonArr)
			System.out.println("Number ID: " + elemento.getNumberID() + " and annual sales amount: " + elemento.getAnnualSales());
		
		
	}

}
