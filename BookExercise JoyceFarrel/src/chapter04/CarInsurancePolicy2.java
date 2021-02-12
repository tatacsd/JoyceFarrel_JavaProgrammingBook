package chapter04;

public class CarInsurancePolicy2 {
	private int policyNumber;
	private int numPayments;
	private String residentCity;
	
	
	// Constructor
	public CarInsurancePolicy2() {
		
	}
	public CarInsurancePolicy2(int num, int payments, String city) {
		policyNumber = num;
		numPayments = payments;
		residentCity = city;
	}
	public CarInsurancePolicy2(int num, int payments) {
		policyNumber = num;
		numPayments = payments;
		residentCity = "MayField";
	}
	public CarInsurancePolicy2(int num) {
		this(num, 2, "Mayfield");
	}
	
	public void display() {
		System.out.println("Policy #" + policyNumber + ". " +
				numPayments + " payments annually. Driver resides in " +
				residentCity + ".");
	}
	

}
