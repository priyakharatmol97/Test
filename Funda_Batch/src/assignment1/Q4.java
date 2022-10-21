package assignment1;

import java.util.ArrayList;
import java.util.Iterator;

public class Q4 {

	public static void main(String[] args) 
	{
		ArrayList<String>al=new ArrayList<String>();
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Saturday");
		al.add("Sunday");
		
		System.out.println(al);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			if(itr.next().length()>7)
			{
				itr.remove();
			}
		}
		System.out.println(al);
	}

}
