package chapter04;

import java.time.LocalDate;
import java.util.Scanner;

public class DeliveryDate {

	public static void main(String[] args)	{
		LocalDate orderDate;
		int mo;
		int day;
		int year;
		final int WEEKS_FOR_DELIVERY = 2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter order month ");
		mo = input.nextInt();
		
		System.out.print("Enter order day ");
		day = input.nextInt();
		
		System.out.print("Enter order year ");
		year = input.nextInt();
		
		orderDate = LocalDate.of(year, mo, day);
		
		System.out.println("Order date is " + orderDate);
		System.out.println("Delivery date is " + orderDate.plusWeeks(WEEKS_FOR_DELIVERY)) ;

		input.close();
	}
}
