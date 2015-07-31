package ba.bitcamp.week11.day1.exercises;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

//URL pokazatelj, locator na neki link
public class URLExamples {

	public static void main(String[] args) {
		// http://google.ba
		URL url1 = null;
		try {
			url1 = new URL("http://artsymomma.com/wp-content/uploads/2012/03/thumbprint-smiley-faces-handprints.jpg");
		} catch (MalformedURLException e) {
			System.out.println("Bad URL");
			e.printStackTrace();
			System.exit(1); // 0 program izasao, 1 neki error bio
		}
		ImageIcon imageIcon = new ImageIcon(url1);
		JFrame frame = new JFrame();
		frame.add(new JLabel(imageIcon));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setVisible(true);
		
		
		
		//Another example, spasiti sliku u jedan file bytova
		
		try {
			BufferedImage image = ImageIO.read(url1);
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
			System.exit(1);
		}
		try {
			URLConnection con = url1.openConnection();//conektuje se na taj url
			System.out.println(con.getContent()); //printamo sta se nalazi na tom url
			InputStream in = con.getInputStream(); //tok bajtova koje mozemo koristiti kasnije
			File file = new File("output.jpg"); //pravimo file u root dir
			FileOutputStream fileWrite = new FileOutputStream(file); // nacin da pisemo taj file
			//sliku ucitavamo u niz bajtova
			byte[] data = new byte[1024]; //procitani bayts, ucitacemo bytes sa slike u niz, po 1024 byta sa slike cita
			int bytesRead; //pokazuje koliko smo bajtova ucitali iz slike
			
			while((bytesRead = in.read(data, 0, data.length)) > 0){ //pita da li je br procitanih bytova >0, radi dok ima sta ictati, i sacuva ih u bytesRead
				//niz ovih bytes treba upisati u FileOutputStream
				fileWrite.write(data, 0, bytesRead);	//pise se u file niz bajtova
			}
			fileWrite.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
	}

}
