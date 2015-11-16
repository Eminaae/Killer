package cardgame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;


public class GUITabel extends JFrame {
	private static final long serialVersionUID = -2870577041754803449L;
	public static BufferedImage img = null;
	public static BufferedImage playerImg = null;
	private static JPanel panel;

	private JMenuBar bar = new JMenuBar();
	public static JMenu menuGame = new JMenu("Game");
	public static JMenu menuHelp = new JMenu("Help");

	private JMenuItem newGame = new JMenuItem("New");
	private JMenuItem exitGame = new JMenuItem("Exit");
	private JMenuItem howToPlay = new JMenuItem("How to play");
	private JLabel[] cardLabels = new JLabel[5];
	private JButton button = new JButton("FINISH");
	private JPanel panel1 = new JPanel();
	private JTextArea area = new JTextArea();
	private JOptionPane pane = new JOptionPane();

	public GUITabel() {

		try {
			img = ImageIO.read(new File("greenbyrequest3.jpg"));
			playerImg = ImageIO.read(new File("player1.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		panel = new MyPanel();
		panel.setLayout(null);
		panel.add(button);

		button.setBounds(420, 380, 70, 70);
		button.setForeground(Color.BLUE);

		// Adding labels on cards
		int counter = 0;
		for (int i = 0; i < cardLabels.length; i++) {
			cardLabels[i] = new JLabel();
			cardLabels[i].setSize(110, 160);
			cardLabels[i].setFocusable(true);
			cardLabels[i].setLocation(595 - counter, 495);
			counter += 120;
			panel.add(cardLabels[i]);
			cardLabels[i].addMouseListener(new MouseHandler());
		}

		setLayout(new BorderLayout());
		add(bar, BorderLayout.NORTH);
		bar.add(menuGame);
		bar.add(menuHelp);
		exitGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		howToPlay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				pane.setOpaque(true);
				pane.setVisible(true);
				pane.setSize(200, 200);
				pane.setMessage("Igra magaraca. Cilj igre je da se skupe 4 karte istog znaka (npr. 4 kralja) i da se namagarci"
						+ "protivnik. "
						+ "Igrac koji igra prvi dobija 5 karata i on zapocinje igru. Desnom igracu od sebe salje jednu kartu"
						+ "po izboru i tako u krug. Ako igrac dobije kartu dzoker mora da je zadrzi dva kruga i ne moze da "
						+ "pritisne dugme finis iako je sakupio 4 iste karte. Nakon dva kuga moguce je poslati kartu jocker. "
						+ "Kada sakupi 4 karte igrac pritisne dugme finish, drugi igraci vide da je on zavrsio i onda i oni"
						+ "treba da pritisnu to dugme. Igrac koj posledni pritisne dugme na game table dobija slovo M. "
						+ "Kraj igre je kad jedna igrac stigne do rijeci MAGARAC on je izgubio.");

			}
		});

		menuGame.add(newGame);
		menuGame.add(exitGame);
		menuHelp.add(howToPlay);
		add(panel, BorderLayout.CENTER);
		add(panel1, BorderLayout.EAST);
		panel1.setOpaque(true);
		panel1.setLayout(new BorderLayout());
		panel1.add(area, BorderLayout.CENTER);
		area.setText("Game Table");

		setSize(1020, 728);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		try {
			CardImages.BufferCardImages();
		} catch (IOException e) {
			e.printStackTrace();
		}
		new GUITabel();

	}

	/**
	 * Paint table picture on panel
	 * 
	 * @author KrisTina
	 *
	 */
	public class MyPanel extends JPanel {
		private static final long serialVersionUID = -6446634635700606218L;
		Deck d = new Deck();

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			System.out.print("...");
			g.drawImage(img, 0, 0, img.getWidth(), img.getHeight(), null);

			g.drawImage(playerImg, 425, 10, 60, 60, null);
			g.drawImage(playerImg, 1, 238, 60, 60, null);
			g.drawImage(playerImg, 885, 238, 60, 60, null);

			System.out.print("*");

			int counter = 0;
			for (int i = 0; i < 5; i++) {
				System.out.print("-");
				g.drawImage(d.getCards().get(i).getSuitImge(), 600 - counter,
						500, 100, 150, null);
				counter += 120;
			}
			System.out.print("*");

			g.drawImage(CardImages.cardback, 520, 130, 50, 70, null);
			g.drawImage(CardImages.cardback, 460, 130, 50, 70, null);
			g.drawImage(CardImages.cardback, 400, 130, 50, 70, null);
			g.drawImage(CardImages.cardback, 340, 130, 50, 70, null);

			g.drawImage(CardImages.cardback, 720, 170, 70, 50, null);
			g.drawImage(CardImages.cardback, 720, 230, 70, 50, null);
			g.drawImage(CardImages.cardback, 720, 290, 70, 50, null);
			g.drawImage(CardImages.cardback, 720, 350, 70, 50, null);

			g.drawImage(CardImages.cardback, 140, 170, 70, 50, null);
			g.drawImage(CardImages.cardback, 140, 230, 70, 50, null);
			g.drawImage(CardImages.cardback, 140, 290, 70, 50, null);
			g.drawImage(CardImages.cardback, 140, 350, 70, 50, null);

			System.out.println(":(");

		}
	}

	/**
	 * Mouse handler implements MouseListener
	 * 
	 * @author kristina.pupavac
	 *
	 */
	public class MouseHandler implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
		

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
			for (int i = 0; i < cardLabels.length; i++) {
				System.out.println(i);
				if (e.getSource() == cardLabels[i]) {
					Border blackline = BorderFactory
							.createLineBorder(Color.CYAN);
					cardLabels[i].setBorder(blackline);
				}
			}

		}

		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("Exit");
			for (int i = 0; i < cardLabels.length; i++) {
				if (e.getSource() == cardLabels[i]) {
					Border blackline = BorderFactory
							.createLineBorder(Color.BLACK);
					cardLabels[i].setBorder(blackline);
				}
			}
		}

	}

}
