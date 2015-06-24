package paket1;

public class Main {
	public static void main(String[]args){
		/*boolean b=true;
		
		if(b){
			System.out.println("helllo");
		}else{
			System.out.println("cao");
		}
		*/
		
		/* Program odredjuje da li je beoj poy ili negativan
			int a=4;
			if(a>0){
				System.out.println("Pozitivan broj");
			}else if (a<0){
				System.out.println("Negativan broj");
			}else if(a==0){
				System.out.println("Unesi ponovo broj");
			}else{
				System.out.println("Niste unijeli broj");
			}
		*/
		// Program odredjuje da li je broj paran ili neparan
			
	/*double a=9;
			double ostatak=a/2;
			if(a>0 && ostatak==0){
				System.out.println("Broj je paran");
			}else if (a>0 && ostatak !=0){
				System.out.println("Broj je neparan");
			}else{
				System.out.println("Niste unijeli broj!");
			}
			
	*/
		
		//Program odredjuje koji od 3 unsesena broja je najveci
		/*int a=2;
		int b=8;
		int c=6;
		
		if (a>b && a>c){
			System.out.println("a je najveci uneseni broj");
		}else if (b>c && b>a){
			System.out.println("b je najveci broj");
		}else{
			System.out.println("Najveci broj je c");
		}
		*/
		
		//Program odredjuje da li se dati broj nalayi iymedju 0 i 25, iymedju 25 i 50 ili van tih opsega
		
		
		
		/*int a=55;
		
		if (a>0 && a<25){
			System.out.println("Broj je u intervalu od 0 do 25");
		}else if (a>=25 && a<=50){
			System.out.println("Broj je u intervalu od 25 do 50");
		}else{
			System.out.println("Broj je van opsega 0 do 50");
		}
		
		
		/*Program koji ya dati rodjendan unesen u vidu dana i mjeseca odredjuje d ali je rodjendan 
		bio ili treba da bude ove godine*/
		
		int dan=31;
		int mjesec=9;
		
		if(dan>22 && mjesec==5){
			System.out.println("Upcomming BD");
		}else if(dan == 22 && mjesec == 5){
			System.out.println("Happy BD");
		}else if(mjesec <=5){
			System.out.println("Rodjendan je vec bio");
		}else if(dan==29 && mjesec==2){
			System.out.println("Ovo nije prestupna godina ");
		}else if(mjesec<1 || mjesec>12 || dan<1 || dan>31){
			System.out.println("This is not valid date");
		}else if (mjesec == 4 || mjesec == 6 || mjesec == 9 || mjesec ==11 && dan >=31 ){
			System.out.println("This month does not have 31 days");
		}else if (mjesec>5){
			System.out.println("Upcomming BD");
		}else{
			System.out.println("Wrong date");
		}
		
		/* int year=1800;
		 * if (
		 * 
		
		*/
	}

}
