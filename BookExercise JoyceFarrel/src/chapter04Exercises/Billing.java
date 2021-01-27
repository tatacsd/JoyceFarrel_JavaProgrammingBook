package chapter04Exercises;
/*
 * .
				2. Create a class named Billing that includes three overloaded computeBill()
				methods for a photo book store.
				• When computeBill() receives a single parameter, it represents the price of
				one photo book ordered. Add 8% tax, and return the total due.
				• When computeBill() receives two parameters, they represent the price of
				a photo book and the quantity ordered. Multiply the two values, add 8% tax,
				and return the total due.
				• When computeBill() receives three parameters, they represent the price of a
				photo book, the quantity ordered, and a coupon value. Multiply the quantity
				and price, reduce the result by the coupon value, and then add 8% tax and
				return the total due.
				Write a main() method that tests all three overloaded methods. Save the
				application as Billing.java
 */
public class Billing {
	
	final static double TAX = 0.08;
	// Three overloaded computeBill()
	// Receives a single parameter, it represents the price of one photo book ordered.
	public static double computeBill(double price) {
		return price * (TAX + 1);		
	}
		
	// Receives two parameters, they represent the price of	a photo book and the quantity ordered
	public static double computeBill(double price, int quantity) {
		return (price * quantity) * (1 + TAX);
	}
	
	// Receives three parameters, they represent the price of a	photo book, the quantity ordered, and a coupon value
	public static double computeBill(double price, int quantity, double couponValue) {
		return ((price * quantity) - couponValue) * (1 + TAX); 
	}
	
	public static void main(String[] args) {
		// Tests all three overloaded methods		
		System.out.printf("The price of one album plus tax is %.2f.\n", computeBill(8.0));
		System.out.printf("The total price of the albuns plus tax is %.2f.\n", computeBill(8.0, 5));
		System.out.printf("The total price of the albuns minus the coupon, plus tax is %.2f.\n", computeBill(8.0, 5, 10.0));
	}
}
