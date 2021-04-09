package chapter14;

import javax.swing.JFrame;

public class JFrame2 {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame aFrame = new JFrame("First frame");
		aFrame.setSize(300, 100);
		aFrame.setVisible(true);
	}

}
