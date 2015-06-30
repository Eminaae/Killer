package ba.bitcamp.week7.day2;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Seconds extends JFrame {
	int sec = 0;
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		g.drawString(String.valueOf(sec),10, 10);
	}
}
