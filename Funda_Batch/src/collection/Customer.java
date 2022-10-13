package collection;

import java.util.ArrayList;

public class Customer 
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
		

	
		public String toString() 
		{
			return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
		}


		public static void main(String s[])
		{
			Customer c1=new Customer(1,"pooja","pune");
			Customer c2=new Customer(2,"Abhay","pune");
			Customer c3=new Customer(3,"shubham","mumbai");
			
			ArrayList<Customer> al=new ArrayList<Customer>();
			al.add(c1);
			al.add(c2);
			al.add(c3);
			
			System.out.println(al);
			}

	}


