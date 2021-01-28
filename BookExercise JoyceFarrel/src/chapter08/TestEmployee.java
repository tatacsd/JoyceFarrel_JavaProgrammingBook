package chapter08;

public class TestEmployee {
	public static void main(String[] args) {
		
		// Constants		
		final int START_NUM = 101;
		final double STARTING_SALARY = 15_000;
		
		// Declare objects
		Employee[] emps = new Employee[7];
		
		// Loop to construct the objects
		for(int i = 0; i < emps.length; i++) {
			emps[i] = new Employee(START_NUM + i, STARTING_SALARY);
		}
	
		// Display the array objects
		// For
		System.out.print("The employees numbers and salary:");
		for(int i = 0; i < emps.length; i++) {
			System.out.println("\nEmployee number: " + emps[i].getEmpNum() +
						"\nEmployee salary: " + emps[i].getEmpSal());
		}
		
		// Enhanced for loop => forEach
//		for(Employee ele : emps) {
//			System.out.println("\nEmployee number: " + ele.getEmpNum() +
//					"\nEmployee salary: " + ele.getEmpSal());
//		}
		
		
	}
}
