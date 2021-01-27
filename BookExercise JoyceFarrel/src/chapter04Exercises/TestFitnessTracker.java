package chapter04Exercises;
/*
						 * 3. a. Create a FitnessTracker class that includes data fields for a fitness activity,
						the number of minutes spent participating, and the date. The class includes
						methods to get each field. In addition, create a default constructor that
						automatically sets the activity to running, the minutes to 0, and the date to
						January 1 of the current year. Save the file as FitnessTracker.java. Create an
						application that demonstrates each method works correctly, and save it as
						TestFitnessTracker.java.
 */

public class TestFitnessTracker {
	public static void main(String[] args) {
		// Create an new object
		FitnessTracker activityOne = new FitnessTracker();
		
		// Display the object attributes
		System.out.printf("The activity is: %s\nThe minutes spent paticipating is: %d\nThe date is: %s\n\n",
				activityOne.getFitnessActivity(), activityOne.getNumberOfMinutes(), activityOne.getDate());
		
		
		// Changing the data
		activityOne.setFitnessActivity("cycling");
		activityOne.setNumberOfMinutes(360);
		activityOne.setDate("January 2nd, 2020");
		
		
		// Display the objects attributes
		System.out.printf("The activity is: %s\nThe minutes spent paticipating is: %d\nThe date is: %s\n\n",
				activityOne.getFitnessActivity(), activityOne.getNumberOfMinutes(), activityOne.getDate());
	}
}
