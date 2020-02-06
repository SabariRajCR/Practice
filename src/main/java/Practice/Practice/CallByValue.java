package Practice.Practice;

public class CallByValue {
	
	int a = 10;
	int b= 20;

	public static void main(String[] args) {
		
		CallByValue obj = new CallByValue();
       obj.callbyValue(obj.a, obj.b);
       System.out.println(obj.a);
       System.out.println(obj.b);
       obj.callbyValue(obj);
       System.out.println(obj.a);
       System.out.println(obj.b);
	}
	
	
	public void callbyValue(int a ,int b){
		
		a=a+b;
		b=a-b;
		a=a-b;
	}
	public void callbyValue(CallByValue obj){
		
		obj.a=obj.a+obj.b;
		obj.b=obj.a-obj.b;
		obj.a=obj.a-obj.b;
	}

}
