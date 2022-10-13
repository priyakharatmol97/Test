package linkedlistinjava;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class SortLinkedList {

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		
		Collections.sort(ll);
		
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}

}
