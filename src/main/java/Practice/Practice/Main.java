package Practice.Practice;
import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s,MyBook bo);
	String getTitle(){
		return title;
	}
}

//Write MyBook class here
class MyBook extends Book{
	
	

	@Override
	void setTitle(String s,MyBook bo) {
		// TODO Auto-generated method stub.
//		MyBook bo=new MyBook();
		
		bo.title = s;
	}


}

public class Main{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
				MyBook new_novel=new MyBook();
		new_novel.setTitle("A tale of two cities",new_novel);
		System.out.println("The title is: "+new_novel.getTitle());
      	
		
	}
}