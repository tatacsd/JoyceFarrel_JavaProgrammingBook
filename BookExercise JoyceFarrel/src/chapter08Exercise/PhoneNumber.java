package chapter08Exercise;

import java.util.Scanner;

/*
				 * 9. A personal phone directory contains room for first names and phone numbers
				for 30 people. 
				Assign names and phone numbers for the first 10 people. 
				Prompt the user for a name, and if the name is found in the list, display the corresponding
				phone number. 
				If the name is not found in the list, prompt the user for a phone
				number, and add the new name and phone number to the list. 
				
				Continue to prompt the user for names until the user enters quit. After the arrays are full
				(containing 30 names), do not allow the user to add new entries. Save the file as
				PhoneNumbers.java.
 */
public class PhoneNumber {
	public static void main(String[] args) {
		
		// Declare two arrays with 30 elements
		String[] personName = new String[30];
		int[] personNumber = new int[30];
		
		// Declare variables
		String userInput;
		int counter = 9;
		boolean isInAgenda = false;
		int agendaPosition = 0;
		
		// Add name and number to the first 10
		personName[0] = "João";
		personName[1] = "Luiz";
		personName[2] = "Laryssa";
		personName[3] = "Lucas";
		personName[4] = "Pedro";
		personName[5] = "Damião";
		personName[6] = "Paulo";
		personName[7] = "Maria";
		personName[8] = "José";
		personName[9] = "Felipe";
		
		personNumber[0] = 123456789;
		personNumber[1] = 123456789;
		personNumber[2] = 123456789;
		personNumber[3] = 123456789;
		personNumber[4] = 123456789;
		personNumber[5] = 123456789;
		personNumber[6] = 123456789;
		personNumber[7] = 123456789;
		personNumber[8] = 123456789;
		personNumber[9] = 123456789;
		
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);
		
		
		// Prompt the user for a name and 
		System.out.print("Type a name to search in the Agenda or QUIT to exit >> ");
		userInput = keyboard.nextLine();
		
		while(counter < 30 && !userInput.equalsIgnoreCase("QUIT")) {
			// if the name is found in the list, display the corresponding phone number.
			for(int i = 0; i < counter; i++) {		
				if(personName[i].equalsIgnoreCase(userInput)) {
					isInAgenda = true;
					agendaPosition = i;				
				} 
			}
			
			if(isInAgenda) {
				System.out.printf("%s number is: %d.\n", personName[agendaPosition].toString(), personNumber[agendaPosition]);
				break;
			} else {
				counter++;
				System.out.printf("You don't have %s saved in your Agenda\n", userInput);
				personName[counter] = userInput;
				System.out.printf("Type a number to add %s to the agenda >> ", userInput);
				personNumber[counter] = keyboard.nextInt();	
				counter++;
				break;	
			}					
		}
		System.out.println();
		
		// Ask to add new input until 30
		while (counter < 31 && !userInput.equalsIgnoreCase("QUIT")) {
			System.out.println("----------------------------------------------------");
			System.out.println("                 Contact list");
			System.out.println("Number of contacts in your agenda: " + counter);
			System.out.println("----------------------------------------------------");
			
			System.out.print("Type a name to add the Agenda or QUIT to exit >> ");
			userInput = keyboard.next();
			personName[counter] = userInput;
			
			
			System.out.printf("Type a number to add %s to the agenda >> ", personName[counter]);
			personNumber[counter] = keyboard.nextInt();	
			
			System.out.printf("\t%s was added to your contact list\n", personName[counter]);
			counter++;			
		}
		
		// Close scanner
		keyboard.close();
		System.out.println("\nEnd");			
	}
	
	// Methods
	public static void displayAgenda(String[] stringArr, int[] intArr, int counter) {
		for(int i = 0; i < counter; i ++) {
			System.out.printf("%d# Name: %s >> number: %d", i, stringArr[i].toString(), intArr[i]);
		}
	}
	
	

}
