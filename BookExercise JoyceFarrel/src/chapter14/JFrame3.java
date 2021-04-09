package chapter14;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame3 {

	public static void main(String[] args) {
		JFrame aFrame =  new JFrame();
		final int WIDTH = 300;
		final int HEIGHT = 250;
		aFrame.setTitle("Third frame");
		aFrame.setSize(WIDTH, HEIGHT);
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JLabel greeting = new JLabel("Good day");
		aFrame.add(greeting);
		
		
		Font headlineFont = new Font ("Monospaced", Font.BOLD, 36);
		greeting.setFont(headlineFont);
	}
}
