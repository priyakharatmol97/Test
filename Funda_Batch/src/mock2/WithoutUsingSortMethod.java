package mock2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class WithoutUsingSortMethod {

	public static void main(String[] args) 
	{
        ArrayList<String> al2=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
		
        for(int i=0;i<5;i++)
        {
        	al2.add(sc.next());
        }
        
        
        Object s[]=al2.toArray();
        
        for(int i=0;i<s.length;i++)
        {
        	for(int j=i+1;j<s.length;j++)
        	{
        		if(((String) s[i]).charAt(0)>((String) s[j]).charAt(0))
        		{
        			String temp=(String)s[i];
        			s[i]=s[j];
        			s[j]=temp;
        		}
        	}
        	
        }
        System.out.println(Arrays.toString(s));
        
       // or
       /* TreeSet<String> ts=new TreeSet<String>(al2);
        System.out.println(ts);*/
		

	}

}
