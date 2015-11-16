package ba.bitcamp.mouse;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PaintPanel extends JPanel{
	private static final long serialVersionUID = 3976007952746528741L;
	
	private PointArray points;
	private Color activeColor;
	private int activeSize;
	
	private static Color[] supportedColors = new Color[] {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.PINK};
	public static int[] sizeArray = new int[] {10, 15, 20};
	
	public PaintPanel(int height, int width){
		
		super();
		activeSize = 20;
		points = new PointArray();
		setSize(height, width);
		setBackground(Color.WHITE);
		
		
		
		for (int i = 0; i < supportedColors.length; i++) {
			
			JButton color = new JButton("Pick");
			
			color.setName(Integer.toString(i));
			color.setForeground(supportedColors[i]); //mijenja tekst koji se nalazi na nekom elementu
		
			color.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton cliked = (JButton)e.getSource();
					
					String name = cliked.getName();
					int index = Integer.parseInt(name);
					activeColor = supportedColors[index];
					
				}
				
			});
			add(color);
		
			
		}
		addMouseMotionListener(new MouseHandler());
		for (int i = 0; i < sizeArray.length; i++) {
			JButton paintSize = new JButton(Integer.toString(sizeArray[i]));
			paintSize.setName(Integer.toString(i));
		    paintSize.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton cliked = (JButton)e.getSource();
				String name = cliked.getName();
				int index = Integer.parseInt(name);
			    activeSize = sizeArray[index];
				
			}
			
		});
		    add(paintSize);
		}
		
		
	}
	
	@Override
	protected void paintComponent (Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < points.getLength(); i ++) {
			Point p = points.elementAt(i);
			g.setColor(p.getColor());
			g.fillOval(p.getX(), p.getY(), p.getSize(), p.getSize());
			
		}
	}
	
	private class MouseHandler implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			Point newPoint = new Point(e.getX(), e.getY(), activeColor, activeSize);
			
			if (e.isShiftDown() == true) {
				newPoint.setColor(Color.WHITE);
			}
			
			points.aadPoint(newPoint);
			repaint();
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	

}
