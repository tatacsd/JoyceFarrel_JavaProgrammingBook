package chapter03Exercise;
/*
 * 
				 * b. Create an application named TestSandwich that instantiates one Sandwich
				object and demonstrates the use of the set and get methods. Save this
				application as TestSandwich.java
 */

public class TestSandwich {
	public static void main(String[] args) {
		Sandwich sandwichOne = new Sandwich();
		
		// Display the attributes
		System.out.printf("Sandwich of %s with %s bread and its cost is %.2f.\n\n", sandwichOne.getMainIngredient(), sandwichOne.getBreadType(), sandwichOne.getPrice());

		// Change the attributes
		sandwichOne.setBreadType("potato");
		sandwichOne.setMainIngredient("chicken");
		sandwichOne.setPrice(6.99);
		
		// Display the changed attributes
		System.out.printf("Sandwich of %s with %s bread and its cost is %.2f.\n\n", sandwichOne.getMainIngredient(), sandwichOne.getBreadType(), sandwichOne.getPrice());
		
	}
}
