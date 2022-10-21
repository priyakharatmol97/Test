package writtenassignment13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) 
	{
		Test t=new Test("Assessment","20/10/2022");
		Test t1=new Test("Semister","08/02/2022");
		Test t2=new Test("Final","16/05/2022");
		
		ArrayList<Test> als = new ArrayList<Test>();
		als.add(t);
		als.add(t1);
		als.add(t2);
		
		System.out.println(als);
		
		Student s=new Student(1,"Pooja",als);
		
		
		HashMap<Integer,Student> hm=new HashMap<Integer,Student>();
		hm.put(101, s);
		
		Set<Entry<Integer,Student>>entry=hm.entrySet();
		
		Iterator<Entry<Integer,Student>> itr=entry.iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer,Student> nt=itr.next();
			System.out.println(nt.getKey()+" "+nt.getValue());
		}
		
	}

}
