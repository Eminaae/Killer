package ba.bitcamp.week06.nestedclasses;

public class OuterClass {
	private int number;
	public InnerClass ic; //makes object 
	
	public OuterClass(){
		
	}
	
	public void myMethod(){
		new Comparable (){

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}		
}

	class InnerClass {
		private int number;
		private int innerNumber;

		public InnerClass(int number) {
			this.number = number;
		}

		public void PrintVariables(int number) {

			System.out.println("Param number: " + number);
			System.out.println("Inner number: " + this.number);// number from
																// inner class u kojoj smo trenutno
			System.out.println("Outer number: " + OuterClass.this.number);// prints
																			// outer
																			// number
																			// OuterClass.this.number
		}
	}

