package arraylistimportantall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ConvertArrayToArrayListOrArrayListToArray {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		//Scanner sc=new Scanner(System.in);
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Saturday");
		al.add("Sunday");
		
		//ArrayList to Array Convert
		Object[] a=al.toArray();
		System.out.println(Arrays.toString(a));
		
		
		
		String arr[]=new String[al.size()];
		arr=al.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		
		//Array to ArrayList
		List al2=Arrays.asList(arr);
		System.out.println(al2);
		
		ArrayList<String>al3=new ArrayList<String>(Arrays.asList(arr));
		System.out.println(al3);
		
		
		ArrayList<String>al4=new ArrayList<String>();
		Collections.addAll(al4, arr);
		System.out.println(al4);
		
		
		

	}

}
