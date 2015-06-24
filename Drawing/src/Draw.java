
	import java.awt.Graphics;
	import java.awt.image.BufferedImage;

	import javax.swing.JFrame;
	import javax.swing.JPanel;

	public class Draw extends JFrame {// javax.swing.RootPaneContainer
		private static final long serialVersionUID = 6569564515489073403L;
		
		private BufferedImage img;
		private JPanel imgPanel;
		
		public Draw() {
			imgPanel = new JPanel() {//Creates a new JPanel with a double buffer and a flow layout.
				private static final long serialVersionUID = -6089197466826384928L;

				@Override
				protected void paintComponent(Graphics g) {//void Draw.Draw().new JPanel() {...}.paintComponent(Graphics g)
					super.paintComponent(g); //For examples and task-oriented documentation for JPanel
					if (img != null) {
						g.drawImage(img, 0, 0, null);
					}
				}
			};
			
			add(imgPanel);//JPanel Draw.imgPanel
			setSize(600, 400);//setSize(int width, int height)
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//EXIT_ON_CLOSE (defined in JFrame):
			//Exit the application using the System exit method.
			setLocationRelativeTo(null);
			setTitle("JAVA Drawing");
			setVisible(true);
		}
		
		public void setImage(BufferedImage img) {
			this.img = img;
			imgPanel.updateUI();
		}
	}



