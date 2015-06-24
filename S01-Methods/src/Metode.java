
public class Metode {

	public static void main(String[] args) {
		System.out.println(fixSentence("skz is blue."));
		System.out.println(getRandomNumber(1,100));	
		System.out.println(getMax(3,18));
		System.out.println(canBeBinary(1010101));
		System.out.println(getExtension ("Vjezbe.java"));
	}

public static int getMax(int num1, int num2){
	if (num1 > num2){
		return num1;
	}else{
		return num2;
	}
}


public static String getExtension (String filename){
		String extension =" ";
		int i = filename.indexOf(".");
		if (i > 0){
			extension = filename.substring(i);
		}
		return extension;
	}


public static boolean canBeBinary(int num){
	 	
	boolean isBinary = true;
	if(num < 0){
		return false;	
		}
			while (num > 0){
				if (num % 10 !=0 && num % 10 != 1){
					isBinary = false;
					return false;
		}	
			num /= 10; //continue dividing by 10 until condition is false
			}
			return true;
			
	}


public static int getRandomNumber(int min,int max){
	
	int random = (int)Math.random()*(max - min);
	if (max == 0 && min > 0){
		return -1;
	}
		else{
			return random;
		}
	}	

public static String fixSentence(String sentence){
	String s = "fkfkjfgkhjk";
	
        for(int i = 0;i < sentence.length(); i++) {
            int ch = sentence.charAt(i);
             if(ch > 96 && ch < 123){
                ch=ch-32;
            }
            }
		return sentence;       
}
}



