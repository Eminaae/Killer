package ba.bitcamp.weeek7.day1.vjezbe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task01 extends JFrame{

	private static final long serialVersionUID = 7665158768600725971L;
	private JLabel label = new JLabel("Not Clicked");
	private Font font1 = new Font("Monospaced", Font.ITALIC, 35);
	
	public Task01(){
		setLayout(new BorderLayout());
		add(label);
		label.addMouseListener(new Mouse());
		setSize(300,450);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class Mouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(e.getButton());
			if (e.getSource() == label) {
				label.setFont(font1);
				label.setText("Its clicked");
				label.repaint(); // Force paintComponent method
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
		new Task01();
	}

}
