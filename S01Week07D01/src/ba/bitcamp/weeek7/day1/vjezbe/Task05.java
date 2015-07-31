package ba.bitcamp.weeek7.day1.vjezbe;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task05 extends JFrame {

	private static final long serialVersionUID = 6843864018527048750L;
	private JPanel panel = new MyPanel();
	private Color pickedColor = Color.BLACK;
	private Boolean show = true;

	public Task05() {
		setLayout(new BorderLayout());
		add(panel);
		panel.addMouseListener(new Mouse());
		setTitle("Two diagonals");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if (e.getSource() == panel) {
				show = true;
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource() == panel) {
				show = false;
			}
		}
	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = 5832645691247620244L;

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			Graphics2D g2d = (Graphics2D) g;

			g2d.setColor(pickedColor);
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_OFF);
			g2d.setStroke(new BasicStroke(10));
			if (show == true) {
				g2d.drawLine(0, 0, getWidth(), getHeight());
				g2d.drawLine(getWidth(), 0, 0, getHeight());
				repaint();
			} else {
				repaint();
			}
		}
	}

	public static void main(String[] args) {
		new Task05();
	}
}
