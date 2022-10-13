package arraylistimportantall;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortTheClasses {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<String> al2=new ArrayList<String>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(40);
		
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
	
		
		al2.add("ram");
		al2.add("siya");
		al2.add("abhay");
		al2.add("leena");
		
		
       System.out.println(al2);
		
		Collections.sort(al2);
		
		System.out.println(al2);
		
		

	}

}
