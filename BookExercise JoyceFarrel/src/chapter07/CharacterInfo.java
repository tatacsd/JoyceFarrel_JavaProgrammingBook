package chapter07;

public class CharacterInfo {
	
	public static void main(String[] args) {
		char aChar = 'C';
		System.out.println("The character is " + aChar);
		
		if(Character.isUpperCase(aChar))
			System.out.println(aChar + " is uppercase");
		else 
			System.out.println(aChar + " is not uppercase");
		
		if(Character.isLowerCase(aChar))
			System.out.println(aChar + " is lowerrcase");
		else
			System.out.println(aChar + " is not lowerrcase");
		
		aChar = Character.toLowerCase(aChar);
		System.out.println("After toLowerCase(), aChar is " + aChar);
		
		aChar = Character.toUpperCase(aChar);
		System.out.println("After toUpperCase(), aChar is " + aChar);
		
	}

}
