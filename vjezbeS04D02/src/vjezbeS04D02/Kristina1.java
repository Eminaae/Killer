package vjezbeS04D02;

import java.awt.Color;
import java.awt.Graphics;


public class Kristina1 {
	public static void draeKristina(Graphics g, String getln) {
		g.setColor(Color.BLACK);
		
		String partx1;
		String party1;
	
		TextIO.readFile("src/vjezbeS04D02/crtanje.txt");
		getln = TextIO.getln();
		
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
	}

}
