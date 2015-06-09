
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Draw w = new Draw();
		draw(w);
	}

	public static void draw(Draw w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****

		g.setColor(Color.BLACK);
		String partx;
		String party;
		String partwidth;
		String parth;

		//TextIO.readFile("src/infos");
		
			//String getln = TextIO.getln();
			String[] parts = getln.split(" ");

			System.out.println(Arrays.toString(parts));
			partx = parts[1];
			party = parts[2];
			partwidth = parts[3];

			// System.out.println(Arrays.toString(parts));
			parth = parts[4];

			int x = Integer.parseInt(partx);
			int y = Integer.parseInt(party);
			int width = Integer.parseInt(partwidth);
			int h = Integer.parseInt(parth);

			if (getln.contains("DO")) {
				g.setColor(Color.BLACK);
				g.drawOval(x, y, width, h);
			}
			if (getln.contains("DFO")) {
				g.setColor(Color.ORANGE);
				g.fillOval(x, y, width, h);
			}
		
		w.setImage(img);

	}

}
