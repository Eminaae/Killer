package vjezbeS04D02;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Kristina {
	
		public static void main(String[] args) {
			DrawWindow w = new DrawWindow();
			draw(w);
		}

		public static void draw(DrawWindow w) {
			BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
			Graphics g = img.getGraphics();

			// **** Draw here ****
			g.setColor(Color.BLACK);
		
			String partx1;
			String party1;
		
			TextIO.readFile("src/vjezbeS04D02/crtanje.txt");
			String getln = TextIO.getln();
			
			String [] parts = getln.split(" ");
			String s1 = "";
			
			partx1 = parts[1];
			party1 = parts[2];
			int  duzina = 3 + partx1.length() + party1.length();
	
			s1 = getln.substring(duzina, getln.length());
			
			int x1 = Integer.parseInt(partx1);
			int y1 = Integer.parseInt(party1);
		
			if(getln.contains("S")){
			g.setColor(Color.BLACK);
			g.drawString(s1 , x1, y1);
			}
			// *******************
			w.setImage(img);

	}
}
