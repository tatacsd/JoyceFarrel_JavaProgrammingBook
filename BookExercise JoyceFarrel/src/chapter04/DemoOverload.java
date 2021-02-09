package chapter04;

public class DemoOverload {
	public static void main(String[] args) {
		int month = 6;
		int day = 24;
		int year = 2019;
		
		displayDate(month);
		displayDate(month, day);
		displayDate(month, day, year);
		
	}
	
	// Methods
	public static void displayDate(int mm) {
		System.out.println("Event date " + mm + "/1/2018");
	}
	public static void displayDate(int mm, int d) {
		System.out.println("Event date " + mm + "/" + d +"/2018");
	}
	public static void displayDate(int mm, int d, int y) {
		System.out.println("Event date " + mm + "/" + d +"/" + y);
	}

}
