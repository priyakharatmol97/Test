package arraylistimportantall;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetUsingUniqueValues {

	public static void main(String[] args) 
	{
		//int arr[]= {-5,-4,3,2,-1,0,1,2,3,4,5};
		ArrayList<String> al=new ArrayList<String>();
		al.add("Sun");
		al.add("Mon");
		al.add("Sun");
		al.add("Tue");
		al.add("Wed");
		al.add("Mon");
		
	
		
		LinkedHashSet<String> li=new LinkedHashSet<String>(al);
       ArrayList<String> al3=new ArrayList<String>(li);
       al3.addAll(li);
        //System.out.println(al);
		System.out.println(li);
		
		
		
		
		

	}

}
