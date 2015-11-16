package vjezbeS04D01;
/*
 * 
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Task6 {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();

		// **** Draw here ****
		g.setColor(Color.BLACK);
		g.drawRect(500, 100, 100, 50);
		g.drawString("API Packeges", 515, 130);
		
		g.drawLine(550, 150, 550, 200);
		g.drawLine(100, 200, 1000, 200);
		
		g.drawLine(100, 200, 100, 250);
		g.drawLine(1000, 200, 1000, 250);
		
		g.drawLine(250, 200, 250, 250);
		g.drawLine(850, 200, 850, 250);
		
		g.drawLine(450, 200, 450, 250);
		g.drawLine(650, 200, 650, 250);
		
		g.drawRect(50, 250, 100, 50);
		g.drawString("lang", 60, 275);
		
		g.drawRect(200, 250, 100, 50);
		g.drawString("util", 210, 275);
		
		g.drawRect(400, 250, 100, 50);
		g.drawString("io", 410, 275);
		
		g.drawRect(600, 250, 100, 50);
		g.drawString("awt", 610, 275);
		
		g.drawRect(800, 250, 100, 50);
		g.drawString("net", 810, 275);
		
		g.drawRect(950, 250, 100, 50);
		g.drawString("applet", 960, 275);
		
		
	

		// *******************
		w.setImage(img);
	}

}
