/*Programkojisadržipozitivnicijelibroj𝑛.Ispisatisvebrojeveod1do𝑛kojisu
neparni i djeljivi sa tri, a nisu sa pet.*/
public class Task05 {

	public static void main(String[] args) {
		int num = 45;
		int i=1;

			while(i<num){
				if(num % 2 != 0 && num % 3 == 0 && num % 5 !=0)
					System.out.println(num);	
			}
			i++;
		
		}

	}


