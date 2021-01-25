package chapter06Exercise;
/*
 * 7. In Chapter 1 you created a program named
Triangle in which you displayed a seven-line
triangle pattern like the one in Figure 6-33 by using
a series of println() statements. Now, using your
knowledge of loops, revise the program so that it
contains no more than three output statements. Save
the file as TriangleWithLoops.java.
 */
public class TriangleWithLoops {
	public static void main(String[] args) {
		// Pyramid
		int row = 7;		
		for(int i = 0; i < row; i++){
			// Spaces
			for(int j = 0; j < row - (i + 1); j++){
				System.out.print(" ");
			}
			// Ts
			for (int k = 0; k < (i * 2) + 1; k++){
				System.out.print("T");
			}
			// Jump to next line
			System.out.println("");	
		}
	}

}
