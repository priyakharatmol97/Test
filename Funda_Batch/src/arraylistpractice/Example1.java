package arraylistpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args)
	{
		ArrayList<Integer>al=new ArrayList<Integer>();//arraylist create
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);
		
		/*Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(int number:al)
		{
			System.out.println(number);
		}*/
		
		
ArrayList<Integer>al2=new ArrayList<Integer>();//arraylist create
		
		al2.add(40);
		al2.add(50);
		al2.add(60);
		
		
		//al.addAll(3, al2);
		
		al.retainAll(al2);
		
		//System.out.println(al2);
		
		al.isEmpty();
		System.out.println(al);
		
		

	}

}
