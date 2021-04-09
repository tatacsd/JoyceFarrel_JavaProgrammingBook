package chapter14Exercise;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameDisableButton extends JFrame {

	private JPanel contentPane;
	private JButton clickBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameDisableButton frame = new JFrameDisableButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void eventsHandle() {
		clickBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickBtn.setEnabled(false);
			}
		});
			
			
	}

	public void setupComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		clickBtn = new JButton("Click here");
		
		
		clickBtn.setBounds(91, 64, 250, 114);
		contentPane.add(clickBtn);
	}
	/**
	 * Create the frame.
	 */
	public JFrameDisableButton() {
		setupComponents();
		eventsHandle();
	}

}
