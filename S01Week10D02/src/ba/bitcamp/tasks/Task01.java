package ba.bitcamp.tasks;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class Task01 {

       public static void main(String[] args) {
               PrintWriter pw = new PrintWriter(System.out);
               String s = "";

               try {
                       pw = new PrintWriter(new File("text1.txt"));
                       for(int i = 1; i <= 100; i++){
                               s = "" + i + " string ";
                               pw.write(s);
                               System.out.print(s);
                               pw.flush();                        
                       }
                       
               } catch (FileNotFoundException e) {
                       e.printStackTrace();
               }
               pw.close();
       }

}
