package collectionday2;

import java.util.ArrayList;
import java.util.Collections;

public class SortingInteger {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();

		al.add(56);
		al.add(45);
		al.add(12);
		al.add(4);
		al.add(5);
		al.add(4);
		
		
		System.out.println(al);
		
		Collections.sort(al);
		
		
		System.out.println(al);
		
		ArrayList<String> al2=new ArrayList<String>();

		al2.add("ram");
		al2.add("priya");
		al2.add("kinjal");
		al2.add("sonal");
		al2.add("abhay");
		al2.add("bob");
		
		
		System.out.println(al2);
		
		Collections.sort(al2);
		
		
		System.out.println(al2);

	}

}
