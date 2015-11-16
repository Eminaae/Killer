package vjezbeS07D01;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task1 extends JFrame{
	private static final long serialVersionUID = 4289816114940791375L;
	private JLabel label = new JLabel("Not cliked . . .");
	private Font font1 = new Font("Monospaced", Font.PLAIN, 35);
	private Font font2 = new Font("Monospaced", Font.BOLD, 35);
	
	public Task1() {
		setLayout(new BorderLayout());
		add(label);
		
		label.setFont(font1);
		label.addMouseListener(new Mouse());
		label.setHorizontalAlignment(JLabel.CENTER);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setTitle("Task1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setVisible(true);
	}
	
	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource() == label) {
				label.setText("It is cliked!");
				label.setFont(font2);
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
		new Task1();

	}

}
