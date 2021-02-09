package chapter08;

public class PassArrayByReference {
	
	public static void main(String[] args) {
		// Declaring
		final int NUM_ELEMENTS = 4;
		int[] someNums = {5, 10, 15, 20};
		int x;
		
		System.out.print("At start of main: ");
		
		for(x = 0; x < NUM_ELEMENTS; ++x) {
			System.out.print(" " + someNums[x]);
		}		
		System.out.println();
		
		// When an array is passed to a method, no brackets are used.
		methodGetsArray(someNums);
		
		System.out.print("At the end of main : " );
		for(x = 0; x < NUM_ELEMENTS; ++x) {
			System.out.print(" " + someNums[x]);
		}		
		System.out.println();		
	}
	
	
	// Methods
	public static void methodGetsArray(int[] arr) { // an array is passed (reference)
		int x;
		System.out.print(">> At start of the method arr holds: ");
		for(x = 0; x < arr.length; ++x) {
			System.out.print(" " + arr[x]);
		}		
		System.out.println();
		
		for(x = 0; x < arr.length; ++x) {
			arr[x] = 888;
		}		
		System.out.print(">> And in the end of method arr holds: ");
		
		for(x = 0; x < arr.length; ++x) {
			System.out.print(" " + arr[x]);
		}		
		System.out.println();
	}

}
