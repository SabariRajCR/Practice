package Practice.Practice;

public class Prime {

	public static void main(String[] args) {
		
		int num =13;
		int count =0;
		
		for(int i=2;i<=num/2;i++){
			
			if(num%i==0){
				count++;
			}
		}
		if(count==1){
			System.out.println("Is Prime");
		}else
			System.out.println("Not a prime");
		
		
	}
	public int b(){

		int a=10;
		int b=15;
		return a;
}
}
