package arraylistinjava;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {

	public static void main(String[] args) 
	{
      ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(40);
		
		
		//System.out.println(al);
		Iterator<Integer> it= al.iterator();
		   
		   while(it.hasNext())
		   {
			   System.out.println(it.next());
			al.add(4);//(fail -fast)
			   //it.remove();
			  
		   }
		   System.out.println(al);

	}

	

}
