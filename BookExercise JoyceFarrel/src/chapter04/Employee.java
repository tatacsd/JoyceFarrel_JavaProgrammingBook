package chapter04;

public class Employee {
	private int empNum;
	private double empPayRate;
	
	// Methods
	public void setValues() {
		empNum = 111;
		empPayRate = 22.22;
	}
	
	public void methodThatUsesInstancesAttributes() {
		System.out.println("Employee  number is " + empNum);
		System.out.println("Pay rate is " + empPayRate);
	}
	
	
	public void methodThatUsesLocalVariables() {
		int empNum = 33333;
		double empPayRate = 555.55;
		System.out.println("Employee  number is " + empNum);
		System.out.println("Pay rate is " + empPayRate);
	}

}
