package chapter04Exercises;

/*
 * 4 . Create an application named TestBloodData that demonstrates each method works
correctly. Save the application as TestBloodData.java.
 */

public class TestBloodData {
	public static void main(String[] args) {
		BloodData personOne = new BloodData();
		BloodData personTwo = new BloodData("A", "-");
		
		System.out.println(personOne);
		System.out.println(personTwo);
		
		// Change using setter and getters
		personOne.setBloodType("AB");
		personOne.setRhFactor("-");
		
		System.out.println(personOne.getBloodType() + personOne.getRhFactor());
		
	}

}
