package predavanjaS11D01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

	public static void main(String[] args) {

		try {
			URL devlUrl = new URL("http://www.devlogic.eu");
			URLConnection conn = devlUrl.openConnection();
			InputStream in = conn.getInputStream();
			String res = "";
			BufferedReader br = new BufferedReader (new InputStreamReader(in));
			String line = null;
			while ((line = br.readLine()) != null) {
				res += "\n" + line;
			}
			System.out.println(res);
		} catch (MalformedURLException e) {
			System.err.println("URL not OK!!!");
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
			
		}
	}

}
