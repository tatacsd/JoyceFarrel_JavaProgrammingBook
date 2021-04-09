package chapter14;

import javax.swing.JFrame;

public class JDemoFrameThatCloses {

	public static void main(String[] args) {
		JFrame aFrame =  new JFrame();
		final int WIDTH = 300;
		final int HEIGHT = 250;
		aFrame.setTitle("This is a frame");
		aFrame.setSize(WIDTH, HEIGHT);
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
