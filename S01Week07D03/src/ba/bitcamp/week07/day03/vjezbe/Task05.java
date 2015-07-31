package ba.bitcamp.week07.day03.vjezbe;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

import ba.bitcamp.week07.day03.predavanja.ColorPicker;

public class Task05 extends JFrame{
	
	private JPanel panel = new JPanel();
	private int red;
	private int green;
	private int blue;
	
	public Task05(){
		
		//sliders
		JSlider redSlider = new JSlider(0, 255);
		redSlider.setValue(0);
		
		JSlider greenSlider = new JSlider(0, 255);
		greenSlider.setValue(0);
		
		JSlider blueSlider = new JSlider(0, 255);
		blueSlider.setValue(0);
		
		add(panel);		
		add(redSlider);
		add(greenSlider);
		add(blueSlider);
			
	}
	
	private void initSlider(JSlider slider, String name){
		
	}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		
		window.setSize(300, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

}
