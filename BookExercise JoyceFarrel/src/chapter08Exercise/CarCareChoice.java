package chapter08Exercise;

import java.util.Scanner;

/*
			 * 3. a. Write an application for Cody’s Car Care Shop that shows a user a list of
			available services: oil change, tire rotation, battery check, or brake inspection.
			Allow the user to enter a string that corresponds to one of the options,
			and display the option and its price as $25, $22, $15, or $5, accordingly.
			Display an error message if the user enters an invalid item. Save the file as
			CarCareChoice.java.
 */

public class CarCareChoice {
	
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
			if(userInput.equalsIgnoreCase(servicesArr[i])) {
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
