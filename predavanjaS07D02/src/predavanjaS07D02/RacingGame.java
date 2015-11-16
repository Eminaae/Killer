package predavanjaS07D02;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JPanel;

public class RacingGame extends JPanel{
	private static final long serialVersionUID = 1666670180268156147L;
	private int roadWidth;
	private int roadHeigth;
	private Vehicle myVehicle;
	
	
	 public RacingGame(int roadWidth, int roadHeigth){
			this.roadWidth = roadWidth;
			this.roadHeigth = roadHeigth;
			
			this.myVehicle = new Vehicle (roadWidth/2, roadHeigth - 90, Color.BLUE);
			
			addKeyListener (new MyVehicleControl());
			addMouseListener(new MouseAdapter(){
				
			});
		}
    
	@Override
	protected void paintComponent(Graphics g) {
	
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.drawRect(roadWidth/2 -20, roadHeigth -90, roadWidth, roadHeigth);
		
	}
	

	
	private class MyVehicleControl extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				myVehicle.moveLeft();
			} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				myVehicle.moveRight();
		}
			repaint();
		}
	}
	
	public static void main(String[] args) {
		//new RacingGame();

	}

}
