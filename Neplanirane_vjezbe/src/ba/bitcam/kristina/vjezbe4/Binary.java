package ba.bitcam.kristina.vjezbe4;

public class Binary {

	public static void main(String[] args) {
		 int num1 = 0b111000110101;
		 int num2 = 0b10101010;
		 
		 int num3 = 0b1011100011;
		 int num4 = 0b111111111;
		 
		 int num5 = 0b11111111111;
		 int num6 = 0b1;
		 
		 int num7 = 0b101010101010101;
		 
		 int num8= 0b10101010101010;
		 
		 int num9 = 0b1111111110001;
		 int num10 = 0b1;
		 int num11 = 0b11111111111;
		 int num12 = 0b10000;
		 int num13 = 0b101010101;
		 int num14 = 0b10000000;
		 
		int sum1 = num3 + num4;
		int sum = num1 + num2;
		int sum2 = num5 + num6;
		int sum3 = num7 +num7;
		long sum4 = num7 + num8;
		
		System.out.println("Zbir binarnih brojeva je: " + sum);
		System.out.println("Zbir binarnih brojeva je: " + sum1);
		System.out.println("Zbir binarnih brojeva je: " + sum2);
		System.out.println("Zbir binarnih brojeva je: " + sum3);
		System.out.println("Zbir binarnih brojeva je: " + sum4);
		
		System.out.println("Razlika binarnih brojeva je: " + (num1-num2));
		System.out.println("Razlika binarnih brojeva je: " + (num3-num4));
		System.out.println("Razlika binarnih brojeva je: " + (num10-num11));
		System.out.println("Razlika binarnih brojeva je: " + (num10-num12));
		System.out.println("Razlika binarnih brojeva je: " + (num1-num8));
		
		
		System.out.println("Proizvod binarnih brojeva je: " + (num1*num2));
		System.out.println("Proizvod binarnih brojeva je: " + (num3*num4));
		System.out.println("proizvod binarnih brojeva je: " + (num5*num6));
		System.out.println("Proizvod binarnih brojeva je: " + (num14*num10));
		System.out.println("Proizvod binarnih brojeva je: " + (num10*num12));
		System.out.println("Proizvod binarnih brojeva je: " + (num1*num8));
		
		
		//Iz binarnog u heksadecimalni
		
		int  bin1 = 0b1111111111111;
		int  hex1 = 0x1FFF;
		int hex2 = 0x2AA;
		int bin2 = 0b1010101010;
		int hex3 = 0x2000;
		int bin3 = 0b10000000000000;
		int hex4 = 0x1;
		int bin4 = 0b1;
		int hex5 = 0x0;
		int bin5 = 0b0;
		int hex6 = 0x3;
		int bin6 = 0b11;
 		
		boolean jeIsto = bin1 == hex1;
		boolean jeIsto1 = hex2 == bin2;
		boolean jeIsto2 = hex3 == bin3;
		boolean jeIsto3 = hex4 == bin4;
		boolean jeIsto4 = hex5 == bin5;
		boolean jeIsto5 = hex6 == bin6;
		
		
		System.out.println("Rezutat je: " + jeIsto);
		System.out.println("Rezultat je: " + jeIsto1);
		System.out.println("Rezultat je: " + jeIsto2);
		System.out.println("Rezultat je: " + jeIsto3);
		System.out.println("Rezultat je: " + jeIsto4);
		System.out.println("Rezultat je: " + jeIsto5);
		
		
		
		
		
		
		
		
		
		

	}

}
