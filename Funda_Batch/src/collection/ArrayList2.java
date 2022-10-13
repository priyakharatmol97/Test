package collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) 
	{
ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(23);
		al.add(56);
		al.add(78);
		al.add(88);
		
		
		al.add(2, 100);
		al.add(23);
		al.add(78);
		System.out.println(al);
		
		
		
		
		/*LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>(al);
		System.out.println(hs);*/
	    
		
		//constructor with collection
	/*	ArrayList<Integer> al2=new ArrayList<Integer>(al);
		al2.add(100);
		al2.add(200);
		al2.add(300);*/
		
		//System.out.println(al2);
		
		//addAll
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		
		al2.addAll(1,al);
		
		System.out.println(al2);

	}

}
