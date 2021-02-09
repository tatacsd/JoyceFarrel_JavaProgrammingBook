package chapter07;

public class StringBuilderMethods {
	
	public static void main(String[] args) {
		// Create a StringBuilder object, and then display it
		StringBuilder str = new StringBuilder("singing");
		System.out.println(str);
		
		// Add characters to the existing StringBuilder
		str.append(" in the dead of ");
		System.out.println(str);
		
		// Use insert() method to insert characters
		str.insert(0, "Black");
		System.out.println(str);
		str.insert(5, "bird ");
		System.out.println(str);
		
		
		str.append("night");
		System.out.println(str);
		
	}

}
