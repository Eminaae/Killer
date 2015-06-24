

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
		
		//Task 01
		/*g.setColor(Color.RED);
		g.drawOval(60, 60, 30, 60);
		
		
		g.setColor(Color.BLUE);
		g.drawLine(120, 120, 120, 60);
		*/
		
		
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
		
		g.setColor(Color.RED);
		g.drawRect(0, 0, 1000, 1000);
		g.fillRect(0, 0, 1000, 1000);
		int p;
		for (int i = 0; i <= 1000; i++){
			for (int j = 0; j <= 1000; j++){
				p = i*j;
				if(i % 2 == 0 && j % 2 == 0){
				g.setColor(Color.green);
				}
	
	}	
		
		
		// *******************
		w.setImage(img);
	}
}
}
