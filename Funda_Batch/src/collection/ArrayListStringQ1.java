package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListStringQ1 {

	public static void main(String[] args) 
	{
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("sun");
		al1.add("mon");
		al1.add("sun");
		al1.add("tue");
		al1.add("wed");
		al1.add("mon");
		System.out.println("Before:"+al1);
		
		//ArrayList<String> al2=new ArrayList<String>(al1);
		LinkedHashSet<String> hs=new LinkedHashSet<String>(al1);
		System.out.println("After:"+hs);
	    
		

	}

}
