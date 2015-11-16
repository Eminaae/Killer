import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		g.setColor(Color.YELLOW);
		g.drawOval (100, 100, 300, 300);
		g.fillOval (100, 100, 300, 300);
		
		g.setColor(Color.BLUE);
		g.drawOval (140, 100, 300, 300);
		g.fillOval (140, 100, 300, 300);
		
		g.setColor(Color.WHITE);
		g.drawLine(180, 150, 400, 150);
		
		
//		
//		int x;
//		int y;
//	
//		for (int row = 0; row < 8; row++) {
//			for ( int col = 0; col < 8; col++){
//			x = row * 90;
//			y = col * 90;
//			 if((row % 2 == 0) == (col % 2 == 0)){
//				 g.setColor(Color.BLACK);
//				g.fillRect(x, y, 90, 90);
//			 } else {
//			 g.setColor(Color.WHITE);
//			 g.fillRect(x, y, 90, 90);
//			 }
//		}      
//        		
//		g.setColor(Color.RED);
//		g.drawLine(30, 20 , 40 , 10);
//		g.drawLine(40, 10, 40, 40);
//		g.drawOval(50, 10, 20, 30);
//		
//		g.setColor(Color.BLUE); 
//	    g.drawOval(100, 100, 200, 150);
//	    g.drawString("1.", 150 , 150);
//	    g.drawString("5.", 170 , 150);
//	    g.drawString("7.", 190 , 150);
//	    g.drawString("A = {1, 5, 7}", 160, 280);
//	    g.setColor(Color.PINK);
//	    g.drawOval(350, 100, 200, 150);
//	    g.drawString("3.", 450 , 150);
//	    g.drawString("5.", 470 , 150);
//	    g.drawString("4.", 490 , 150);
//	    g.drawString("B = {3 , 5, 4}", 420, 280);
//	    
//	    g.setColor(Color.RED); 
//	    g.drawOval(500, 500, 200, 150);
//	    g.drawString("1.", 550 , 600);
//	    g.drawString("5.", 670 , 600);
//	    g.drawString("7.", 550 , 550);
//	    g.setColor(Color.GREEN);
//	    g.drawOval(600, 500, 200, 150);
//	    g.drawString("3.", 780 , 600);
//	    g.drawString("4.", 710 , 600);
//	   
	    
	    
//		g.drawOval(100, 100, 400, 100);
		
//		g.setColor(Color.RED);
//		g.setFont(new Font("Cambria", Font.BOLD, 18));
//		g.drawString("BitCamp <3", 250, 150);
//		
//		g.setColor(Color.BLUE);
//		g.drawLine(100, 200, 500, 200);
		
		// *******************
		w.setImage(img);
	}
}
