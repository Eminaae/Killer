import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class DrawFromFile {

	public static void main(String[] args) {
		TextIO.readFile("Users/emina.arapcic/Desktop/drawing.txt");
		
		
			DrawFromFile w = new DrawFromFile();
			draw(w);
		}

		public static void draw(DrawFromFile w) {
			BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
			Graphics g = img.getGraphics();
			g.setColor(Color.BLACK);
			String partx1;
			String partx2;
			String party1;
			String party2;
			
			TextIO.readFile("src/Srtanje/abc.txt");
			String getln = TextIO.getln();
			String [] parts = getln.split(" ");
			partx1 = parts[1];
			party1 = parts[2];
			partx2 = parts[3];
			party2 = parts[4];
			
			int x1 = Integer.parseInt(partx1);
			int y1 = Integer.parseInt(party1);
			int x2 = Integer.parseInt(partx2);
			int y2 = Integer.parseInt(party2);
			if(getln.contains("L")){
			g.drawLine(x1, y1, x2, y2);
			}
			w.setImage(img);
		   }

		private void setImage(BufferedImage img) {
			// TODO Auto-generated method stub
			
		}

	}


