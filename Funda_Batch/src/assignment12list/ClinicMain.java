package assignment12list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ClinicMain 
{
	static void sortRating(List<Clinic> li)
	{
		System.out.println("=====Sorting By Rating=====");
		Collections.sort(li, new Rating());
		
		
		Iterator<Clinic> id2=li.iterator();
		while(id2.hasNext())
		{
			System.out.println(id2.next());
		}
		System.out.println();
	}
	
	static void sortLocation(List<Clinic> li) 
	{
		System.out.println("\n------Sort by Location------");
		Collections.sort(li, new Location());
		Iterator<Clinic> id=li.iterator();
		while(id.hasNext()) 
		{
			System.out.print(id.next()+" ");
		}
	}

	public static void main(String[] args)
	{
		Doctor d1=new Doctor(1,"Dentist Doctor");
		Doctor d2=new Doctor(2,"Family Doctor");
		Doctor d3=new Doctor(3,"Neurologist Doctor");
		Doctor d4=new Doctor(4,"Gynecologist Doctor");
		Doctor d5=new Doctor(5,"SkinSpecialist Doctor");
		
		
		ArrayList<Doctor> dt=new ArrayList<Doctor>();
		//al.add(mov1);
		dt.add(d1);
		dt.add(d2);
		dt.add(d3);
		dt.add(d4);
		dt.add(d5);
		
		//System.out.println(dt);
	    
		
		Clinic c1=new Clinic(101,"Dr.Patil Clinic","Airoli",7,d1);
		Clinic c2=new Clinic(102,"Dr.Joshi Clinic","Thane",5,d2);
		Clinic c3=new Clinic(103,"Dr.Anand Clinic","Navi Mumbai",8,d3);
		Clinic c4=new Clinic(104,"Dr.Osthwal Clinic","Mulund",2,d4);
		Clinic c5=new Clinic(105,"Dr.Smitha Clinic","Vashi",4,d5);

		ArrayList<Clinic> cl=new ArrayList<Clinic>();
		cl.add(c1);
		cl.add(c2);
		cl.add(c3);
		cl.add(c4);
		cl.add(c5);
		
		System.out.println(cl);
	    
		
		sortRating(cl);
		sortLocation(cl);
		
		

	}

}
