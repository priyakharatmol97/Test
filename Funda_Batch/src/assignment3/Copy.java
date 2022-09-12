package assignment3;

import java.util.Scanner;

public class Copy
{
	
	 int id;
	 String name,contact;
	  
	 
     Copy(int id, String name,String contact)
     { 
	         this.id = id;
	         this.name = name;
	         this.contact =contact;
	    }

	    
	     Copy(Copy obj)
	     {
	         this.id = obj.id;
	         this.name = obj.name;
	         this.contact = obj.contact;
	     }
		
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Id:");
			int id = sc.nextInt();
			System.out.println("Enter name:");
			String name = sc.next();
			System.out.println("Enter contact:");
			String contact = sc.next();
			
	
			 Copy obj1 = new Copy(id,name,contact);
			 System.out.println("**--------Details----------**");
			 System.out.println();
			 System.out.println(id+" "+name+" "+obj1.contact);
	        
	        
	         Copy obj2 = new Copy(obj1);
	         System.out.println(id+" "+name+" "+obj2.contact);
	        
		}

	}

/*Output:
 Enter Id:
101
Enter name:
Priya
Enter contact:
7977956202
**--------Details----------**

101 Priya 7977956202
101 Priya 7977956202

 */

	

