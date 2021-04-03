package chapter10exercise;
/*
 * Write an application that creates two objects of each class, and demonstrate that all the
methods work correctly. Save the files as TeeShirt.java, CustomTee.java, and
DemoTees.java
 */

public class DemoTees {
	public static void main(String[] args) {
		
		// Ordinary object
		TeeShirt teeOne = new TeeShirt();
		teeOne.setColor("Black");
		teeOne.setNumber(23);
		teeOne.setSize("xxl");
		
		TeeShirt teeTwo = new TeeShirt();
		teeTwo.setColor("White");
		teeTwo.setNumber(22);
		teeTwo.setSize("L");
				
		// Customized object
		CustomTee teeThree = new CustomTee();
		teeThree.setColor("Yellow");
		teeThree.setSlogan("Golden Years");
		teeThree.setNumber(21);
		teeThree.setSize("XXL");
		
		CustomTee teeFourth = new CustomTee();
		teeFourth.setColor("Green");
		teeFourth.setSlogan("Money honey");
		teeFourth.setNumber(20);
		teeFourth.setSize("S");
		
		// Display info
		teeOne.display();
		teeTwo.display();
		teeThree.display();
		teeFourth.display();
		
		
	}

}
