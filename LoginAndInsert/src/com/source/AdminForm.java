package com.source;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;


public class AdminForm {

	private JFrame adminFrame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public AdminForm() {
		initialize();
	}
	
	public void getView() {
		adminFrame.setVisible(true);
	}

	private void initialize() {
		
		adminFrame = new JFrame();
		adminFrame.setResizable(false);
		adminFrame.setBounds(100, 100, 405, 625);
		adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminFrame.getContentPane().setLayout(null);
		adminFrame.setLocationRelativeTo(null);
		adminFrame.setTitle("Admin View");
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 400, 52);
		panel.setBackground(new Color(248, 148, 6));
		adminFrame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("Insert New User");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(label, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(44, 62, 80));
		panel_1.setBounds(0, 51, 399, 545);
		adminFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_1 = new JLabel("First Name:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setBounds(43, 44, 90, 22);
		label_1.setForeground(new Color(236, 240, 241));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(label_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setForeground(Color.WHITE);
		textField.setBackground(new Color(108, 122, 137));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(139, 45, 172, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("Last Name:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setForeground(new Color(236, 240, 241));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(43, 77, 90, 22);
		panel_1.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(108, 122, 137));
		textField_1.setBounds(139, 80, 172, 20);
		panel_1.add(textField_1);
		
		JLabel label_3 = new JLabel("Email Address:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setVerticalAlignment(SwingConstants.BOTTOM);
		label_3.setForeground(new Color(236, 240, 241));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(10, 110, 123, 22);
		panel_1.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(108, 122, 137));
		textField_2.setBounds(139, 145, 172, 20);
		panel_1.add(textField_2);
		
		JLabel label_4 = new JLabel("Phone Number:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setVerticalAlignment(SwingConstants.BOTTOM);
		label_4.setForeground(new Color(236, 240, 241));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(10, 143, 123, 22);
		panel_1.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(108, 122, 137));
		textField_3.setBounds(139, 112, 172, 20);
		panel_1.add(textField_3);
		
		JLabel label_5 = new JLabel("Birth Date:");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setVerticalAlignment(SwingConstants.BOTTOM);
		label_5.setForeground(new Color(236, 240, 241));
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(43, 176, 90, 22);
		panel_1.add(label_5);
		
		MaskFormatter dateMask = null;
		try {
		    dateMask = new MaskFormatter("##/##/####");
		    dateMask.setPlaceholderCharacter('x');
		    dateMask.setValidCharacters("0123456789");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JFormattedTextField formattedTextField = new JFormattedTextField(dateMask);
		formattedTextField.setHorizontalAlignment(SwingConstants.LEFT);
		formattedTextField.setForeground(Color.WHITE);
		formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		formattedTextField.setColumns(10);
		formattedTextField.setBackground(new Color(108, 122, 137));
		formattedTextField.setBounds(139, 178, 172, 20);
		panel_1.add(formattedTextField);
		
		JLabel label_6 = new JLabel("Address:");
		label_6.setVerticalAlignment(SwingConstants.BOTTOM);
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setForeground(new Color(236, 240, 241));
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_6.setBounds(43, 209, 90, 22);
		panel_1.add(label_6);
		label_6.setVerticalAlignment(SwingConstants.NORTH);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(139, 209, 213, 91);
		textArea.setForeground(new Color(236, 240, 241));
		textArea.setBackground(new Color(108, 122, 137));
		panel_1.add(textArea);
		
		JLabel label_7 = new JLabel("Membership:");
		label_7.setVerticalAlignment(SwingConstants.BOTTOM);
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setForeground(new Color(236, 240, 241));
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_7.setBounds(27, 309, 106, 22);
		panel_1.add(label_7);
		
		String[] memberships = {"1 month", "3 months", "6 months"};
		JComboBox comboBox = new JComboBox(memberships);
		comboBox.setForeground(new Color(236, 240, 241));
		comboBox.setBackground(new Color(108, 122, 137));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(139, 311, 172, 20);
		panel_1.add(comboBox);
		
		JLabel label_8 = new JLabel("Payment:");
		label_8.setVerticalAlignment(SwingConstants.BOTTOM);
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setForeground(new Color(236, 240, 241));
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_8.setBounds(10, 342, 123, 22);
		panel_1.add(label_8);
		
		JRadioButton rdbtnVisa = new JRadioButton("Visa");
		rdbtnVisa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnVisa.setForeground(new Color(236, 240, 241));
		rdbtnVisa.setBackground(new Color(108, 122, 137));
		rdbtnVisa.setBounds(149, 343, 52, 23);
		panel_1.add(rdbtnVisa);
		
		JRadioButton rdbtnPaypal = new JRadioButton("Paypal");
		rdbtnPaypal.setForeground(new Color(236, 240, 241));
		rdbtnPaypal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnPaypal.setBackground(new Color(108, 122, 137));
		rdbtnPaypal.setBounds(218, 343, 73, 23);
		panel_1.add(rdbtnPaypal);
		
		JCheckBox checkBox = new JCheckBox("User agree to terms and conditions");
		checkBox.setForeground(new Color(236, 240, 241));
		checkBox.setBackground(new Color(108, 122, 137));
		checkBox.setBounds(159, 405, 193, 23);
		panel_1.add(checkBox);
		
		JButton button = new JButton("Insert");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(new Color(89, 171, 227));
		button.setBounds(275, 435, 77, 37);
		panel_1.add(button);
		
		JButton button1 = new JButton("Log Out");
		button1.setBounds(44, 480, 89, 23);
		button1.setForeground(Color.WHITE);
		button1.setBackground(new Color(240, 52, 52));
		panel_1.add(button1);
		
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textArea.setText("");
				comboBox.setSelectedIndex(0);
				formattedTextField.setText("");
				rdbtnVisa.setSelected(false);
				rdbtnPaypal.setSelected(false);
				checkBox.setSelected(false);
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
		
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginForm loginForm = new LoginForm();
				adminFrame.dispose();
				loginForm.getView();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				button1.setBackground(new Color(150, 40, 27));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button1.setBackground(new Color(240, 52, 52));
			}
		});	
	}
}
