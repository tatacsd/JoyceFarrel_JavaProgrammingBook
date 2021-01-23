package chapter03Exercise;

/*
 * a)
	 * Create an application named NumbersDemo whose main() method holds two
	integer variables. Assign values to the variables. In turn, pass each value to
	methods named displayTwiceTheNumber(), displayNumberPlusFive(), and
	displayNumberSquared(). Create each method to perform the task its name
	implies. Save the application as NumbersDemo.java.
 */

public class NumbersDemo {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 12;
		
		displayTwiceTheNumber(var1, var2);
		displayNumberPlusFive(var1, var2);
		displayNumberSquared(var1,var2);	
	}
	
	// Methods
	public static void displayTwiceTheNumber(int number1, int number2) {
		int num1 = number1 * 2;
		int num2 = number2 * 2;
		System.out.printf("Twice: %d and %d\n", num1, num2);
	}
	
	public static void displayNumberPlusFive(int number1, int number2) {
		int num1 = number1 + 5;
		int num2 = number2 + 5;
		System.out.printf("Plus 5: %d and %d\n", num1, num2);
	}
	
	public static void displayNumberSquared(int number1, int number2) {
		double num1 = Math.pow(number1, 2);
		double num2 = Math.pow(number2, 2);
		System.out.printf("Squared %.0f and %.0f\n", num1, num2);
	}

}
