package assignment12list;

import java.util.ArrayList;

public class ExtractPortionQ4 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> age=new ArrayList<Integer>();
		age.add(10);
		age.add(12);
		age.add(15);
		age.add(19);
		age.add(23);
		age.add(34);
		
		System.out.println(age);
		
		//age below 18

		System.out.println("Ages below 18:"+age.subList(0, 3));
		
		System.out.println("Ages Above 18:"+age.subList(3, age.size()));
		

	}

}
