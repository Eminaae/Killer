package ba.bitcamp.week05.d2.vjezbe;

public class Printer {
	private String name;
	private int paperQuantity;
	private int inkQuantity;
	private int printedPages;
	/**
	 * An empty constructor
	 */
	public Printer (){
		this.name = "Default Printer";
		this.paperQuantity = 0;
		this.inkQuantity = 0;
		this.printedPages = 0;
		
	}
	/**
	 * Constructor that initialize name to the given parameter
	 * @param namel
	 * @param paperQuantity
	 * @param inkQuantity
	 * @param printedPages
	 */
	
	public Printer (String name, int paperQuantity, int inkQuantity, int printedPages){
		this.name = name;
		this.paperQuantity = 0;
		this.inkQuantity = 0;
		this.printedPages = 0;	
	}
	/**
	 * Returns true or false if there is paper in the printer
	 * @return
	 */
	public boolean hasInk(){
		if(this.inkQuantity != 0){
			return true;
		}
		return false;
	}
	
	public boolean hasPaper(){
		if(this.paperQuantity != 0){
			return true;
		}
		return false;
	}
	/**
	 * Returns printed pages number
	 * @return
	 */
	public int printedPages(){
		return this.printedPages;
			
		}
	/**
	 * Adds paper to printer
	 * @param paperQuantity1
	 */
	
	public void addPaper(int paperQuantity1){
		do{
			paperQuantity += paperQuantity1;
		}while(this.paperQuantity <= 100);
	}
	
	/**
	 * Fills in ink to the maximum
	 * @param inkQuantity1
	 */
    public void addInk(int inkQuantity1){
		do {
			inkQuantity += inkQuantity1;
			}while(this.inkQuantity <= 100);	
		}
    
    /**
     * 
     * @param paperQuantity
     */
    
    public void totalPrinted(int papersToPtint){
    	for (int i = 0; i < this.paperQuantity; i++){
    		this.paperQuantity --;
    	for(int j = 0; j< this.inkQuantity; j++){
    		this.inkQuantity--;
    	}
    	}
    }
    	
  }


	
	

