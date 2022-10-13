package arraylistinjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListToArrayConvert {

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
	   //convert arraylist to array	(1st way)
		Object a[]=al.toArray();
		
		System.out.println(Arrays.toString(a));
		
		
		//2nd way
		Integer arr[]=new Integer[al.size()];
		Integer in[]=al.toArray(arr);
		
		for(int i=0;i<in.length;i++)
		{
			System.out.println(in[3]);
		}
		
		
//can we make arrayList synchronized(yes by using Collections.synchronizedList)		
		List<String> li2=Collections.synchronizedList(al2);
		li2.add("aaa");
		li2.add("bbb");
		System.out.println(li2);
		
		

	}

}
