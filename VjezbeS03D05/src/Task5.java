/*
 * Napraviti metodu koja prima dva cijela broja, 𝑀 i 𝑁, i jedan Graphics objekat (treba vam za crtanje). Nacrtati na ekran 𝑀 𝑥 𝑁 kvadrata. Koristite podlogu koju sam vam napravio 
 * kada smo radili Introduction to GUI.
 * Metoda:void drawRectangles(int n, int m, Graphics g) 
 * Primjeri
 * drawRectangles(4, 6, g)
 */
import java.awt.Color;
//import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Task5 {
	public static void drawRectangles(int n, int m, Graphics g) {
		g.setColor(Color.BLACK);
		int x = 0;
		int y = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				x = j * 50 + 100;
			    y = i * 50 + 100;
			    g.drawRect(x, y, 50, 50);
			}
		}
	}

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();

		// **** Draw here ****
		drawRectangles(4, 6, g);

		// *******************
		w.setImage(img);
	}

}
