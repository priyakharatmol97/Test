package stringinjava;

import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String str="All the Best";
		System.out.println("Given String is:"+str);
		char arr[]=str.toCharArray();
		
		System.out.println("Length of string is:"+str.length());
		System.out.println("Length of string is:"+arr.length);
		
		
		System.out.println("ENter character to be searched ");
		char ch=sc.next().charAt(0);
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(ch==arr[i])
			{
				cnt++;
				System.out.println("Character available at position"+(i+1));
			}
		}
		
		if(cnt>0)
		{
			System.out.println("Character found"+cnt+"times");
			
		}
		else
		{
			System.out.println("Character Not Found");
		}
		
		
		//find substring
		
		System.out.println("Find Substring");
		System.out.println("Enter start index");
		int start= sc.nextInt();
		System.out.println("Enter end index");
		int end= sc.nextInt();
		
		char subarray[]= new char[end-start+1];
		int j=0;
		for(int i=start;i<=end;i++)
		{
			subarray[j]=arr[i];
			j++;
		}
		
		String substr=new String(subarray);
		System.out.println("Substring:"+substr);
	}

}
