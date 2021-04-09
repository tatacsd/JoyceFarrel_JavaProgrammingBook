package chapter14Exercise;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JBookQuote2 extends JFrame {

	private JPanel contentPane;
	private JButton titleBtn;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JBookQuote2 frame = new JBookQuote2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void events() {
		titleBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Le Petit Prince", "Book's title", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
	
	public void setupComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel sentence1 = new JLabel("New label");
		sentence1.setBounds(35, 27, 634, 43);
		contentPane.add(sentence1);
		
		JLabel sentence2 = new JLabel("New label");
		sentence2.setBounds(35, 96, 634, 43);
		contentPane.add(sentence2);
		
		titleBtn = new JButton("Book's Title");
	
		
		titleBtn.setBounds(278, 185, 148, 35);
		contentPane.add(titleBtn);
		
		
	}
	/**
	 * Create the frame.
	 */
	public JBookQuote2() {
		setupComponents();
		events();
	}

}
