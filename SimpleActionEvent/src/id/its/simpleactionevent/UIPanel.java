package id.its.simpleactionevent;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UIPanel extends JPanel implements ActionListener {
	public UIPanel(int width, int height) {
		this.setPreferredSize(new Dimension(width, height));
		
		//buat button dan tambahkan ke panel
		String text;
		JButton button = new JButton("Click Me!");
		this.add(button);
		
		//bind event action
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Anda telah mengaktifkan action event");
	}
	
}
