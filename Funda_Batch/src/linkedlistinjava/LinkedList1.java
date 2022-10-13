package linkedlistinjava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) 
	{
      LinkedList<String> li=new LinkedList<String>();
		
        li.add("ram");
        li.add("priya");
        li.add("kinjal");
        li.add("poonam");
        
        
        li.addFirst("heena");
        li.addLast(null);
        li.add(3, "suresh");
        System.out.println("-----------");
      System.out.println(  li.getFirst());
      System.out.println("-----------");
        
    Iterator<String> it=    li.iterator();
    
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }

	}

}
