import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	private static final long serialVersionUID = 5440746915757404937L;
	private Color backgroundColor = Color.RED;

	public DrawPanel(int width, int height) {
		setSize(width, height);

		JButton blue = new JButton("BLUE"); // click on button changes
											// background to blue

		blue.addActionListener(new ActionListener() { // Anonymous class

			@Override
			public void actionPerformed(ActionEvent e) {
				backgroundColor = Color.BLUE;
			}
		});

		add(blue);
		MouseHandler mh = new MouseHandler();
		addMouseListener(mh);
		addMouseMotionListener(mh);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Color bc = new Color(175,222,221); //RGB color, HSV

		// setBackground(bc);
		setBackground(backgroundColor);
		g.fillOval(20, 20, 10, 10);

	}

	public void drawSquare() {
		Graphics g = super.getGraphics();
		g.fillRect(50, 50, 100, 100);
	}
	
	//Nested class
	private class MouseHandler implements MouseListener, MouseMotionListener{

		@Override
		public void mouseClicked(MouseEvent e) { //when user clicks we draw circle on that place, MouseEvent had position x,y 
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 20);
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("Pressed");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("Released");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Graphics g = getGraphics();
			g.setColor(backgroundColor);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Graphics g = getGraphics();
			g.setColor(Color.BLACK);
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 20);
			
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 20);
			
			
		}
		
		
	}

}
