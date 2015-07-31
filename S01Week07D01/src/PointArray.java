
public class PointArray {
	
	private Point[] points;
	private int length;
	
	public PointArray(){
		this.points = new Point [10];
		this.length = 0;
	}
	
	public void addPoint(Point p){
		//metoda prima tacku koju treba dodati
		//prosiriti niz u slucaju da se popuni
		if(length == points.length){
			resize();
		}
		this.points[length++] = p;
	}
	
	public int getLength(){
		return length; // odnosi se na broj tacaka koje su dodadne, ne na duzinu niza
	}
	
	public Point elementAt(int index){
		return points[index];
	}
	
	public void resize(){
		//napravi novi niz, dupla velicina trenutnog niza, stari niz kopiramo u novi
		
		Point[] temp = new Point [points.length *2];
		for (int i = 0; i < points.length; i++){
			temp[i] = points [i];
		}
		points = temp;
	}
}
