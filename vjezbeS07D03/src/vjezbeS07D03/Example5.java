package vjezbeS07D03;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Example5 extends JFrame {
	private static final long serialVersionUID = 4301009029142400123L;

	private JSlider slider = new JSlider(0, 100, 0);
	
	public Example5() {
		add(slider);
		slider.addChangeListener(new Change());
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JSlider example");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private class Change implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			slider.setToolTipText(slider.getValue() + "");
		}
		
	}
	
	public static void main(String[] args) {
		new Example5();
	}

}