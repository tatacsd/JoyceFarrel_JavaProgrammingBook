package chapter03Exercise;
/*
				 * b. Write a class named ShowStudent that instantiates a Student object from the
				class you created and assign values to its fields. Compute the Student grade
				point average, and then display all the values associated with the Student.
				Save the application as ShowStudent.java.
 */
public class ShowStudent {
	public static void main(String[] args) {
		// Instantiates a student object
		Student studentOne = new Student();
		
		// Assign the values to the object
		studentOne.setNumberId(1234);
		studentOne.setNumberOfCreditsHour(9);
		studentOne.setNumberOfPoints(12);
		
		// Compute the Student grade point average
		studentOne.computeAvarege();
		
		// display all the values associated with the Student
		studentOne.displayStudentField();		
	}	

}
