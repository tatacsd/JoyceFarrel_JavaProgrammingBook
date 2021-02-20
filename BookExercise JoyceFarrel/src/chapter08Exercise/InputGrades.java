package chapter08Exercise;

import java.util.Scanner;

/* 
			 * 7.b.       Write an application that prompts a professor to enter grades for five
			different courses each for 10 students. Prompt the professor to enter data for
			one student at a time, including student ID and course data for five courses.
			
			Use prompts containing the number of the student whose data is being
			entered and the course number—for example, Enter ID for student #1, and
			Enter course ID #5. 
			
			
			Verify that the professor enters only A, B, C, D, or F for
			the grade value for each course. Save the file as InputGrades.java
 */

public class InputGrades {
	public static void main(String[] args) {
		// Variables
		final int NUM_CLASS_COURSES = 5;
		final int NUM_OF_STUDENTS = 2;
		
		Student[] students = new Student[NUM_OF_STUDENTS];
		
		// Create the object 
		CollegeCourse course = new CollegeCourse();
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);

		// Loop for 10 students
		for(int i = 0; i < NUM_OF_STUDENTS; i++) {
			System.out.printf(">Enter ID for student #%d  >>  ", i+1);
			int studentId = keyboard.nextInt();
			students[i] = new Student();
			students[i].setStudentID(studentId);
			
			// loop four courses
			for(int j = 0; j < NUM_CLASS_COURSES; j ++) {
				System.out.printf("Enter CourseID #%d  >>  ", j+1);
				String courseId = keyboard.next();
				course.setCourseID(courseId);
				
				System.out.printf("Enter credits hours for %s  >>  ", course.getCourseID());
				int creditHours = keyboard.nextInt();
				course.setCreditHours(creditHours);
				
				System.out.printf("Enter garde for %s  >>  ", course.getCourseID());
				char grade = Character.toUpperCase(keyboard.next().charAt(0));
				
				// Verify if professor inputed the right grade
				while((grade != 'A') &&	(grade != 'B') && (grade != 'C') &&	(grade != 'D') && (grade != 'F')) {
					System.out.println("The value entered is not correct.");
					System.out.printf("Enter garde for %s  >>  ", course.getCourseID());
					grade = Character.toUpperCase(keyboard.next().charAt(0));
				}
				course.setGrade(grade);
				
				// add the course created to the student
				students[i].setCourses(course, j);
			}
			System.out.println();
		}
		System.out.println("============================================");
		// Display the information
		// For each student
		for(int i = 0; i < NUM_OF_STUDENTS; ++i) {
			System.out.printf("Student #%d: ID #%d \n", i+1, students[i].getStudentID());
			
			// For each course
			for(int j = 0; j < NUM_CLASS_COURSES; j++) {
				System.out.printf("Course %d: Course ID #%s >> %d Credits >> Grade: %s.\n", 
						j+1,
						students[i].getCourses(j).getCourseID().toUpperCase(),
						students[i].getCourses(j).getCreditHours(),
						students[i].getCourses(j).getGrade());
			}
			System.out.println("\t-----------");
		}
		
		
		// Close scanner
		keyboard.close();
	}

}
