package Srtanje;

import java.awt.Color;
import java.awt.Graphics;

public class Drawing {

	public static void drawAjdin(Graphics g,String getln) {
		String partx1 = "";
		String partx2 = "";
		String party1 = "";
		String party2 = "";
		
		

		String[] parts = getln.split(" ");
		partx1 = parts[1];
		party1 = parts[2];
		partx2 = parts[3];
		party2 = parts[4];

		int x1 = Integer.parseInt(partx1);
		int y1 = Integer.parseInt(party1);
		int x2 = Integer.parseInt(partx2);
		int y2 = Integer.parseInt(party2);
		if (getln.contains("L")) {
			g.drawLine(x1, y1, x2, y2);

		}
	}

}
