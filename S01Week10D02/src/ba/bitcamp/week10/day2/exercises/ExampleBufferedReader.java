package ba.bitcamp.week10.day2.exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleBufferedReader {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println(br.readLine());			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			br = new BufferedReader(new FileReader(new File("text.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}