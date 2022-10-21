package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ClinicMain 
{
	static void sortRating(List<Clinic> li)
	{
		System.out.println("------Sorting By Rating------");
		Collections.sort(li,new Rating());
		Iterator<Clinic> itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
		System.out.println();
	}
	
	
	static void sortLocation(List<Clinic> li)
	{
		System.out.println("------Sorting By Location------");
		Collections.sort(li, new Location());
		Iterator<Clinic> itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		Doctor d1=new Doctor(1,"Dr. Patil");
		Doctor d2=new Doctor(2,"Dr. Osthwal");
		Doctor d3=new Doctor(3,"Dr. Smitha");
		Doctor d4=new Doctor(4,"Dr. Joshi");
		
		Clinic c1=new Clinic(101,"Heart Specialist","Airoli",7.8f,d1);
		Clinic c2=new Clinic(102,"Skin Specialist","Rabale",9.8f,d2);
		Clinic c3=new Clinic(103,"Lungs Specialist","Navi Mumbai",8.9f,d3);
		Clinic c4=new Clinic(104,"Gynecologiest ","Thane",5.5f,d4);
		
		ArrayList<Clinic> al=new ArrayList<Clinic>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		
		System.out.println(al);

		sortRating(al);
		sortLocation(al);
	}

}
