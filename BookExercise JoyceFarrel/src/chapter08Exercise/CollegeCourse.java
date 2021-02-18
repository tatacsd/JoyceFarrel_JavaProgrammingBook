package chapter08Exercise;
/*
				 * 7. a. Create a CollegeCourse class. The class contains fields for the course ID
				(for example, CIS 210), credit hours (for example, 3), and a letter grade (for
				example, A). Include get and set methods for each field. 
				
				Create a Student class containing an ID number and an array of five CollegeCourse objects.
				Create a get and set method for the Student ID number. Also create a get
				method that returns one of the Student’s CollegeCourses; the method
				takes an integer argument and returns the CollegeCourse in that position
				(0 through 4). Next, create a set method that sets the value of one of the
				Student’s CollegeCourse objects; the method takes two arguments—a
				CollegeCourse and an integer representing the CollegeCourse’s
				position (0 through 4). Save the files as CollegeCourse.java
				and Student.java
 */

public class CollegeCourse {
	// Data fields
	private String courseID;
	private int creditHours;
	private char grade;
	
	
	// Getters and Setters
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	

}
