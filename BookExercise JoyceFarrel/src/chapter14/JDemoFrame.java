package chapter14;

import javax.swing.JFrame;

public class JDemoFrame {

	public static void main(String[] args) {
		JFrame aFrame =  new JFrame();
		final int WIDTH = 300;
		final int HEIGHT = 250;
		aFrame.setTitle("This is a frame");
		aFrame.setSize(WIDTH, HEIGHT);
		aFrame.setVisible(true);
		
		// The program do not close when we close it
	}
}
