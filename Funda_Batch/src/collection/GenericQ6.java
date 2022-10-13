package collection;

import java.util.ArrayList;
import java.util.Collections;

public class GenericQ6 {

	public static void main(String[] args) 
	{
		//ArrayList al=new ArrayList();        //old non-generic
		
		ArrayList<Integer> al1=new ArrayList<Integer>(); // new generic Integer
		al1.add(50);
		al1.add(40);
		al1.add(80);
		al1.add(20);
		al1.add(30);
		
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		
		
		ArrayList<String> al2=new ArrayList<String>(); // new generic String
		al2.add("Red");
		al2.add("Black");
		al2.add("Pink");
		al2.add("Voilet");
		al2.add("White");
		
		System.out.println(al2);
		Collections.sort(al2);
		System.out.println(al2);
		
		
		

	}

}
