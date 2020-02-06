package Practice.Practice;

 class Test extends Dhaarani{
	
	 static int x;
	 int y;
	 
		
	 void increment(){
		 
		 x++;
		 y++;
		 
	 }
	 void decrement(){
		 x--;
		 y--;
		 
	 }
	 
	 void printValue(){
		 System.out.println("x->"+x);
		 System.out.println("y->"+y);

		 
	 }
	 
	  public void sab() {
			
	  }
	 
	 public static void main(String[] args) {
		
		 Test t1= new Test();
		 Test t2= new Test();
t1.sab();
		 t1.increment();
		 t2.increment();
		 t1.decrement();
		 
		 t1.printValue();
	}
	 
	 
 }
	