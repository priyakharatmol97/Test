package collection;

import java.util.ArrayList;

public class ArrayListAllEQ2 {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Navya");
		al.add("Piyu");
		al.add("Shrutika");
		al.add("Pari");
		al.add("Nayan");
		
		// Iterator
		
		System.out.println("Display Method By Using Iterator");
		System.out.println(al);
		System.out.println();
		
		// For Loop
		
		System.out.println("Display Method By Using For Loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i)+" ");
		}
		System.out.println();
		
		// Enhanced Loop
		System.out.println("Display Method By Using Enhanced Loop");
		for(String al2:al)
		{
			System.out.println(al2+" ");
		}
		
		
		
		
		

	}

}
