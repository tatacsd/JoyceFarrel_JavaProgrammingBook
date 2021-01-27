package chapter04Exercises;
/*
					 * c. Modify the FitnessTracker class so that the default constructor calls
					the three-parameter constructor. Save the class as FitnessTracker2.java.
					Create an application to test the new version of the class, and name it
					TestFitnessTracker2.java
 */
public class FitnessTracker2 {
	// Data fields
		private String fitnessActivity;
		private int numberOfMinutes;
		private String date;
		
		// Constructor
		public FitnessTracker2(String fitnessActivity, int numberOfMinutes, String date) {
			this.fitnessActivity = fitnessActivity;
			this.numberOfMinutes = numberOfMinutes;
			this.date = date;
		}
		
		// Getters and Setters
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
