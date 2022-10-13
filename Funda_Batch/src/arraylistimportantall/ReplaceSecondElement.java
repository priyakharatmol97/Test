package arraylistimportantall;

import java.util.ArrayList;

public class ReplaceSecondElement {

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		
		al.add(2, 100);
		System.out.println(al);

	}

}
