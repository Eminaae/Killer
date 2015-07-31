package ba.bitcamp.week10.day3.lectures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class ReadFile {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		File file = new File(in.nextLine());
		
		if(file.exists()){
			if(file.isFile()){
				Scanner sc = null;
				try {
					sc = new Scanner(file);
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
				TreeSet<String> ts = new TreeSet<String>();
				while (sc.hasNext()) {
					ts.add(sc.next().toLowerCase());
				}
				ArrayList<String> al = new ArrayList<String>(ts);
				for (int i = 0; i < al.size(); i++) {
					System.out.println(al.get(i));
				}
			}
		}
	}
}
