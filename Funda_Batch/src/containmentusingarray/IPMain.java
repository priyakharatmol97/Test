package containmentusingarray;

import java.util.Arrays;
import java.util.Scanner;

public class IPMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number Of Person : ");
		int personSize=sc.nextInt();
		
		Person p[]=new Person [personSize];      
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter Person  Id : ");
			int PersonId=sc.nextInt();
			System.out.println("Enter The Person  Name : ");
			String PersonName=sc.next();
			System.out.println("Enter The Person  Contact : ");
			String PersonContact=sc.next();
		
		System.out.println("Enter Number Of IdProof : ");
		int size=sc.nextInt();
		
		IdProof idp[]=new IdProof[size];               
		
		for(int j=0;j<size;j++)
		{
			System.out.println("Enter IdProof id :");
			int id=sc.nextInt();
			System.out.println("Enter IdProof Name :");
			String name=sc.next();
			
			
			IdProof idp2=new IdProof();
			
			idp2.setId(id);
			idp2.setName(name);
			
			
			idp[j]=idp2;	
			
		}
		Person p2=new Person();
		p2.setId(PersonId);
		p2.setName(PersonName);
		p2.setContact(PersonContact);
		p2.setIdp(idp);
		
		p[i]=p2;
	
		}
		for(Person p2:p)
		{
			System.out.println(p2.getId()+" \n"+p2.getName());
			System.out.println(Arrays.toString(p2.getIdp()));
		}

	}

}
