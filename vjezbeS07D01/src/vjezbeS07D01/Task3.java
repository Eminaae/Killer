package vjezbeS07D01;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task3 extends JFrame{
	private static final long serialVersionUID = -967412162586509687L;
	private JPanel panel = new MyPanel();
	private String s = "";
	

	public Task3 () {
		setLayout(new BorderLayout());
		add(panel);
		
		panel.addMouseListener(new Mouse());
		setSize(500, 500);
		setLocationRelativeTo(null);
		setTitle("Task3");
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
	
	public class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				s = "Last pressed left";
				panel.repaint();
			} else if (e.getButton() == MouseEvent.BUTTON3) {
				s = "Last pressed rgiht";
				panel.repaint();
			} else if (e.getButton() == MouseEvent.BUTTON2) {
				s = "Last pressed center";
				panel.repaint();
			}
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
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

	public static void main(String[] args) {
		new Task3();

	}

}
