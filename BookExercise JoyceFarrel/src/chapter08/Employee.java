package chapter08;

public class Employee {
	private int empNum;
	private double empSal;
	
	// Constructor
	public Employee(int empNum, double empSal) {
		this.empNum = empNum;
		this.empSal = empSal;
	}	
	
	// Setters and Getters
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	
	

}
