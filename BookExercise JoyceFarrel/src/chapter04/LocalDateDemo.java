package chapter04;

import java.time.LocalDate;

public class LocalDateDemo {
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate graduation = LocalDate.of(2021, 8, 31);
		
		System.out.println("Today is " + today);
		System.out.println("Graduation is " + graduation);
		
		
		System.out.println("Graduation will be on day " +
				graduation.getDayOfMonth() + " in month " +
				graduation.getMonthValue());
		
		System.out.println("Graduation is on " +
				graduation.getDayOfWeek());
	}

}
