public class CardsAllInOne {

	public static void main(String[] args) {
		// novi spil
		byte[] karte = new byte[52];
		for (int i = 0; i < 52; i++) {
			karte[i] = (byte) (i + 1);
		}
		// ispisi novi spil
		for (int i = 0; i < 52; i++) {
			System.out.print(karte[i] + " ");
		}
		System.out.println();
		// 10 puta
		for (int brojMijesanja = 0; brojMijesanja < 10; brojMijesanja++) {
			// 15 puta
			for (int brojZamjena = 0; brojZamjena < 15; brojZamjena++) {
				// zamijeni 2 random karte
				// uzmi random kartu
				int indexPrveKarte = (int) (Math.random() * 52);
				// uzmi jos jednu random kartu
				int indexDrugeKarte = (int) (Math.random() * 52);
				// zamijeni im mjesta
				byte tmp = karte[indexPrveKarte];
				karte[indexPrveKarte] = karte[indexDrugeKarte];
				karte[indexDrugeKarte] = tmp;
			}
		}
		// pogledaj karte
		for (int i = 0; i < 52; i++) {
			System.out.print(karte[i] + " ");
		}
		System.out.println();
		//podijeli prve 4 karte 
		for (int i = 0; i < 4; i++) {
			System.out.print(karte[i] + " ");
		}
		System.out.println();
		//izbaci podijeljene karte iz spila
		byte [] reducirani = new byte [52 - 4];
		for (int i = 4; i < 52; i++) {
			reducirani [i - 4] = karte [i];
		}
		karte = reducirani;
		//ispisi karte nakon djeljenja
		for (int i = 0; i < 52; i++) {
			reducirani [i] = karte [i];
			System.out.print(karte[i] + " ");
		}
		System.out.println();
	}

}
