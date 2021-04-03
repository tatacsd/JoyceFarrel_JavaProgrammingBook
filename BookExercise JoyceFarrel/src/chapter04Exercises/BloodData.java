package chapter04Exercises;


/*
 * 
 * 4.
 *  a. Create a class named BloodData that includes fields that hold a blood type
(the four blood types are O, A, B, and AB) and an Rh factor (the factors are
1 and –). 

Create a default constructor that sets the fields to O and 1, and
an overloaded constructor that requires values for both fields. Include get
and set methods for each field. Save this file as BloodData.java. Create an
application named TestBloodData that demonstrates each method works
correctly. Save the application as TestBloodData.java.
 */
public class BloodData {
	
	// Data field 
	private String bloodType;
	private String rhFactor;
	
	public BloodData() {
		setBloodType("O");
		setRhFactor("+");
	}
	
	public BloodData(String bloodType, String rh) {
		setBloodType(bloodType);
		setRhFactor(rh);
	}
	
	
	
	// Setter and Getters
	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getRhFactor() {
		return rhFactor;
	}

	public void setRhFactor(String rhFactor) {
		this.rhFactor = rhFactor;
	}
	
	
	// Methods
	@Override
	public String toString() {
		return bloodType + rhFactor;
		
	}
	
	

}
