package chapter14;

import javax.swing.*;

public class JMyFrame extends JFrame{
		final int WIDTH = 300;
		final int HEIGHT = 120;
		
		public JMyFrame() {
			super("My frame");
			setSize(WIDTH, HEIGHT);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}