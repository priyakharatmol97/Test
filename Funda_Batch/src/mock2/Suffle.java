package mock2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Suffle {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("Laxman");
		al.add("Navya");
		al.add("Priya");
		al.add("Nayan");
		al.add("Tai");
		
		
		System.out.println(al);
		
		//Collections.shuffle(al);   suffle
		Collections.reverse(al);  //reverse
		
		
		System.out.println(al);
		
		List<String> ll=al.subList(0, 3);   //extract portion
		System.out.println(ll);

	}

}
