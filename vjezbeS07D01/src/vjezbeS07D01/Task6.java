package vjezbeS07D01;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Task6 extends JFrame{
	private static final long serialVersionUID = 4778679999832524486L;
	private JPanel panel = new MyPanel();
	private String s = "";
	
	public Task6() {
		setLayout(new BorderLayout());
		add(panel);
        
	    panel.addMouseMotionListener(new Mouse());
		setSize(500, 500);
		setLocationRelativeTo(null);
		setTitle("Task6");
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
	
	public class Mouse implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			if (e.getSource() == panel) {
				s = "X: "+ e.getX() + " Y: " + e.getY();
				panel.repaint();
			}
			
		}
		
	}


	public static void main(String[] args) {
		new Task6();

	}

}
