package collectionday2;

import java.util.ArrayList;

public class ArrayListCapacity {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>(3);
		al.add(10);
		al.add(20);
		al.add(34);
		al.add(56);
		al.add(2,100);
		
	//	ArrayList<Integer> al2=new ArrayList<Integer>(al);
		
		
		
		System.out.println(al);
		

	}

}
