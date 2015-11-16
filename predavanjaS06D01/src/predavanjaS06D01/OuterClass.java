package predavanjaS06D01;

public class OuterClass {
	
	private int number;
	public InnerClass ic;
	public OuterClass() {
		this.number = 10;
		ic = new InnerClass(20);
	}
	
	public void myMethod () {
		
	
	}
	
	class InnerClass {
		
		private int innerNumber;
		private int number;
		
		public InnerClass(int number) {
			this.number = number;
		}
		
		public void PrintValiables(int number) {
			System.out.println("Param number: " + number);
			System.out.println("Inner number: " + this.number);
			System.out.println("Outer number: " + OuterClass.this.number);
			
		}
	}

}
