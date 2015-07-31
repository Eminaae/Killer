package ba.bitcamp.week9.day1.lectures;

public class Trip {
	
	private Place start;
	
	
	
	public Trip() {
		
	}



	public Place getStart() {
		return start;
	}



	public void setStart(Place start) {
		this.start = start;
	}

	
	public void add(Place newPlace){
		if(start ==null){
			start = newPlace;
		}else{
		Place end = start;
		
		while(end.getNext() != null){ //sve dok pokazivac na next element nije null
			end = end.getNext();
		}
		end.setNext(newPlace);
		}
	}
	@Override
	public String toString() {
		String result = "";
		Place currentPlace = start;
		
		while(currentPlace != null){
			result += String.format("%s");
		}
		return result;
	}



	



}
