package chapter14Exercise;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class JBookQuote extends JFrame {

	private JPanel contentPane;
	private JLabel lblSentence;
	
	
	
	public void setupComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblSentence = new JLabel("\"L'essencial est invisible pour les yeux\"");
		lblSentence.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSentence.setBounds(10, 57, 675, 49);
		contentPane.add(lblSentence);
		
		JLabel lblSentence_1 = new JLabel("\"Il est bien plus difficile de se juger soi-même que de juger autrui.\"");
		lblSentence_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSentence_1.setBounds(10, 197, 675, 49);
		contentPane.add(lblSentence_1);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JBookQuote frame = new JBookQuote();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JBookQuote() {
		setupComponents();
	}
}
