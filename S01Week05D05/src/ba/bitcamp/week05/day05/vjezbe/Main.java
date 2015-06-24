package ba.bitcamp.week05.day05.vjezbe;

public class Main {

	public static void main(String[] args) {
		LifeForm lf = new LifeForm(false);
		
		Animal a = new Animal(false, 50, Animal.EAT_PLANTS);
		System.out.println(a.getTypeOfFood());
		Zebra z = new Zebra();
		
		//Tiger t = new Tiger(50, Tiger.EAT_ANIMALS, 23, Tiger.HUNGRY);
		
		Plant p = new Plant(false);
		
		

	}

}
