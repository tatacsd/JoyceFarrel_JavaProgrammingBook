import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java application that displays two dialog boxes in sequence. 
		// The first asks you to think of a number between 1 and 10.
		JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10.");
		
		// The second displays a randomly generated number; 
		JOptionPane.showMessageDialog(null,"The number is "+
				(1 + (int)(Math.random() * 10)));

		/*
		 * (In future chapters, you will improve this game so that the user can enter a
guess and the program can determine whether the user was correct. If you
wish, you also can tell the user how far off the guess was, whether the guess was
high or low, and provide a specific number of repeat attempts.)
		 */
	}

}
