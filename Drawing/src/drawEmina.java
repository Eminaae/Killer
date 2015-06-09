import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;

public class drawEmina {

	public static void main(Graphics g, String getln) {
		g.setColor(Color.BLACK);
		String partx;
		String party;
		String partwidth;
		String parth;

		String[] parts = getln.split(" ");

		System.out.println(Arrays.toString(parts));
		partx = parts[1];
		party = parts[2];
		partwidth = parts[3];
		parth = parts[4];

		int x = Integer.parseInt(partx);
		int y = Integer.parseInt(party);
		int width = Integer.parseInt(partwidth);
		int h = Integer.parseInt(parth);

		if (getln.contains("DO")) {
			g.setColor(Color.BLACK);
			g.drawOval(x, y, width, h);
		}
		if (getln.contains("DFO")) {
			g.setColor(Color.ORANGE);
			g.fillOval(x, y, width, h);
		}
	}

}
