package mock;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrintDiffWay {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add("ddd");
		al.add("eee");
		System.out.println(al);
		
		
		System.out.println("Using Iterator");
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("Using ENhance For Loop");
		
		for(String s:al)
		{
			System.out.println(al);
		}
		
		
		System.out.println("USing For Loop");
		
		int arr[]=new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(al);
		}

	}

}
