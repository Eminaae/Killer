package vjezbeS07D01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task4 extends JFrame{
	private static final long serialVersionUID = -5702218992650260385L;
	private JLabel label = new JLabel("Game");
	private Font font1 = new Font("Monospaced", Font.ITALIC, 35);
	
	
	public Task4 () {
		setLayout(new BorderLayout());
		add(label);
		
		label.setFont(font1);
		label.addMouseListener(new Mouse());
		label.setHorizontalAlignment(JLabel.CENTER);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setTitle("Task3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setVisible(true);
	}
	
	public class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			if (e.getSource() == label) {
				label.setFont(new Font("Monospaced", Font.BOLD, 35));
			}
			
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			if (e.getSource() == label) {
				label.setFont(font1);
			}
			
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if (e.getSource() == label) {
				label.setForeground(Color.LIGHT_GRAY);
			}
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource() == label) {
				label.setForeground(Color.BLACK);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new Task4();

	}

}
