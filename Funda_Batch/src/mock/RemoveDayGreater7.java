package mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class RemoveDayGreater7 {

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
		Collections.sort(al);
		
		Iterator<String> li=al.iterator();
		while(li.hasNext())
		{
			if(li.next().length()>7)
			{
				li.remove();
			}
		}
		System.out.println(al);

	}

	

}
