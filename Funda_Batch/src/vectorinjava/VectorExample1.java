package vectorinjava;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		
		/*System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v);
		System.out.println("-----");
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(23);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v);*/
		
		System.out.println(v.firstElement());
		System.out.println("------");
	Enumeration<Integer> en=	v.elements();
	
	
	while(en.hasMoreElements())
	{
		System.out.println(en.nextElement());
		v.add(50);
		System.out.println(en.nextElement());
		System.out.println(en.nextElement());
		System.out.println(en.nextElement());
		System.out.println(en.nextElement());
		
		
		break;
	}

	}

}
