package arraylistinjava;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args)
	{
		String book[]= {"c","c++","java","html","c","html","html"};
		
		
		List<String> li=	Arrays.asList(book);
		
		LinkedHashSet<String> lh=new LinkedHashSet<>(li);
		System.out.println(lh);


	}

}
