package chapter03;

import java.util.Scanner;

public class CreateSpaService {
	public static void main(String[] args) {
//		// Declare variables
//		String service;
//		double price;
		
		// Declaring Objects
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		
		firstService = getData(firstService);
		// The constructor will add the info
		// secondService = getData(secondService);		
		
		System.out.printf("First service details:\n%s $%.2f.\n", firstService.getServiceDescription(), firstService.getPrice());
		System.out.printf("Second service details:\n%s $%.2f.", secondService.getServiceDescription(), secondService.getPrice());
		
	}
	
	// Methods
	
	// method that returns an object of type SpaService and as a parameter has SpaService object
	public static SpaService getData(SpaService serviceObj) {
		// Declare variables
		String service;
		double price;
		
		// Initialize Scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the service >> ");
		service = keyboard.nextLine();
		System.out.print("Enter price >> ");
		price =  keyboard.nextDouble();
				
		serviceObj.setServiceDescription(service);
		serviceObj.setPrice(price);
		
		keyboard.nextLine();
		// keyboard.close(); // I can't close here because an error occur
		return serviceObj;
	}
}
