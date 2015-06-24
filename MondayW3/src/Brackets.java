import java.util.Scanner;
public class Brackets {


	        public static void main(String[] args) {
	                Scanner in = new Scanner(System.in);
	                String bracket = in.nextLine();
	                int length = bracket.length();

	                System.out.println(length);

	                int o = 0; // open brackets
	                int c = 0; // closed brackets
	                char karakter;
	                boolean greska = false;

	                for (int i = 0; i <= length - 1; i++) {
	                        karakter = bracket.charAt(i);
	                        if (karakter == '{') {
	                                o++;
	                        } else {
	                                c++;
	                        }
	                        if (c > o) {
	                                greska = true;
	                        }
	                }

	                if (c != o) {
	                        greska = true;
	                }
	                if (greska == true) {
	                        System.out.println("Greska");
	                } else
	                        System.out.println("Nije greska");
	        }

	}