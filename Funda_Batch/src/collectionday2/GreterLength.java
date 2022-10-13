package collectionday2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class GreterLength {

	public static void main(String[] args) 
	{
		  ArrayList<String>al=new ArrayList<String>();
		    al.add("sunday");
		    al.add("monday");
		    al.add("tuesday");
		    al.add("wednesday");
		    al.add("friday");
		    al.add("saturday");
		   
		    
		  /*  for(int i=0;i<al.size();i++)
		    {
		    	
		    	if(al.get(i).length()<7)
		    	{
		    		al.remove(i);
		    		
		    	i--;
		    		
		    	}
		    	
		    }*/
		    
		   // 1st wat to iterarate arrayList
		    
		    
		    System.out.println(al);
		    
		    //2nd way using normal for loop
		    for(int i=0;i<al.size();i++)
		    {
		    	System.out.println(al.get(i));
		    }
		    System.out.println("--------");
		    
		    //3rd way enhanced for loop
		    for(String s:al)
		    {
		    	System.out.println(s);
		    }
		    
		    //4th way iterator() method present in iterable interface
		    
		    System.out.println("--------");
		    
		   Iterator<String> it= al.iterator();
		   
		   while(it.hasNext())
		   {
			   System.out.println(it.next());
			  // it.remove();
		   }
		 //  System.out.println(al);
		    
		 //4th way Listiterator() method present in iterable interface
		   System.out.println("--------");
		     ListIterator<String>   li=    al.listIterator();
		   /*  while(li.hasNext())
		     {
		  	   System.out.println(li.next());
		  	   
		     }*/
		     System.out.println("--------");
		     
		     ListIterator<String>   lback=    al.listIterator(al.size());
		     while(lback.hasPrevious())
		     {
		    	 System.out.println(lback.previous());
		     }

	}

}
