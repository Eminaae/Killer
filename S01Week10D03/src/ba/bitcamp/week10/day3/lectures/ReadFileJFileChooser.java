package ba.bitcamp.week10.day3.lectures;

import java.io.File;

import javax.swing.JFileChooser;

public class ReadFileJFileChooser {

	
	public static void main(String[] args){
    File f = new File("Users/emina.arapcic/Desktop/test/test.txt");
    JFileChooser jfc = new JFileChooser(System.getProperty("test.txt"));
    //File f = null;
    int option = jfc.showOpenDialog(jfc);
    if(option == JFileChooser.APPROVE_OPTION){
    	f = jfc.getSelectedFile();
    }
    System.out.println(f);
}
}
