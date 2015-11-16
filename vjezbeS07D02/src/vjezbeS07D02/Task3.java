package vjezbeS07D02;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Task3 extends JFrame {
	private static final long serialVersionUID = 9127079057434370807L;
	private MyPanel panel = new MyPanel();
	private int x = 20;
	private int y = 20;
	
	private int deltaX = 1;
	private int deltaY = 1;
	
	public Task3() {
        add(panel);
        
        Timer t = new Timer(10, new Action());
		t.start();
        
		setTitle("Task3");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 8281156269736697513L;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRect(x , y, 20, 20);
		
		}
	}
	
	public class Action implements  ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		    if ( y == panel.getHeight() - 20) {
		    	deltaY = -1;
		    	x = x + deltaX;
		    	y = y + deltaY;
		    	panel.repaint();
		    } else if(x== panel.getWidth() -20) {
		    	deltaX = -1;
		    	x = x + deltaX;
		    	y += deltaY;
		    	panel.repaint();
		    } else if (y == 0) {
		    	deltaY = 1;
		    	x = x + deltaX;
		    	y += deltaY;
		    	panel.repaint();
		    } else if (x == 0) {
		    	deltaX = 1;
		    	x = x + deltaX;
		    	y += deltaY;
		    	panel.repaint();
		    } else{
		    	x = x + deltaX;
		    	y = y + deltaY;
		    	panel.repaint();
		    }
		    panel.repaint();
		}
		
	}

	public static void main(String[] args) {
		new Task3();

	}

}
