package predavanjaS12D05;

import java.awt.GridLayout;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUISearch extends JFrame{
	private static final long serialVersionUID = -4804340284394663899L;
	private JTextField searchField = new JTextField();
	private JButton serchButton = new JButton("SERACH");
	private JTextArea textArea = new JTextArea();

	
	public GUISearch () {
		add(searchField);
		add(serchButton);
		add(textArea);
		
		
		setLayout(new GridLayout(2, 2));
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		//new GUISearch();
		
		URL url;
		try {
			url = new URL("http://www.klix.ba");
			
			URLConnection c = url.openConnection();
			System.out.println(c);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		


	}

}
