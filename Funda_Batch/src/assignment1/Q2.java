package assignment1;

import java.util.ArrayList;
import java.util.Iterator;

public class Q2 {

	public static void main(String[] args) 
	{
		ArrayList<String>al=new ArrayList<String>();
		al.add("sun");
		al.add("mon");
		al.add("sun");
		al.add("tue");
		al.add("wed");
		al.add("mon");
		System.out.println(al);
		
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("USing for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

		
		System.out.println("Using Enhance For Loop");
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}
