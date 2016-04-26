import java.awt.EventQueue;
import java.sql.Wrapper;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 438, 264);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(211, 5, 0, 0);
		frame.getContentPane().add(label);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(85, 69, 77, 14);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(95, 99, 67, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(201, 66, 112, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(201, 96, 112, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		
		btnLogin.setBounds(224, 127, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(224, 161, 89, 23);
		frame.getContentPane().add(btnExit);
	}
			 
			 


		
