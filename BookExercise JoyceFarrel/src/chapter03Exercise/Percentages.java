package chapter03Exercise;

public class Percentages {
	public static void main(String[] args) {
		double var1 = 2.0;
		double var2 = 5.0;
		
		computePercent(var1, var2);
		computePercent(var2, var1);

	}
	
	public static void computePercent(double num1, double num2) {
		double percentage = (num1 * 100) / num2;
		System.out.printf("%.2f is %.0f percent of %.2f.", num1, percentage, num2);
	}
}
