package assignment12list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class ConvertQ8 {

	public static void main(String[] args) 
	{  
		//ArrayList Convert Array 1 st Way
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<String> al2=new ArrayList<String>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(40);
		
		System.out.println("Original");
		System.out.println(al);
		System.out.println();
		   //convert arraylist to array	(1st way)
		
			Object a[]=al.toArray();
			
			System.out.println("convert arraylist to array	(1st way)");
			System.out.println(Arrays.toString(a));
			System.out.println();
			
			
			
			//2nd way
			
			Integer arr[]=new Integer[al.size()];
			Integer in[]=al.toArray(arr);
			
			System.out.println("convert arraylist to array	(2st way)");
			for(int i=0;i<in.length;i++)
			{
				System.out.print(in[i]+" ");
			}
			
			
			
			
			
			//Array To ArrayList Convert 1st way
			
			String book[]= {"c","c++","java","html","c","html","html"};
			List<String> li=Arrays.asList(book);
			
			LinkedHashSet<String> lh=new LinkedHashSet<>(li);
			System.out.println("Array To ArrayList Convert 1st way");
			System.out.println(lh);
			System.out.println();
			
			
			//Array to ArrayList convert 2 nd way
			
			List<String> li2=Collections.synchronizedList(al2);
			li2.add("priya");
			li2.add("divya");
			System.out.println("Array to ArrayList convert 2 nd way");
			System.out.println(li2);
			


	}

}
