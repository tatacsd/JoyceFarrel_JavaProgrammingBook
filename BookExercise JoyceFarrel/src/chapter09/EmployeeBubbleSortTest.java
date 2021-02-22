package chapter09;

import java.util.Scanner;

public class EmployeeBubbleSortTest {
	
	public static void main(String[] args) {
		
		// Variables
		final int NUM_EMPLOYEES = 3;
		String firstName;
		String lastName;
		double salary;
		int empID;
		
		
		
		
		// Create an array of 5 employees
		Employee[] someEmps = new Employee[NUM_EMPLOYEES];
		
		// Prompt the user the information about the employees
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 0; i < NUM_EMPLOYEES; i++) {
			someEmps[i] = new Employee();
			System.out.print("Enter employee #" + (i+1) + " ID: ");
			empID = Integer.valueOf(keyboard.next());
			someEmps[i].setEmpNum(empID);
			
			System.out.print("Enter employee #" + (i+1) + " first name: ");
			firstName = keyboard.next();
			someEmps[i].setFirstName(firstName);
			
			System.out.print("Enter employee #" + (i+1) + " last name: ");
			lastName = keyboard.next();
			someEmps[i].setLastName(lastName);
			
			System.out.print("Enter employee #" + (i+1) + " Salary: ");
			salary = Double.valueOf(keyboard.next());
			someEmps[i].setSalary(salary);
		}
			
		
		// Sort it in ascending order by salary
		bubbleSort(someEmps);
		System.out.println("The ascending salary order");
		for(int i = 0; i < NUM_EMPLOYEES; i++) {
			System.out.println((i+1) + "# Employee: " + someEmps[i].getFirstName() + " " + someEmps[i].getLastName() +
					": " + someEmps[i].getSalary() + ".");
			
		}
		
		// Close scanner
		keyboard.close();
		
	}

	// Methods
	public static void bubbleSort(Employee[] arr) {
		int i, j;
		Employee temp;
		int highIndex = arr.length-1;
		
		for(i = 0; i < highIndex; i++) {
			for(j = 0; j < highIndex; j++) {
				if(arr[j].getSalary() > arr[j+1].getSalary()) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =  temp;
				}
			}
		}
		
		
		
		
		
	}
}
