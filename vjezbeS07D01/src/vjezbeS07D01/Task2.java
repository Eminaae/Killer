package vjezbeS07D01;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task2 extends JFrame{
	private static final long serialVersionUID = 6397410134013386014L;
	private JPanel panel = new MyPanel ();
	
	public Task2() {
		setLayout(new BorderLayout());
		add(panel);
		
		setSize(500, 500);
		setLocationRelativeTo(null);
		setTitle("Task2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setVisible(true);
		
	}
	
	public class MyPanel extends JPanel {
		private static final long serialVersionUID = -6496512744898145243L;
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setStroke(new BasicStroke(10));
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.drawLine(0, 0, panel.getWidth(), panel.getHeight());
			g2d.drawLine(0, panel.getHeight(), panel.getWidth(), 0);
		}
		
	}

	public static void main(String[] args) {
		new Task2();

	}

}
