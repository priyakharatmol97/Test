package collectionday2;

import java.util.ArrayList;
import java.util.Collections;

public class Q4 {

	public static void main(String[] args)
	{
		ArrayList<String> al2=new ArrayList<String>();

		al2.add("Brahmastra");
		al2.add("Ananya");
		al2.add("Timepass3");
		al2.add("KGF2");
		al2.add("GoodBye");

		System.out.println(al2);
		
		Collections.sort(al2);
		
		
		System.out.println(al2);

	}

}
