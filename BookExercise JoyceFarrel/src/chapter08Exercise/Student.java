package chapter08Exercise;

/*
			 * 7. a. Create a CollegeCourse class. The class contains fields for the course ID
			(for example, CIS 210), credit hours (for example, 3), and a letter grade (for
			example, A). Include get and set methods for each field. 
			
			Create a Student class containing an ID number and an array of five CollegeCourse objects.
			Create a get and set method for the Student ID number. 
			Also create a get method that returns one of the Student’s CollegeCourses; the method
			takes an integer argument and returns the CollegeCourse in that position
			(0 through 4). 
			
			Next, create a set method that sets the value of one of the
			Student’s CollegeCourse objects; the method takes two arguments—a
			CollegeCourse and an integer representing the CollegeCourse’s
			position (0 through 4). Save the files as CollegeCourse.java
			and Student.java
*/

public class Student {
	// Data field
	private int studentID;
	
	// 	Variables
	final int NUM_CLASS_COURSES = 5;
	
	// Each student has 5 courses (array of 5 courses)
	private CollegeCourse[] courses = new CollegeCourse[NUM_CLASS_COURSES];

		
	// Getter and Setters
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public CollegeCourse getCourses(int position) {
		return courses[position];
	}

	public void setCourses(CollegeCourse courseName, int position) {
		this.courses[position] = courseName;
	}
	
	
	


}
