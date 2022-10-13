package assignment12list;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElemntsQ3 {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Red");
		al.add("Blue");
		al.add("Purple");
		al.add("Pink");
		al.add("Black");
		
		//System.out.println(al.toString());
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);

	}

}
