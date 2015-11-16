package predavanjaS10D03;

import java.io.File;
import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("os.name"));
	
		File f = new File (System.getProperty("user.home"));
		System.out.println(Arrays.toString(f.list()));
	}

}
