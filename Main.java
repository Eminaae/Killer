package Srtanje;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	/**
	 * 
	 * @param w
	 */
	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		g.setColor(Color.BLACK);
		String getln;
		
		TextIO.readFile("src/Srtanje/abc.txt");
		while(!TextIO.eof()){
		getln = TextIO.getln();
		Drawing.drawAjdin(g, getln);
		}
		w.setImage(img);
	}
}
