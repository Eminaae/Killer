package ba.bitcamp.week07.day03.predavanja;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorPicker extends JPanel {
	private int red;
	private int green;
	private int blue;
	private JButton click;

	public ColorPicker(int width, int height) {
		initButton(width, height);
		
		int sliderHeight = height / 7;
		Dimension sliderDimension = new Dimension(width - 50, sliderHeight);
		
		// sliders
		JSlider redSlider = new JSlider(0, 255); // slider se krece od 0 do 255
		initSlider(redSlider, "red", sliderDimension);
		redSlider.setValue(0);

		JSlider greenSlider = new JSlider(0, 255);
		initSlider(greenSlider, "green", sliderDimension);
		greenSlider.setValue(0);

		JSlider blueSlider = new JSlider(0, 255);
		initSlider(blueSlider, "blue", sliderDimension);
		blueSlider.setValue(0);

		// labels
		JLabel redLabel = new JLabel("red");
		JLabel greenLabel = new JLabel("green");
		JLabel blueLabel = new JLabel("blue");

		add(click);
		add(redLabel);
		add(redSlider);

		add(greenLabel);
		add(greenSlider);
		add(blueLabel);
		add(blueSlider);
	}

	//initialization slider
	private void initSlider(JSlider slider, String name, Dimension d) {
		slider.setName(name);
		slider.setPreferredSize(d);
		slider.setValue(0);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(25);
		slider.setPaintTicks(true);
		slider.setOrientation(JSlider.VERTICAL);
		slider.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider changed = (JSlider)e.getSource();
				
				//String name = changed.getName();
				switch (name){
				case "red":
					red = changed.getValue();
					break;
				case "green":
					green = changed.getValue();
					break;
				case "blue":
					blue = changed.getValue();
					break;
				}
				updateButton();
			}
		});
	}

	private void updateButton() {
		click.setForeground(new Color(255 - red, 255 - green, 255 - blue));
		click.setBackground(new Color(red, green, blue));
	}
	
	private void initButton(int width, int height){
		click = new JButton("Click me");
		click.setFont(new Font("Serif", Font.BOLD, 25));
		click.setPreferredSize(new Dimension(width, height / 2)); // jer nam dugme zauzima pola prozora
		click.setOpaque(true);
		click.setBorderPainted(false);
		click.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
				String copy = String.format("%d,%d,%d", red, green, blue);
				clip.setContents(new StringSelection("copy"), null);
			}
		});
		updateButton();
	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Picker");
		ColorPicker cp = new ColorPicker(500, 500);
		window.add(cp);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 500);
		window.setVisible(true);
		
	}

}
