package chapter08Exercise;

import java.util.Scanner;

/*
					3 b. It might not be reasonable to expect users to type long entries such as “oil
		change” accurately. Modify the CarCareChoice class so that as long as the
		user enters the first three characters of a service, the choice is considered
		valid. Save the file as CarCareChoice2.java.
 */

public class CarCareChoice2 {
	
	public static void main(String[] args) {
		
		// Declaring arrays
		String[] servicesArr = {"oil change",
				"tire rotation",
				"battery check",
				"brake inspection"};
		double[] pricesArr = {25, 22, 15, 5};
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);

		
		
		// Display the option
		System.out.print("\tWelcome to Cody’s Car Care Shop\n");
		System.out.println("-----------------------------------------------");
		for(int i = 0; i < servicesArr.length; i++) {
			System.out.printf("\t%d: %s\n", i+1, servicesArr[i]);			
		}
		System.out.println("-----------------------------------------------");
		System.out.print("Please type of the options >> ");
		String userInput = keyboard.nextLine();
		
		for(int i = 0; i < servicesArr.length; i++) {
			// Comparing only the three first letters
			if(userInput.substring(0, 2).equalsIgnoreCase(servicesArr[i].substring(0, 2))) {
				System.out.println("-----------------------------------------------");
				System.out.printf("O valor do serviço de %s é $%.2f", servicesArr[i], pricesArr[i]);
				System.out.println("\n-----------------------------------------------");
				System.out.println("\n\n");
				System.out.println("\tObrigado pela preferencia,\n\t\tVolte sempre");
			}
		}
		
		// Close scanner
		keyboard.close();
	}

}
