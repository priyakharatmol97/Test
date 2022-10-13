package assignment12list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkedListToArrayListQ7 {

	public static void main(String[] args) 
	{
		LinkedList<String> li=new LinkedList<String>();
		li.add("Computer");
		li.add("Medical");
		li.add("Civil");
		li.add("Mechanical");
		li.add("IT");
		li.add("Electrical");
		
		System.out.println("LinkedList");
		System.out.println(li);
		System.out.println();
		
		ArrayList<String> al=new ArrayList<String>(li);
		System.out.println("LinkedList convert ArrayList");
		
		for(Object o:al)
		{
			System.out.println(o);
		}
		

	}

}
