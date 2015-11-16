package predavanjaS07D02;

import java.awt.Color;
import java.awt.Graphics;

public class Vehicle {
	private static final int STEP = 5;
	private int x;
	private int y;
	
	private Color color;
	
	public Vehicle(int x, int y, Color color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void draw (Graphics g) {
		g.setColor(Color.BLUE);
		g.drawRect(x, y, 40, 60);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void moveLeft() {
		x -= STEP;
		
	}
	
	public void moveRight() {
		y -= STEP;
		
	}


}
