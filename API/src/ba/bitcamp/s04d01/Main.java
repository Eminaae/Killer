package ba.bitcamp.s04d01;



import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		Draw w = new Draw();
		draw(w);
	}

	public static void draw(Draw w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		
		
		g.setColor(Color.BLACK);
		g.drawRect(240, 80, 160, 50);
		g.drawRect(30, 200, 80, 50);
		g.drawRect(130, 200, 80, 50);
		g.drawRect(230, 200, 80, 50);
		g.drawRect(330, 200, 80, 50);
		g.drawRect(430, 200, 80, 50);
		g.drawRect(530, 200, 80, 50);
		
		g.drawString("API Packages", 280, 110);
		g.drawString("lang", 50, 230);
		g.drawString("util", 150, 230);
		g.drawString("io", 250, 230);
		g.drawString("awt", 350, 230);
		g.drawString("net", 450, 230);
		g.drawString("applet", 550, 230);
		
		
		g.drawLine(60, 170, 570, 170);
		g.drawLine(320, 170, 320, 130);
		
		
	
		
		
		/*g.setColor(Color.orange);
		g.drawOval(120, 120, 120, 60);
		g.fillOval(120, 120, 120, 60);
	
		
		g.drawString("T", 460, 160);
		g.drawString("S", 430, 150);
		g.drawString("W", 480, 170);
		g.drawString("B={!, &, S}" , 430, 200);
		
		g.setColor(Color.GREEN);
		g.drawOval(400, 120, 120, 60);
		
		g.drawString("!", 160, 160);
		g.drawString("&", 200, 168);
		g.drawString("I", 180, 170);
		
		g.drawString("A={T, S, W}" , 150, 200);
		*/
		
		
		
	
		/*g.setColor(Color.red);
		ç

		g.drawString("T", 260, 160);
		g.drawString("&", 170, 150);
		g.drawString("W", 280, 170);
		g.drawString("A={!, &, I}" , 150, 200);
		
		g.setColor(Color.orange);
		g.drawOval(120, 120, 120, 60);
		
		g.drawString("!", 160, 160);
		g.drawString("&", 270, 150);
		g.drawString("I", 180, 170);
		g.drawString("B={T, &, W}" , 240, 200);
		
		*/
	
		
		
		// *******************
		w.setImage(img);
	}
}

