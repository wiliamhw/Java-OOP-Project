package com.source;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginForm {

	private JFrame loginFrame;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.loginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginForm() {
		initialize();
	}

	public void getView() {
		loginFrame.setVisible(true);
	}

	private void initialize() {
		loginFrame = new JFrame();
//		loginFrame.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyPressed(KeyEvent e) {
//			}
//		});
		loginFrame.setResizable(false);
		loginFrame.setBounds(100, 100, 405, 325);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.getContentPane().setLayout(null);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.setTitle("Login Form");

		JPanel panel = new JPanel();
//		panel.getComponents()
		panel.setBounds(0, 0, 400, 52);
		panel.setBackground(new Color(248, 148, 6));
		loginFrame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel label = new JLabel("Login");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(label, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(44, 62, 80));
		panel_1.setBounds(0, 51, 399, 245);
		loginFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel label_1 = new JLabel("Username: ");
		label_1.setBounds(56, 56, 90, 22);
		label_1.setForeground(new Color(236, 240, 241));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(label_1);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setForeground(Color.WHITE);
		textField.setBackground(new Color(108, 122, 137));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(152, 56, 172, 20);
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel label_2 = new JLabel("Password: ");
		label_2.setBounds(56, 109, 90, 22);
		label_2.setForeground(new Color(236, 240, 241));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(label_2);

		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setForeground(Color.WHITE);
		passwordField.setBackground(new Color(108, 122, 137));
		passwordField.setBounds(152, 109, 172, 20);
		panel_1.add(passwordField);

		JButton button = new JButton("Login");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(new Color(89, 171, 227));
		button.setBounds(247, 152, 77, 37);
		panel_1.add(button);

		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminForm dash = new AdminForm();
				loginFrame.dispose();
				dash.getView();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button.setBackground(new Color(65, 131, 215));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button.setBackground(new Color(89, 171, 227));
			}
		});
	}
}
