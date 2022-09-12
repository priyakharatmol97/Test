package assignment8;

import java.util.Scanner;

public class Encryption 
{

	static void encryption(String s1)
	{  
		String s2=s1.toUpperCase().substring(0, s1.length()-1);
		
		String arrs2[]=s2.split(" ");
		for(int i=0;i<arrs2.length;i++)
		{  
			int sum=0;
		 char arrs3[]=arrs2[i].toCharArray();
					for(int j=0;j<arrs3.length;j++)
					  {  
						if(arrs3[j]>='A'&& arrs3[j]<='Z')
						   { 
							int[] arrs4=new int[arrs3.length];
							 arrs4[j]=arrs3[j]-64;
							 sum=sum+(arrs3[j]-64);
						   }	
					  }
		System.out.println(arrs2[i]+" : "+sum);
		}
		 
	}
		public static void main(String[] args) {
	   Scanner s=new Scanner (System.in);
	   System.out.println("Enter String ");
	   String s1=s.nextLine();
	   Encryption.encryption(s1);
		}

	}
