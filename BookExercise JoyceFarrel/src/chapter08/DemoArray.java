package chapter08;

public class DemoArray {
	public static void main(String[] args) {
		
		// Declare and create an array for double
		double[] salaries = new double[4];
		
		// Assign one by one the values
		salaries[0] = 12.25;
		salaries[1] = 13.55;
		salaries[2] = 14.25;
		salaries[3] = 16.85;
		
		// Display the salaries one by one
		System.out.println("Salaries one by one are:");
		System.out.println(salaries[0]);
		System.out.println(salaries[1]);
		System.out.println(salaries[2]);
		System.out.println(salaries[3]);
		
		// Using subscription that is out of bound
		//System.out.println(salaries[4]);
		
		
	}

}
