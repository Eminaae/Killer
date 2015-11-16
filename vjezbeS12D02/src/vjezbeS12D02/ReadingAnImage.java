package vjezbeS12D02;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class ReadingAnImage extends JFrame {
	private static final long serialVersionUID = -2789360262806019681L;
	private JPanel panel = new JPanel();
	Thread t;

	public ReadingAnImage() {
		add(panel);
		panel.setToolTipText("Reading An Image ");

		setVisible(true);
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new ReadingAnImage();
		
	}
	
	public class MyThread implements Runnable {

		@Override
		public void run() {
			BufferedImage image = new BufferedImage(width, height, imageType);
			
		}
		
	}

}
