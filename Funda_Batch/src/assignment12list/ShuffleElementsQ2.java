package assignment12list;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElementsQ2 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(7);
		al.add(9);
		al.add(3);
		al.add(8);
		
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);

	}

}
