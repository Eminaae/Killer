package predavanjaS06D03;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HalloWorldGUI2 {

	private static class TestPanel extends JPanel {
		public void PaintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Test", 10, 10);
		}
	}

	private static class HelloWorldDisplay extends TestPanel {
		public void paintComponent(Graphics g) {
			// super.paintComponent (g); //ispisuje prethodni panel
			g.drawString("Hello World!", 20, 30);
		}
	}

	private static class ButtonHandler2 implements ActionListener {
		JButton button;

		public ButtonHandler2(JButton button) {
			super();
			this.button = button;
		}

		public void actionPerformed(ActionEvent e) {
			String buttonText = button.getText();
			button.setText(buttonText + buttonText);
		}
	}

	private static class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// System.exit(0);
		}
	}

	public static void main(String[] args) {
		HelloWorldDisplay displayPanel = new HelloWorldDisplay();
		JButton okButton = new JButton("OK");
		ButtonHandler listener = new ButtonHandler();
		okButton.addActionListener(listener); // moguce dva ili vise listenersa
		
		okButton.addActionListener(new ButtonHandler2(okButton));
		
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		content.add(displayPanel, BorderLayout.CENTER);
		content.add(okButton, BorderLayout.SOUTH);

		JFrame window = new JFrame("GUI Test");
		window.setContentPane(content);
		window.setSize(700, 100);
		window.setLocation(500, 700);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // nije vezan sa
																// dugmetom
	}

}
