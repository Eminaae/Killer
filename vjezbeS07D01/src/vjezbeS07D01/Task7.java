package vjezbeS07D01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task7 extends JFrame {
	private static final long serialVersionUID = -2565892980746712427L;
	private int values[] = { 10, 20, 50, 30, 50, 40, 20, 0, 10, 40 };
	private JPanel panel = new MyPanel();

	public Task7() {
		setLayout(new BorderLayout());
		add(panel);

		setSize(500, 500);
		setLocationRelativeTo(null);
		setTitle("Task6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public class MyPanel extends JPanel {
		private static final long serialVersionUID = -7006019221433685879L;

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			int counter = 0;
			super.paintComponent(g);
			for (int i = 0; i < values.length; i++) {
				Color bc = new Color(70, 72, 138);
				g.setColor(bc);
				g.fillRect(100 + counter, 100 - values[i], 50, values[i]);
				counter += 51;
			}
		}

	}

	public static void main(String[] args) {
		new Task7();

	}

}
