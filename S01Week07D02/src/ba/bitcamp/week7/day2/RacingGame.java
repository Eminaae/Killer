package ba.bitcamp.week7.day2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RacingGame extends JPanel{
	private int roadWidth;
	private int roadHeight;
	
	public RacingGame(int roadWidth, int roadHeight){ //we need constructor
		this.roadWidth = roadWidth;
		this.roadHeight = roadHeight;
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.drawRect(400, 500, 40, 60);
		
	}

	private static final long serialVersionUID = 6520431590417575591L;

	public static void main(String[] args) {
		RacingGame racingGame = new RacingGame(600,400);
		JFrame window = new JFrame("Racing Game");
		window.setSize(800, 600);
		window.setLocation(50, 50);
		window.setResizable(false);
		window.setContentPane(racingGame);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	
	}
}
