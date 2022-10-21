package iteratorexamples;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("aaa");
		al.add("bbbchd");
		al.add("ccc");
		al.add("ddd");
		al.add("eee");
		
		System.out.println(al);
		
	boolean itr=al.isEmpty();
	System.out.println(itr);
	
	
	System.out.println(al.size());
	
	System.out.println(al.remove(2));
		/*1.add
		2.addAll
		3.isEmpty
		4.remove
		5.size*/
		
		
		
		

		}
	

}
