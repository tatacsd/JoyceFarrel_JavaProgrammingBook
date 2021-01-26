package chapter03Exercise;
/*
 * .
			12. a. Create a class named Student that has fields for an ID number, number
			of credit hours earned, and number of points earned. (For example,
			many schools compute grade point averages based on a scale of 4, so a
			three-credit-hour class in which a student earns an A is worth 12 points.)
			Include methods to assign values to all fields. A Student also has a field for
			grade point average. Include a method to compute the grade point average
			field by dividing points by credit hours earned. Write methods to display the
			values in each Student field. Save this class as Student.java
 */

public class Student {
	
	// Data fields
	private int numberId;
	private double numberOfPoints;
	private double numberOfCreditsHour;
	private double gradeAverage;
	
	// Setters and Getters
	public double getNumberOfCreditsHour() {
		return numberOfCreditsHour;
	}

	public void setNumberOfCreditsHour(double numberOfCreditsHour) {
		this.numberOfCreditsHour = numberOfCreditsHour;
	}

	public double getNumberOfPoints() {
		return numberOfPoints;
	}
	
	public void setNumberOfPoints(double numberOfPoints) {
		this.numberOfPoints = numberOfPoints;
	}

	public int getNumberId() {
		return numberId;
	}
	
	public void setNumberId(int numberId) {
		this.numberId = numberId;
	}
	
	// Method to compute the grade point average
	public double computeAvarege() {
		this.gradeAverage = this.numberOfPoints / this.numberOfCreditsHour; 
		return this.gradeAverage;
	}
	
	// Method to display the values in each Student field
	public void displayStudentField() {
		System.out.printf("The student ID: %d\nThe number of credits hour: %.2f\nThe number of points: %.2f\nThe grade average: %.2f",
				numberId, numberOfCreditsHour, numberOfPoints, gradeAverage);
	}
	


}
