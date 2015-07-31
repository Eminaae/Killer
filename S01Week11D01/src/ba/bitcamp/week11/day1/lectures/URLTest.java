package ba.bitcamp.week11.day1.lectures;

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
			URL abhUrl = new URL("http://www.atlantbh.com"); //constructor
			URLConnection conn = abhUrl.openConnection();
			InputStream in = conn.getInputStream();
			String res = "";
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
					String line = null;
			while((line = br.readLine()) != null){
				res += line + "\n"  ;
			}
			System.out.println(res);
			
		} catch (MalformedURLException e) {
			System.err.println("URL not ok");

		} catch (IOException e) {
			System.err.println("Error" + e.getMessage());
		}
	}
}
