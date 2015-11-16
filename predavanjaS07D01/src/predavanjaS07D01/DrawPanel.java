package predavanjaS07D01;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class DrawPanel extends JPanel{
	private static final long serialVersionUID = -7396080264186095581L;
	private Color backgroundColor = Color.RED;

	public DrawPanel(int height, int width){
		setSize(width, height);
		JButton blue = new JButton("Blue");
		
		blue.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				backgroundColor = Color.BLUE;
				
			}
		});
		add(blue);
		
		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseHandler());
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); //nikada ne pozivamo direktno
		
		//repaint(); //javi javi da komponentu treba ponovo iscrtati
		//Color bc = new Color (175, 222, 221);
		//bc.getHSBColor(0.3F, 0.4F, 0.5F);
		setBackground(backgroundColor);
		g.fillOval(20, 20, 10, 10);
		
	}
	
	public void drawSquare(){
		Graphics g = super.getGraphics();
		
		g.fillRect(50, 50, 100, 100);
	}
	
	private class MouseHandler implements MouseListener, MouseMotionListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 20);
		}

		@Override
		public void mousePressed(MouseEvent e) { //samo pritisnemo
			System.out.println("Mouse pressed");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("Mouse released.");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Graphics g = getGraphics();
			g.setColor(backgroundColor);
			
		}

		@Override
		public void mouseExited(MouseEvent e) { //bio na panelu i otisao negdje drugdje
			Graphics g = getGraphics();
			g.setColor(Color.BLACK);
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {//kliknuli i pomjeramo
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 20);
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {//pokjeramo
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 20);
			
		}
		
	}

}
