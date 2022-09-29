package xyz;

import java.util.Arrays;
import java.util.Scanner;

public class DSMmain 
{

	public static void main(String[] args) 
	{
	      Scanner sc=new Scanner(System.in);
	      
	      Depaartment2 dt[]=new Depaartment2[2];
	      for(int i=0;i<dt.length;i++)
	      {
	    	  System.out.println("Enter Department id");
	    	  int did=sc.nextInt();
	    	  
	    	  System.out.println("Enter the Department Name");
	    	  String dname=sc.next();
	    	  
	    	  System.out.println("Number of students");
	    	  int studsize=sc.nextInt();
	    	  
	    	  Student2 st[]=new Student2[studsize];
	    	  for(int j=0;j<st.length;j++)
	    	  {
	    		  System.out.println("Enter the Student id");
	    		  int id=sc.nextInt();
	    		  
	    		  System.out.println("Enter the Student Name");
	    		  String name=sc.next();
	    		  
	    		  System.out.println("Enter Student Marks");
	    		  int marks=sc.nextInt();
	    		  
	    		  System.out.println("ENter Student EMail id");
	    		  String email=sc.next();
	    		  
	    		  Student2 s1=new Student2();
	    		  s1.setId(id);
	    		  s1.setName(name);
	    		  s1.setMarks(marks);
	    		  s1.setEmail(email);
	    		  
	    		  st[j]=s1;
	    		  
	    	  }
	    	  
	    	  Depaartment2 d1=new Depaartment2();
	    	  d1.setId(did);
	    	  d1.setName(dname);
	    	  d1.setStud(st);
	    	  
	    	  dt[i]=d1;
	      }
	      
	      for(Depaartment2 d1:dt)
	      {
	    	  System.out.println(d1.getId()+" "+d1.getName());
	    	  System.out.println(Arrays.toString(d1.getStud()));
	      }

	}

}
