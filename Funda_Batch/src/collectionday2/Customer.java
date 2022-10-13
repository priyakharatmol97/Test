package collectionday2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Customer implements Comparable<Customer>
{
	int id;
	String name;
	String address;
	
	public Customer(int id, String name, String address) 
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	

	@Override
	public String toString()
	{
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	@Override
	public int compareTo(Customer c1)
	{
		return this.name.compareTo(c1.name);
	}
	

	public static void main(String[] args) 
	{
		Customer c1=new Customer(1,"Pooja","pune");
		Customer c2=new Customer(2,"Abhay","pune");
		Customer c3=new Customer(3,"shubham","mumbai");
		
		ArrayList<Customer> al=new ArrayList<Customer>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		
		
        Iterator<Customer> it=al.iterator();


       /*while(it.hasNext())
         {
	       Customer c=   it.next();   
	         if(c.name.equals("Abhay"))
			   {
		         System.out.println(c);
			   }
         }*/
         while(it.hasNext())
           {
	        Customer c=   it.next();
           }
            Collections.sort(al);
	}

}
