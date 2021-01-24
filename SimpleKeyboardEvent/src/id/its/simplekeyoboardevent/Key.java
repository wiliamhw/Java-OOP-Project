package id.its.simplekeyoboardevent;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class Key {
	private static final int[] WIDTH = {48, 73, 127, 231};
	private static final int HEIGHT = 48;
	private static final int RELEASED = 1;
	private static final int PRESSED = 2;

	private int x;
	private int y;
	private int widthType;
	private String symbol;
	private int value;
	private int state;

	public Key(int x, int y, String symbol, int value, int widthType) {
		this.x = x;
		this.y = y;
		this.state = RELEASED;
		this.symbol = symbol;
		this.value = value;
		this.widthType = widthType;
	}

	public void render(Graphics g) {
		//render tuts sesuai dengan state
		if (this.state == RELEASED) {
			g.setColor(Color.BLUE);
		} else if (this.state == PRESSED) {
			g.setColor(Color.RED);
		} else {
			g.setColor(Color.WHITE);
		}
		g.fillRect(this.x, this.y, WIDTH[widthType], HEIGHT);
		
		//render text
		FontMetrics metrics = g.getFontMetrics(g.getFont());
		int stringPosX = (int)this.x + ((WIDTH[widthType] - metrics.stringWidth(symbol)) / 2);
		int stringPosY = this.y + (HEIGHT / 2) + 5;
		g.setColor(Color.YELLOW);
		
		g.drawString(this.symbol, stringPosX, stringPosY);
	}
	
	public boolean isSymbolMatch(int value) {
		if (this.value == value) {
			return true;
		}
		
		return false;
	}
	
	public void setPressed() {
		this.state = PRESSED;
	}
	
	public void setReleased() {
		this.state = RELEASED;
	}
}
