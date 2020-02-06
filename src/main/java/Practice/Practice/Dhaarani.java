package Practice.Practice;

public class Dhaarani {
	
	
	int a;
	private int b=10;
	
	
	public Dhaarani(){
		
		a=10;
		System.out.println(a);
	}

   public Dhaarani(int d,int e){
		a =d;
		b=e;

	System.out.println(this.a);
	System.out.println(this.b);
	}
   
   public void sab() {
	
}
	
	
	public static void main(String[] args) {
	
     Dhaarani obj = new Dhaarani();
     Dhaarani obj2 = new Dhaarani(20,30);	
		
     
		
	}

}
