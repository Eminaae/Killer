package predavanjas02d01;

public class Run {

	public static void main(String[] args) {
		int ukupnoMetara = 41150;
		double metaraPretrcanih = 0;
		int brojIteracija = 0;
		do {
			metaraPretrcanih += Math.random();
			brojIteracija++;
			if ((int)metaraPretrcanih % 1000 == 0 && metaraPretrcanih > 1000) {
				System.out.println("." + metaraPretrcanih);
			}
		} while (metaraPretrcanih < ukupnoMetara);
		System.out.println("Cilj");
		System.out.println("Iteracija " + brojIteracija);
	}

}
