package assignment12list;

import java.util.LinkedList;

public class RetriveNotRemoveQ6 {

	public static void main(String[] args) 
	{
		LinkedList<String> li=new LinkedList<String>();
		
		li.add("Java");
		li.add("C++");
		li.add("c");
		li.add("Html");
		li.add("MySql");
		
		System.out.println(li);
		
		String s=li.peekFirst();
		System.out.println(s);
		System.out.println(li);

	}

}
