package id.its.simplekeyoboardevent;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Simple Keyboard Event");

				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setContentPane(new KeyboardPanel(510, 440));
				frame.getContentPane().setBackground(new Color(240, 255, 240));
				frame.setResizable(false);
				frame.setLocationRelativeTo(null);
				frame.setTitle("Keyboard Panel");
				frame.getContentPane().setLayout(null);
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}
