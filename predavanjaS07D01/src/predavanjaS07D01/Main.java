package predavanjaS07D01;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame window = new JFrame ("Out little program");
		DrawPanel dp = new  DrawPanel (500, 500);
		
		window.setBackground(Color.RED);

		window.add(dp);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 500);
		window.setVisible(true); //uvijek zadnja stvar u mainu
	
		dp.drawSquare();
		
	}

}
