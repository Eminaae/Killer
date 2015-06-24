
public class Drink {

	//plava slova yato sto su attributi
		String name;
		boolean isSoda;
		int expirationYear;
		String colour;
		
		public String toString(){
			String s="";
			s=s+"Name" + name;
			s=s+"Is soda"+isSoda ;
			s=s+"Expiration year" + expirationYear ;
			s=s+"Colour" + colour;
			return s;
		}

	}


