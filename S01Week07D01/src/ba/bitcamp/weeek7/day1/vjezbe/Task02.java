package ba.bitcamp.weeek7.day1.vjezbe;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task02 extends JFrame {

	private static final long serialVersionUID = 6843864018527048750L;
	private JPanel panel = new MyPanel();
	private Color pickedColor = Color.BLACK;

	public Task02() {
		setLayout(new BorderLayout());
		add(panel);
		setTitle("Two diagonals");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class MyPanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			Graphics2D g2d = (Graphics2D) g;

			g2d.setColor(pickedColor);
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
			g2d.setStroke(new BasicStroke(10));
			g2d.drawLine(0, 0, getWidth(), getHeight());
			g2d.drawLine(getWidth(), 0, 0, getHeight());
		}
	}

	public static void main(String[] args) {
		new Task02();
	}
}
