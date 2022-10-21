import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Q1 {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("sun");
		al.add("mon");
		al.add("sun");
		al.add("tue");
		al.add("wed");
		al.add("mon");
		System.out.println(al);
		
		/*LinkedHashSet<String> ll=new LinkedHashSet<String>(al);
		System.out.println(ll);*/
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(String s:al)
		{
			System.out.println(s);
		}
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al);
		}

	}

}
