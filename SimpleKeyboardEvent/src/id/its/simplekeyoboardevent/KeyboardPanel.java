package id.its.simplekeyoboardevent;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class KeyboardPanel extends JPanel implements KeyListener, MouseListener {
	private List<Key> keys;
	private List<Key> clicks;

	public KeyboardPanel(int width, int height) {
		this.setPreferredSize(new Dimension(width, height));
		this.keys = new ArrayList<Key>();
		this.clicks = new ArrayList<Key>();
		this.keys.add(new Key(110, 207, "W", (int) 'W', 0));
		this.keys.add(new Key(110, 265, "S", (int) 'S', 0));
		this.keys.add(new Key(52, 265, "A", (int) 'A', 0));
		this.keys.add(new Key(168, 265, "D", (int) 'D', 0));
		this.keys.add(new Key(285, 265, "◀", 37, 0));
		this.keys.add(new Key(343, 265, "▼", 40, 0));
		this.keys.add(new Key(401, 265, "➤", 39, 0));
		this.keys.add(new Key(343, 207, "▲", 38, 0));
		this.keys.add(new Key(376, 323, "Ctrl", 17, 1));
		this.keys.add(new Key(52, 323, "Shift", 16, 1));
		this.keys.add(new Key(135, 323, "Space", 32, 3));
		this.keys.add(new Key(186, 131, "Enter", 10, 2));
		this.keys.add(new Key(10, 11, "Esc", 27, 0));

		this.clicks.add(new Key(143, 41, "Left Click", -1, 1));
		this.clicks.add(new Key(285, 41, "Right Click", -2, 1));

		this.addKeyListener(this);
		this.addMouseListener(this);
		this.setFocusable(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// render seluruh keys
		for (Key key : this.keys) {
			key.render(g);
		}

		// render seluruh clicks
		for (Key click : this.clicks) {
			click.render(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// do nothing
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
//		System.out.println(key);

		for (Key k : this.keys) {
			if (k.isSymbolMatch(key)) {
				k.setPressed();
				repaint();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		for (Key k : this.keys) {
			if (k.isSymbolMatch(key)) {
				k.setReleased();
				repaint();
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int target = 0;
		if (SwingUtilities.isLeftMouseButton(e)) {
			target = -1;
		} else if (SwingUtilities.isRightMouseButton(e)) {
			target = -2;
		}

		for (Key c : this.clicks) {
			if (c.isSymbolMatch(target)) {
				c.setPressed();
				repaint();
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int target = 0;
		if (SwingUtilities.isLeftMouseButton(e)) {
			target = -1;
		} else if (SwingUtilities.isRightMouseButton(e)) {
			target = -2;
		}

		for (Key c : this.clicks) {
			if (c.isSymbolMatch(target)) {
				c.setReleased();
				repaint();
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
		// do nothing
	}

	public void mouseEntered(MouseEvent e) {
		// do nothing
	}

	public void mouseExited(MouseEvent e) {
		// do nothing
	}
}
