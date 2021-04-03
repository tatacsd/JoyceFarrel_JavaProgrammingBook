package chapter10;

public class BaseballPlayer {
	private int jerseyNumber;
	private double battingAvg;
	
	// It is static so it cannot be overrided by the subclass non-static method
	// and it cannot also be overrided by a static method in the subclass, because you cannot add a super in a static method
	public static void showOrigins() {
		System.out.println("Anber Doubleday is often "
				+ "credited with inventing baseball");
	}
	
	// A subclass cannot override methods that are declared final in the superclass
	public final void displayMessage() {
		System.out.println("Michael Jordan is the " +
				"greatest basketball player - and that is final");
	}

}
