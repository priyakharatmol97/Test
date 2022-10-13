package arraylistimportantall;

import java.util.ArrayList;

public class ContainsSetUsed {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		
		System.out.println(al);
		System.out.println(al.size());
		
		ArrayList al2=new ArrayList();
		al2.add("aaa");
		al2.add("bbb");
		al2.add("ccc");
		
		System.out.println(al2);
		
		al.addAll(al2);
		System.out.println(al);
		
		System.out.println(al.add("ccc"));
		
		//or
		
		
		System.out.println(al.contains(200));
		System.out.println(al.contains(400));
		
		System.out.println(al.isEmpty());
		al.removeAll(al2);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		
	}

}
