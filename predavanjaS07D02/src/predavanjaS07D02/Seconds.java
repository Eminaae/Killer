package predavanjaS07D02;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Seconds extends JFrame{
	private static final long serialVersionUID = 3542691328342671274L;
	private JPanel panel = new JPanel ();
	String s = "";
	int sec = 0;
	
	public Seconds () {
		setLayout(new BorderLayout());
		add (panel);
		
		
		setSize(500, 500);
		setLocationRelativeTo(null);
		setTitle("Seconds");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setVisible(true);
		
	}
	public class MyPanel extends JPanel {
		private static final long serialVersionUID = -6496512744898145243L;
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			g.drawString(s, 200, 250);
	
		}
	}
	

	public static void main(String[] args) {
		new Seconds();

	}

	}
