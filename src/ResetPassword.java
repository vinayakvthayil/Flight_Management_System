
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class ResetPassword extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	int index;
	private JPasswordField password;
	private JPasswordField confirmPassword;
	boolean check=false;
	private JPasswordField oldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResetPassword frame = new ResetPassword();
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
	public ResetPassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 382);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reset Password");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 414, 17);
		contentPane.add(lblNewLabel);
		
		username = new JTextField();
	    username.setBounds(130, 36, 86, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
	    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD , 15));
		lblNewLabel_1.setBounds(10, 39, 110, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Find");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				for (Passengers x: SignUP.PassengerList)
				{
					if(x.getUsername().equals(username.getText()))
					{
						JOptionPane.showMessageDialog(null, "Your account has been found. Enter your new password.");
						check=true;
						index=SignUP.PassengerList.indexOf(x);
					}
				}
				if(check==false)
				{
					JOptionPane.showMessageDialog(null, "Your account has not been found. Please register first.");
				}
			}
		});
		btnNewButton.setBounds(130, 67, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD , 15));
		lblNewLabel_2.setBounds(10, 141, 110, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Confirm Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD , 15));
		lblNewLabel_3.setBounds(10, 172, 110, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Done");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int chk=0;
				for (int i=0 ; i<password.getText().length() ; i++)
				{
					char check=password.getText().charAt(i);
					
					if (Character.isUpperCase(check)==true)
					{
						chk+=1;
						break;
					}
				}
				
				if (check=false)
				{
					JOptionPane.showMessageDialog(null, "Please find your account first.");
				}
				else if(SignUP.PassengerList.get(index).getPassword().equals(oldPassword.getText())==false)
				{
					JOptionPane.showMessageDialog(null, "Old passowrd is incorrect.");
				}
				else if(password.getText().equals(confirmPassword.getText())==false)
				{
					JOptionPane.showMessageDialog(null, "Passwords donot match.");
				}
				else if (password.getText().length()<8)
				{
					JOptionPane.showMessageDialog(null, "Password cannot be less than 8 characters.");
				}
				else if(password.getText().contains("@")==false && password.getText().contains("!")==false && password.getText().contains("%")==false 
						&& password.getText().contains("#")==false && password.getText().contains("^")==false && password.getText().contains("&")==false
						&& password.getText().contains("*")==false && password.getText().contains("_")==false)
				{
					JOptionPane.showMessageDialog(null, "Password must have a special character");
				}
				else if (chk<1)
				{
					JOptionPane.showMessageDialog(null, "Password must have atleast one uppercase letter.");
				}
				else
				{
					SignUP.PassengerList.get(index).setPassword(password.getText());
					JOptionPane.showMessageDialog(null, "Your password has been changed.");
				
					Login obj1=new Login();
					obj1.setVisible(true);
					dispose();
				}
			}
		});

ImagePanel panel = new ImagePanel(new ImageIcon("E:\\New folder\\AirlineFlightManagementSystem\\1523.jpg").getImage());
		
		btnNewButton_1.setBounds(130, 200, 89, 23);
		contentPane.add(btnNewButton_1);
		
		password = new JPasswordField();
		password.setBounds(130, 138, 86, 20);
		contentPane.add(password);
		
		confirmPassword = new JPasswordField();
		confirmPassword.setBounds(130, 169, 86, 20);
		contentPane.add(confirmPassword);
		
		JLabel lblNewLabel_4 = new JLabel("Old Password");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD , 15));
		lblNewLabel_4.setBounds(10, 110, 110, 14);
		contentPane.add(lblNewLabel_4);
		
		oldPassword = new JPasswordField();
		oldPassword.setBounds(130, 107, 86, 20);
		contentPane.add(oldPassword);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(479, 298, 89, 23);
		contentPane.add(btnNewButton_2);
		contentPane.add(panel);
	}
}
