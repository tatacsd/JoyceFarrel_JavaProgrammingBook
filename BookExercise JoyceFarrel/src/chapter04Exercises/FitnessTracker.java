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

public class FitnessTracker {
	
	// Data fields
	private String fitnessActivity;
	private int numberOfMinutes;
	private String date;
	
	// Default Constructor
	public FitnessTracker() {
		this.fitnessActivity = "running";
		this.numberOfMinutes = 0;
		this.date = "January 1st 2021";
	}
	
	// Setters and Getters
	public String getFitnessActivity() {
		return fitnessActivity;
	}
	public void setFitnessActivity(String fitnessActivity) {
		this.fitnessActivity = fitnessActivity;
	}
	public int getNumberOfMinutes() {
		return numberOfMinutes;
	}
	public void setNumberOfMinutes(int numberOfMinutes) {
		this.numberOfMinutes = numberOfMinutes;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
