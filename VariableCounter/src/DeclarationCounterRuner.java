import java.io.IOException;


public class DeclarationCounterRuner {

	public static void main(String[] args) throws IOException {
		VarCount counter =new VarCount("declarations");
		System.out.println(counter.count());

	}

}
