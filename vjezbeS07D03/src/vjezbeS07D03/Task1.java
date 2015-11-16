package vjezbeS07D03;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Task1 extends JFrame {
	private static final long serialVersionUID = -3707340644838177626L;
	private JPanel panel = new JPanel();
	private JSlider slider = new JSlider(0, 100, 0);
	private JLabel text = new JLabel("Example");

	public Task1() {
		add(panel);
		panel.add(text);
		panel.add(slider);
		panel.setLayout(new GridLayout(2, 10));
		text.setHorizontalAlignment(JLabel.CENTER);

		slider.addChangeListener(new Change());
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Task1");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	private class Change implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			//slider.setToolTipText(slider.getValue() + "");
			text.setFont(new Font("Serif", Font.BOLD, slider.getValue()));
		}

	}

	public static void main(String[] args) {
		new Task1();

	}

}
