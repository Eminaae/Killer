package predavanjaS03D02;

public class Task2 {
	public void drawFrame(Graphics g, int frameNumber, int width, int height) {
	    
	    int centerX;     // The x-coord of the center of a disk.
	    int centerY;     // The y-coord of the center of a disk.
	    int colorChoice; // Used to select a random color.
	    int count;       // Loop control variable for counting disks.
	    
	    for (count = 0; count < 500; count++) {
	        
	        colorChoice = (int)(3*Math.random());
	        switch (colorChoice) {
	        case 0:
	            g.setColor(Color.RED);
	            break;
	        case 1:
	            g.setColor(Color.GREEN);
	            break;
	        case 2:
	            g.setColor(Color.BLUE);
	            break;
	        }
	        
	        centerX = (int)(width*Math.random());
	        centerY = (int)(height*Math.random());
	        
	        g.fillOval( centerX - 50, centerY - 50, 100, 100 );
	        g.setColor(Color.BLACK);
	        g.drawOval( centerX - 50, centerY - 50, 100, 100 );

	public static void main(String[] args) {
		


	}

}
