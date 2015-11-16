package predavanjaS07D02;

import javax.swing.JFrame;

public class GameRunner extends JFrame {
	private static final long serialVersionUID = -4430592327749979353L;

	public static void main(String[] args) {
		RacingGame racingGame = new RacingGame(600, 400);
		JFrame window = new JFrame ("Racing Game");
		window.setSize(800, 600);
		window.setLocation(50, 50);
		window.setResizable(false);
		window.setContentPane(racingGame);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}
