
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
	static ArrayList<Admin> AdminList=new ArrayList<Admin>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 389);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
ImagePanel panel = new ImagePanel(new ImageIcon("E:\\New folder\\AirlineFlightManagementSystem\\1123.jpg").getImage());

	
		JLabel lblNewLabel = new JLabel("Welcome to Flight Management System ");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(50, 11, 457, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(118, 81, 91, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(118, 136, 91, 17);
		contentPane.add(lblNewLabel_2);
		
		username = new JTextField();
		username.setBounds(237, 78, 86, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(237, 133, 86, 20);
		contentPane.add(password);
		
		Admin obj=new Admin("admin","admin");
		AdminList.add(obj);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Admin x: AdminList)
				{
					if (username.getText().equals("admin") && password.getText().equals("admin"))
					{
						Menu obj=new Menu();
						obj.setVisible(true);
						dispose();
					}
					else if (username.getText().equals(x.getUsername()))
					{
						JOptionPane.showMessageDialog(null, "Incorrect password. Enter Again.");
					}
					else if (password.getText().equals(x.getPassword()))
					{
						JOptionPane.showMessageDialog(null, "Incorrect username. Enter Again.");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "You are not a registered admin.");
					}
				}
			}
		});
		btnNewButton.setBounds(237, 176, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(367, 176, 89, 23);
		contentPane.add(btnNewButton_1);
		contentPane.add(panel);
	}
}

