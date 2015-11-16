package ba.bitcamp.S04D01;

public class PrintHelloWorld {


	public static void main(String[] args) {
//		sayHello();
//		sayHello("Kristina");
		//upis argumenata sa terminala
		if (args.length == 0) {
			System.out.println("Usage: hello. jar Name1 Name2 . . .");
		}
//		for (int i = 0; i < args.length; i++) {
//		sayHello(args[i]);
//		}
		String name;
		name = args [0];
		sayHello(name);
		
		name = args [1];
		sayHello(name);

		name = args [2];
		sayHello(name);

		for (int i = 0; i < args.length; i++) {
			String name = args[i];
			sayHello(name);
			}
		
		
		for (String name : args) { //za svako ime agrumenata ispisujemo ime najbolje koristiti ako nam ne treba brojac 
			sayHello(name);
		}
		
	

	}
	/**
	 * Prints hello world to the screen
	 * <p>
	 * Sends string "Hello world!" to the standard output. 
	 */
	public static void sayHello () {
		System.out.println("Hello world!");
	}
	/**
	 * Greets a user by name
	 * 
	 * @param name
	 */
	public static void sayHello (String name) {
		System.out.printf("Hello, %s!\n", name);
	}

}
