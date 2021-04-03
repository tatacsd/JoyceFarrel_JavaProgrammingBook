package chapter04Exercises;

/*
 * b. Create a class named Patient that includes an ID number, age, and
BloodData. 

Provide a default constructor that sets the ID number to 0, the age
to 0, and the BloodData values to O and +. 
Create an overloaded constructor that provides values for each field. 
Also provide get methods for each field.
Save the file as Patient.java. Create an application that demonstrates that
each method works correctly, and save it as TestPatient.java.
 */

/**
 * @author thays
 *
 */
public class Patient{
	private int patientID;
	private int patienteAge;
	private BloodData bloodType;

	
	// Default constructor
	public Patient() {
		this.bloodType = new BloodData();
		this.patientID = 0;
		this.patienteAge = 0;		
	}
	
	public Patient(String patientBloodType, String rh, int id, int age) {
		this.bloodType = new BloodData(patientBloodType, rh);
		this.patientID = id;
		this.patienteAge = age;		
	}
		
	// Setters and Getters
	public void setPatientID (int id) {
		this.patientID = id;
	}
	
	public int getPatientID () {
		return this.patientID;
	}
	
	public void setPatienAge (int age) {
		this.patientID = age;
	}
	
	public int getPatientAge () {
		return this.patienteAge;
	}
	
	public void setPatienBloodType (BloodData bloodType) {
		this.bloodType = bloodType;
	}
	
	public BloodData getBloodType () {
		return this.bloodType;
	}
	
	

}
