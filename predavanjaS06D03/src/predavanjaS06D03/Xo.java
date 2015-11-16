package predavanjaS06D03;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Xo {
	
	private static class XO extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("XO", 20, 30);
	}
	}
	private static class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
		public ButtonHandler (JButton button) {
			super();
			this.button = button;
		}
	}

	public static void main(String[] args) {
		XO displayPanel = new XO();
		JButton button = new JButton("X");
		ButtonHandler listener = new ButtonHandler();
		button.addActionListener(listener);
		
		if (button.getText() == "X") {
			button = new JButton("Y");
		}
		
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		content.add(displayPanel, BorderLayout.BEFORE_FIRST_LINE);
		content.add(button, BorderLayout.CENTER);

		JFrame window = new JFrame("XO game");
		window.setContentPane(content);
		window.setSize(100, 100);
		window.setLocation(500, 500);
		window.setVisible(true);
		

	}

}
