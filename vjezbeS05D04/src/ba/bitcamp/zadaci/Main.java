package ba.bitcamp.zadaci;

public class Main {

	public static void main(String[] args) {

		Workstation ws = new Workstation(null, 2, 2, 0, 0, 0, 0, 0, true);


		//PersonalComputer[] pcArray = { ws, dc, l, pc };

//		for (int i = 0; i < pcArray.length; i++) {
//			pcArray[i].printTypeInfo();
//		}
         ws.printInformation();
	}

}
