package vjezbeS07D04;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Task3 extends JFrame{
	private static final long serialVersionUID = -3174852768629994613L;
	private JPanel panelc = new JPanel ();
	private JPanel panele = new JPanel ();
	private JTextArea field = new JTextArea("Text Area");
	private JPanel panel1 = new JPanel ();
	private JPanel panel2 = new JPanel ();
	
	public Task3() {
		setLayout(new GridLayout(1,2));
		add(panelc);
		add(panele);
		panelc.setBorder(BorderFactory.createTitledBorder("Center panel"));
		panele.setBorder(BorderFactory.createTitledBorder("East panel"));
		
		panelc.setLayout(new GridLayout(1,0));
		panelc.add(field);
		
		panele.setLayout(new GridLayout(2,1));
		panele.add(panel1);
		panele.add(panel2);

		panel1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		panel2.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		
		panel1.setLayout(new GridLayout(3, 1));
		for (int i = 1; i <= 3; i++) {
			panel1.add(new JLabel("This seems to be label " + i));
		}
		
		panel2.setLayout(new FlowLayout());
		for (int i = 1; i <= 2; i++) {
			panel2.add(new JButton("Button " +i));
		}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setTitle("Frame3");
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Task3();

	}

}
