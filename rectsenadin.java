import java.awt.Graphics;


public class rectsenadin {
	
	public static void drawRect(Graphics g, String getln ){
	String partx;
	String party;
	String partwi;
	String parth;
	String partaw;
	String partah;
	
	
	String [] parts = getln.split( " " );
	partx = parts[1];
	party = parts[2];
	partwi = parts[3];
	parth = parts[4];
	partaw = parts[5];
	partah = parts[6];
	
	int x = Integer.parseInt( partx );
	int y = Integer.parseInt( party );
	int wi = Integer.parseInt( partwi );
	int h = Integer.parseInt( parth );
	int aw = Integer.parseInt( partaw );
	int ah = Integer.parseInt( partah );
	
	if( getln.contains( "DR" )){
		g.drawRect( x, y, wi, h);
	}if (getln.contains( "DFR" )){
		g.fillRect(x, y, wi, h);
	}if( getln.contains( "DR") && getln.contains( "FR" )){
		g.drawRect(x, y, wi, h);
		g.fillRect(x, y, wi, h);
	}if( getln.contains( "DRR")){
		g.drawRoundRect(x, y, wi, h, aw, ah);
	}
}
}
