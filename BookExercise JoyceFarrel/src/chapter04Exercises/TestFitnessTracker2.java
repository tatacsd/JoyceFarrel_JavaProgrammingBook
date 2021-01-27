package chapter04Exercises;
/*
							 * c. Modify the FitnessTracker class so that the default constructor calls
							the three-parameter constructor. Save the class as FitnessTracker2.java.
							Create an application to test the new version of the class, and name it
							TestFitnessTracker2.java
*/
public class TestFitnessTracker2 {
	public static void main(String[] args) {
		FitnessTracker2 activityThree = new FitnessTracker2("handball", 1000, "july 2015");
		
		System.out.printf("The activity is: %s\nThe minutes spent paticipating is: %d\nThe date is: %s\n\n",
				activityThree.getFitnessActivity(), activityThree.getNumberOfMinutes(), activityThree.getDate());
	}

}
