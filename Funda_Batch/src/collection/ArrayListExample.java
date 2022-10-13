package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args)
	{
        ArrayList<String> al=new ArrayList<String>();

		al.add("priya");   //add method
		al.add("ankush");
		al.add("anand");
		al.add("vidya");
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		

		
		al.add(3, "priya");  //add(index,element)
		System.out.println(al);
		
		al.addAll(al);        //addAll method(collection,extends string)
		System.out.println(al);
		
		al.addAll(1, al);       //addAll(index,collection,extends string)
		System.out.println(al);
		

		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		
	}

}
